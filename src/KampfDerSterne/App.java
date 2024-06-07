package KampfDerSterne;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws InterruptedException {
        // Initialisierung Planeten
        // Es ist möglich beliebig viele Planeten hinzuzufügen
        // Es ist möglich beliebig viele Monster hinzuzufügen
        // Es ist möglich beliebig viele Gegenstände hinzuzufügen
        Planet turanus = new Planet("Turanus");
        Planet zorgon = new Planet("Zorgon");
        Planet mars = new Planet("Mars");
        Planet heimatplanet = new Planet("Heimatplanet");
        // Initialisierung Monster
        // Turanus
        Monster spider = new Monster("Spinne", 10, 1);
        Monster Goblin = new Monster("Goblin", 25, 2);
        Monster Ork = new Monster("Ork", 50, 5);
        // Zorgon
        Monster dragon = new Monster("Drache", 100, 10);
        Monster fireGolem = new Monster("Feuergolem", 150, 12);
        Monster shadowWarrior = new Monster("Schattenkrieger", 200, 14);
        // Heimatplanet
        Monster hellDog = new Monster("Höllenhund", 500, 15);
        Monster demon = new Monster("Dämon", 1000, 19);
        Monster Kutuluk = new Monster("Kutuluk", 2000, 30);
        // Mars
        Monster donkeyKong = new Monster("Donkey Kong", 100, 10);
        Monster skorpion = new Monster("Skorpion", 150, 12);
        Monster alien = new Monster("Alien", 200, 14);
        // Initialisierung Gegenstände
        // Turanus
        Object fireball = new Object("Feuerball", 4);
        Object shadowSword = new Object("Schattenklinge", 6);
        Object skeletonArmor = new Object("Skeletrüstung", 4);
        // Zorgon
        Object sword = new Object("Schwert", 5);
        Object poisonFang = new Object("Giftzahn", 3);
        Object shield = new Object("Schild", 2);
        // Mars
        Object banana = new Object("Banane", 1);
        Object alienBlood = new Object("Alienblut", 6);
        Object skorpionTail = new Object("Skorpionstachel", 9);
        // Heimatplanet
        Object hellDogWhistle = new Object("Hundepfeife der Hölle", 10);
        Object demonicBlood = new Object("Dämonenblut", 15);
        // Monster Loot
        // Turanus
        Goblin.addLoot(sword);
        spider.addLoot(poisonFang);
        Ork.addLoot(shield);
        // Zorgon
        fireGolem.addLoot(fireball);
        shadowWarrior.addLoot(shadowSword);
        dragon.addLoot(skeletonArmor);
        // Mars
        donkeyKong.addLoot(banana);
        skorpion.addLoot(skorpionTail);
        alien.addLoot(alienBlood);
        // Heimatplanet
        hellDog.addLoot(hellDogWhistle);
        demon.addLoot(demonicBlood);
        // Monster hinzufügen
        // Turanus
        turanus.addMonster(spider);
        turanus.addMonster(Goblin);
        turanus.addMonster(Ork);
        // Zorgon
        zorgon.addMonster(dragon);
        zorgon.addMonster(fireGolem);
        zorgon.addMonster(shadowWarrior);
        // Mars
        mars.addMonster(donkeyKong);
        mars.addMonster(skorpion);
        mars.addMonster(alien);
        // Heimatplanet
        heimatplanet.addMonster(demon);
        heimatplanet.addMonster(hellDog);
        heimatplanet.addMonster(Kutuluk);
        // Alle Planeten in Array liste speichern
        ArrayList<Planet> planetArray = new ArrayList<>();
        planetArray.add(turanus);
        planetArray.add(zorgon);
        planetArray.add(mars);
        planetArray.add(heimatplanet);
        // Initialisierung der Textausgabe
        ConsoleHelper consoleHelper = new ConsoleHelper();
        // Ausgabe des anfangstexts
        consoleHelper.writeWelcomeMessage();
        TimeUnit.SECONDS.sleep(3);
        consoleHelper.writeText(consoleHelper.initialText);
        TimeUnit.SECONDS.sleep(2);
        // Eingabe zum erstellen des Spielers
        consoleHelper.writeText(consoleHelper.nameInputText);
        String name = System.console().readLine();
        String age = "";
        boolean validAge = false;
        while (!validAge) {
            consoleHelper.writeText(consoleHelper.ageInputText);
            age = System.console().readLine();
            validAge = consoleHelper.isInputInteger(age);
            if (!validAge) {
                consoleHelper.writeText(consoleHelper.invalidAgeText);
            }
        }
        Player player = new Player(name, Integer.parseInt(age), 1);
        consoleHelper.setPlayerGreetingTextWithParameter(player);
        consoleHelper.writeText(consoleHelper.playerGreetingText);
        boolean GameWon = false;
        TimeUnit.SECONDS.sleep(3);
        // Spielstart
        while (!GameWon) {
            consoleHelper.writeText(consoleHelper.planetSelectionText);
            for (int i = 0; i < planetArray.size(); i++) {
                System.out.println(
                        "[" + (i + 1) + "] " + "\u001B[31m" + planetArray.get(i).getName() + "\u001B[0m"
                                + " mit " + "\u001B[31m" + planetArray.get(i).getMonster().size() + "\u001B[0m"
                                + " Monstern");
            }
            System.out.println(
                    "[" + (planetArray.size() + 1) + "] " + "\u001B[31m" + "Inventar" + "\u001B[0m" + " verwalten");
            System.out.println("Bitte geben Sie eine ganze Zahl ein:");
            String selectedInput = System.console().readLine();
            boolean validInput = consoleHelper.isInputInRange(selectedInput, 0, planetArray.size() + 1);
            if (!validInput == true) {
                consoleHelper.setinvalidPlanetSelectionTextWithParameter(planetArray.size()+1);
                consoleHelper.writeText(consoleHelper.invalidPlanetSelectionText);
            } else {
                int planetInt = Integer.parseInt(selectedInput);
                if (planetInt == planetArray.size() + 1) {
                    player.manageInventory();
                } else {
                    planetArray.get(planetInt - 1).playerLandsOnPlanet(player);
                }
            }
        }
        consoleHelper.writeGameWonMessage();
    }
}