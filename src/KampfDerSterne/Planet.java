package KampfDerSterne;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Planet {
    private String name;
    private ArrayList<Monster> monster = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Planet(String name) {
        this.name = name;
    }

    public void addMonster(Monster monster) {
        this.monster.add(monster);
    }

    public void removeMonster(Monster monster) {
        this.monster.remove(monster);
    }

    public ArrayList<Monster> getMonster() {
        return monster;
    }

    public void Landung(Mensch spieler) {
        ConsoleHelper consoleHelper = new ConsoleHelper();
        consoleHelper.initiasiereplanetenLandungTextMitParameter(this);
        consoleHelper.schreibeText(consoleHelper.planetenLandungText);
        boolean verlassethis = false;
        while (verlassethis == false) {

            int AnzahlMonster = this.getMonster().size();
            if (AnzahlMonster == 0) {
                consoleHelper.schreibeText(consoleHelper.keinMonsterText);
                verlassethis = true;
            } else {
                consoleHelper.schreibeText(consoleHelper.monsterAuswahlText);
                for (int i = 0; i < AnzahlMonster; i++) {
                    System.out.println("[" + (i + 1) + "]" + "\u001B[31m" + this.getMonster().get(i).getName()
                            + "\u001B[0m" + " mit einer Stärke von " + "\u001B[31m" +  this.getMonster().get(i).getKraft()+ "\u001B[0m");
                }
                String AuswahlMonster = System.console().readLine();
                int optionMonster = Integer.parseInt(AuswahlMonster);
                boolean kampfGewonnen = spieler.starteKampf(this.getMonster().get(optionMonster - 1));
                if (kampfGewonnen == false) {
                    verlassethis = true;
                    consoleHelper.schreibeText(consoleHelper.kampfVerlorenText);
                } else {
                    this.removeMonster(this.getMonster().get(optionMonster - 1));
                }
                if (this.getMonster().size() == 0) {
                    consoleHelper.initiasiereplanetenBesiegtTextMitParameter(this);
                    consoleHelper.schreibeText(consoleHelper.planetenBesiegtText);
                    verlassethis = true;
                }
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //consoleHelper.leereKonsole();
            }
        }
    }
}
