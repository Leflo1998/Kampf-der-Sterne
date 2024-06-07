package KampfDerSterne;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Player {
    private String name;
    private int age;
    private int powerLevel;
    private ArrayList<Object> items = new ArrayList<>();
    private ConsoleHelper consoleHelper = new ConsoleHelper();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int alter) {
        this.age = alter;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int kraft) {
        this.powerLevel = kraft;
    }

    public void calculatePowerLevel() {
        int summe = 0;
        if (items.isEmpty()) {
            powerLevel = 1;
            return;
        }
        for (Object item : items) {
            summe += item.getPowerLevel();
        }
        powerLevel = summe + 1;
        setPowerLevel(powerLevel);
    }

    public ArrayList<Object> getItems() {
        return items;
    }

    public void addItem(Object item) {
        items.add(item);
        calculatePowerLevel();
    }

    public void removeItem(Object item) {
        items.remove(item);
        calculatePowerLevel();
    }

    public Player(String name, int age, int powerLevel) {
        this.name = name;
        this.age = age;
        this.powerLevel = powerLevel;
    }

    /**
     * 
     */
    public void manageInventory() {
        boolean leaveInventory = false;
        while (!leaveInventory) {
            consoleHelper.clearConsole();
            System.out.println("Inventar verwalten");
            int numberOfItems = items.size();
            for (int i = 0; i < items.size(); i++) {
                System.out.println("[" + (i + 1) + "] " + "\u001B[31m" + items.get(i).getName() + "\u001B[0m"
                        + " mit einer Stärke von " + "\u001B[31m" + items.get(i).getPowerLevel() + "\u001B[0m");
            }
            System.out.println("[" + (numberOfItems + 1) + "] " + "\u001B[31m" + "Nichts " + "\u001B[0m" + "ablegen");
            String input = System.console().readLine();
            int inputAsInt = Integer.parseInt(input);
            if (inputAsInt == numberOfItems + 1) {
                consoleHelper.writeText(consoleHelper.leaveInventoryText);
                leaveInventory = true;
            } else {
                if ((inputAsInt > 0) && (inputAsInt <= items.size())) {
                    consoleHelper.setRemoveItemTextWithParameter(items.get(inputAsInt - 1),
                            this);
                    removeItem(items.get(inputAsInt - 1));
                    consoleHelper.writeText(consoleHelper.removeItemText);
                } else {
                    consoleHelper.writeText(consoleHelper.wrongInput);
                }
            }
        }
    }

    public void dropItem(Monster monster) {
        if (items.size() > 0) {
            Random random = new Random();
            int maxItemToLoose = items.size();
            int lostItem = random.nextInt(0, maxItemToLoose);
            consoleHelper.setLostItemTextWithParameters(items.get(lostItem), monster);
            items.remove(lostItem);
            consoleHelper.writeText(consoleHelper.lostItemText);
        } else {
            consoleHelper.setNoItemLossTextWithParameter(monster);
            consoleHelper.writeText(consoleHelper.noItemToLossText);
        }
    }

    public void manageInventoryOverflow(Monster monster) {
        boolean inputValid = false;
        while (!inputValid) {
            consoleHelper.setFightWonWithFullInventoryTextWithParameter(monster.getLoot(), monster);
            consoleHelper.writeText(consoleHelper.fightWonWithFullInventoryText);
            for (int i = 0; i < items.size(); i++) {
                System.out.println(
                        "[" + (i + 1) + "] " + "\u001B[31m" + items.get(i).getName() + "\u001B[0m"
                                + " mit einer Stärke von " + "\u001B[31m" + items.get(i).getPowerLevel()
                                + "\u001B[0m");
            }
            System.out.println("[4] " + "\u001B[31m" + "Nichts " + "\u001B[0m" + "ablegen");
            String input = System.console().readLine();
            inputValid = consoleHelper.isInputInRange(input, 0, this.items.size() + 1);
            if (!inputValid) {
                consoleHelper.writeText(consoleHelper.wrongInput);
            } else {
                int inputAsInt = Integer.parseInt(input);
                switch (inputAsInt) {
                    case 1, 2, 3:
                        Object lostItem = items.get(inputAsInt - 1);
                        removeItem(items.get(inputAsInt - 1));
                        addItem(monster.getLoot());
                        calculatePowerLevel();
                        consoleHelper.setItemExchangeTextWithParameter(lostItem,
                                monster.getLoot(), this);
                        consoleHelper.writeText(consoleHelper.itemExchangeText);
                        inputValid = true;
                        break;
                    case 4:
                        consoleHelper.writeText(consoleHelper.noItemExchangeText);
                        inputValid = true;
                        break;
                    default:
                        consoleHelper.writeText(consoleHelper.wrongInput);
                        break;
                }
            }
        }
    }

    public boolean fight(Monster monster) {
        if (powerLevel >= monster.getPowerLevel()) {
            consoleHelper.writeWonMessage();
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (items.size() >= 3) {
                manageInventoryOverflow(monster);
            } else {
                addItem(monster.getLoot());
                calculatePowerLevel();
                consoleHelper.setFightWonTextWithParameters(this, monster);
                consoleHelper.writeText(consoleHelper.fightWonText);
            }
            return true;
        } else {
            dropItem(monster);
            return false;
        }
    }

}
