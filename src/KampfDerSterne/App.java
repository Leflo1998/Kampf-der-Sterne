package KampfDerSterne;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws InterruptedException {
        // Initialisierung Planeten
        Planet Turanus = new Planet("Turanus");
        Planet Zorgon = new Planet("Zorgon");
        Planet Heimatplanet = new Planet("Heimatplanet");
        // Initialisierung Monster
        // Turanus
        Monster Spinne = new Monster("Spinne", 10, 1);
        Monster Goblin = new Monster("Goblin", 25, 2);
        Monster Ork = new Monster("Ork", 50, 5);
        // Zorgon
        Monster Drache = new Monster("Drache", 100, 10);
        Monster Feuergolem = new Monster("Feuergolem", 150, 12);
        Monster Schattenkrieger = new Monster("Schattenkrieger", 200, 15);
        // Heimatplanet
        Monster Höllenhund = new Monster("Höllenhund", 500, 20);
        Monster Dämon = new Monster("Dämon", 1000, 25);
        Monster Katuluk = new Monster("Katuluk", 2000, 200);
        // Initialisierung Gegenstände
        // Turanus
        Gegenstand Feuerball = new Gegenstand("Feuerball", 4);
        Gegenstand Schattenklinge = new Gegenstand("Schattenklinge", 3);
        Gegenstand Skeletrüstung = new Gegenstand("Skeletrüstung", 4);
        // Zorgon
        Gegenstand Schwert = new Gegenstand("Schwert", 5);
        Gegenstand Giftzahn = new Gegenstand("Giftzahn", 3);
        Gegenstand Schild = new Gegenstand("Schild", 2);
        // Heimatplanet
        Gegenstand Hundepfeife = new Gegenstand("Hundepfeife der Hölle", 10);
        Gegenstand Dämonenblut = new Gegenstand("Hundepfeife der Hölle", 15);

        // Monster Loot
        // Turanus
        Goblin.addLoot(Schwert);
        Spinne.addLoot(Giftzahn);
        Ork.addLoot(Schild);
        // Zorgon
        Feuergolem.addLoot(Feuerball);
        Schattenkrieger.addLoot(Schattenklinge);
        Drache.addLoot(Skeletrüstung);
        // Heimatplanet
        Höllenhund.addLoot(Hundepfeife);
        Dämon.addLoot(Dämonenblut);
        // Monster hinzufügen
        // Turanus
        Turanus.addMonster(Spinne);
        Turanus.addMonster(Goblin);
        Turanus.addMonster(Ork);
        // Zorgon
        Zorgon.addMonster(Drache);
        Zorgon.addMonster(Feuergolem);
        Zorgon.addMonster(Schattenkrieger);
        // Heimatplanet
        Heimatplanet.addMonster(Katuluk);
        ConsoleHelper consoleHelper = new ConsoleHelper();
        // Ausgabe des anfangstexts
        consoleHelper.schreibeLogo();
        TimeUnit.SECONDS.sleep(3);
        consoleHelper.schreibeText(consoleHelper.anfangstext);
        TimeUnit.SECONDS.sleep(2);
        // Eingabe zum erstellen des Spielers
        consoleHelper.schreibeText(consoleHelper.NameEingabeText);
        String name = System.console().readLine();
        consoleHelper.schreibeText(consoleHelper.alterEingabeText);
        String alter = System.console().readLine();
        Mensch spieler = new Mensch(name, Integer.parseInt(alter), 1);
        consoleHelper.initiasiereAnfangsTextMitParameter(spieler);
        consoleHelper.schreibeText(consoleHelper.begrueßungSpielerText);
        boolean GameWon = false;
        TimeUnit.SECONDS.sleep(3);
        // Spielstart
        while (!GameWon) {
            consoleHelper.schreibeText(consoleHelper.planetenAuswahlText);
            System.out.println("[1] " +"\u001B[31m" + Turanus.getName()+ "\u001B[0m");
            System.out.println("[2] " +"\u001B[31m" + Zorgon.getName()+ "\u001B[0m");
            System.out.println("[3] " +"\u001B[31m" +  Heimatplanet.getName()+ "\u001B[0m");
            String input = System.console().readLine();
            int optionPlanet = Integer.parseInt(input);
            switch (optionPlanet) {
                case 1:
                    Turanus.Landung(spieler);
                    break;
                case 2:
                    Zorgon.Landung(spieler);
                    break;
                case 3:
                    Heimatplanet.Landung(spieler);
                    break;
                default:
                    consoleHelper.schreibeText(consoleHelper.falscheEingabeBeiPlanetenauswahlText);
                    TimeUnit.SECONDS.sleep(1);
                    System.out.print(".");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.print(".");
                    TimeUnit.SECONDS.sleep(1);
                    // consoleHelper.leereKonsole();
                    break;
            }
        }
    }
}
