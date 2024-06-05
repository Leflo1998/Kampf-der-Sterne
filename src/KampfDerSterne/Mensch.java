package KampfDerSterne;

import java.util.ArrayList;

public class Mensch {
    private String name;
    private int alter;
    private int kraft;
    private ArrayList<Gegenstand> gegenstaende = new ArrayList<>();
    private ConsoleHelper consoleHelper = new ConsoleHelper();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getKraft() {
        return kraft;
    }

    public void setKraft(int kraft) {
        this.kraft = kraft;
    }

    public void berechnekraft() {
        int summe = 0;
        if (gegenstaende.isEmpty()) {
            kraft = 1;
            return;
        }
        for (Gegenstand gegenstand : gegenstaende) {
            summe += gegenstand.getKraft();
        }
        kraft = summe + 1;
        setKraft(kraft);
    }

    public ArrayList<Gegenstand> getGegenstaende() {
        return gegenstaende;
    }

    public void addGegenstand(Gegenstand gegenstand) {
        gegenstaende.add(gegenstand);
        berechnekraft();
    }

    public void removeGegenstand(Gegenstand gegenstand) {
        gegenstaende.remove(gegenstand);
        berechnekraft();
    }

    public Mensch(String name, int alter, int kraft) {
        this.name = name;
        this.alter = alter;
        this.kraft = kraft;
    }

    public boolean starteKampf(Monster monster) {
        if (this.kraft >= monster.getKraft()) {
            if (this.gegenstaende.size() >= 3) {
                boolean inputValid = false;
                while (!inputValid) {
                    consoleHelper.initiasiereKampfGewonnenMitVollemInventarTextMitParameter(monster.getLoot(), monster);
                    consoleHelper.schreibeText(consoleHelper.kampfGewonnenMitVollemInventarText);
                    for (int i = 0; i < gegenstaende.size(); i++) {
                        System.out.println(
                                "[" + (i + 1) + "] " + "\u001B[31m" + gegenstaende.get(i).getName() + "\u001B[0m"
                                        + " mit einer Stärke von " + "\u001B[31m" + gegenstaende.get(i).getKraft()
                                        + "\u001B[0m");
                    }
                    System.out.println("[4] " + "\u001B[31m"+ "Nichts "+"\u001B[0m" +"ablegen" );
                    String input = System.console().readLine();
                    int option = Integer.parseInt(input);
                    switch (option) {
                        case 1,2,3:
                            removeGegenstand(gegenstaende.get(option - 1));
                            Gegenstand abgelegeterGegenstand = gegenstaende.get(option - 1);
                            addGegenstand(monster.getLoot());
                            berechnekraft();
                            consoleHelper.initialisiereTauscheGegenstaendeTextMitParameter(abgelegeterGegenstand, monster.getLoot(), this);
                            consoleHelper.schreibeText(consoleHelper.tauscheGegenstaendeText);
                            inputValid = true;
                            break;
                        case 4:
                            consoleHelper.schreibeText(consoleHelper.keinGegenstandTauschText);
                            inputValid = true;
                            break;
                        default:
                            consoleHelper.schreibeText(consoleHelper.falscheEingabeBeiGegenstandTauschText);
                            break;
                    }
                }
            } else {
                addGegenstand(monster.getLoot());
                berechnekraft();
                consoleHelper.initiasiereKampfGewonnenTextMitParameter(this, monster);
                consoleHelper.schreibeText(consoleHelper.kampfGewonnenText);

            }
            return true;
        } else {
            System.out.println("Du hast gegen das Monster " + monster.getName() + " kläglich versagt!");
            return false;
        }
    }

}
