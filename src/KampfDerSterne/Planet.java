package KampfDerSterne;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Planet {
    // Attribute
    private String name;
    private ArrayList<Monster> monster = new ArrayList<>();

    // Konstruktor
    public Planet(String name) {
        this.name = name;
    }

    // Methoden
    public String getName() {
        return name;
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

    public void playerLandsOnPlanet(Player player) {
        // Textausgabe
        ConsoleHelper consoleHelper = new ConsoleHelper();
        consoleHelper.printSpaceshipAnimation();
        consoleHelper.setPlanetLandingTextWithParameter(this);
        consoleHelper.writeText(consoleHelper.planetLandingText);
        boolean leavePlanet = false;
        while (leavePlanet == false) {
            int numberOfMonsters = this.getMonster().size();
            // Prüfung ob keine Monster auf dem Planeten sind vor der Landung
            if (numberOfMonsters == 0) {
                // Verlasse leeren Planeten
                consoleHelper.writeText(consoleHelper.noMoreMonstersOnThisPlanetText);
                leavePlanet = true;
            } else {
                // Monsterauswahl
                consoleHelper.writeText(consoleHelper.MonsterSelectionText);
                for (int i = 0; i < numberOfMonsters; i++) {
                    System.out.println("[" + (i + 1) + "] " + "\u001B[31m" + this.getMonster().get(i).getName()
                            + "\u001B[0m" + " mit einer Stärke von " + "\u001B[31m"
                            + this.getMonster().get(i).getPowerLevel() + "\u001B[0m");
                }
                System.out.println("[" + (numberOfMonsters + 1) + "] " + "\u001B[31m" + "Flüchte" + "\u001B[0m"
                        + " zurück ins Weltall");
                // Eingabe
                String selectedInput = System.console().readLine();
                boolean validInput = consoleHelper.isInputInRange(selectedInput, 0, numberOfMonsters + 1);
                if (!validInput == true) {
                    consoleHelper.writeText(consoleHelper.wrongInput);
                } else {
                    int selectedInputInt = Integer.parseInt(selectedInput);
                    if (selectedInputInt == numberOfMonsters + 1) {
                        // Verlasse Planet
                        leavePlanet = true;
                    } else {
                        // Kampf
                        boolean fightWon = player.fight(this.getMonster().get(selectedInputInt - 1));
                        if (fightWon == false) {
                            leavePlanet = true;
                        } else {
                            this.removeMonster(this.getMonster().get(selectedInputInt - 1));
                        }
                        // Prüfung ob keine Monster mehr auf dem Planeten sind
                        if (this.getMonster().size() == 0) {
                            consoleHelper.setPlanetFinishedTextWithParameter(this);
                            consoleHelper.writeText(consoleHelper.PlanetFinishedText);
                            leavePlanet = true;
                        }
                        try {
                            TimeUnit.SECONDS.sleep(2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
