package KampfDerSterne;

import java.util.concurrent.TimeUnit;

public class ConsoleHelper {

        public String[][] initialText = {
                        { "Willkommen", "bei", "\u001B[31m", "Kampf", "der", "Sterne!", "\u001B[0m" },
                        { "Dein", "Heimatplanet", "wurde", "durch", "\u001B[31m", "Kutuluk", "\u001B[0m", ", ", "einem",
                                        "Mächtigen", "Monster,", "angegriffen." },
                        { "Dein", "Ziel", "ist", "es", "\u001B[31m", "Kutuluk", "\u001B[0m", ", ", "zu", "besiegen",
                                        "und", "deinen", "Heimatplaneten", "zu",
                                        "retten." },
                        { "Leider", "bist", "du", "noch", "viel", "zu", "schwach", "um", "\u001B[31m", "Kutuluk",
                                        "\u001B[0m", ", ", "zu", "besiegen." },
                        { "Du", "musst", "stärker", "werden,", "indem", "du", "von", "Planet", "zu", "Planet", "reist",
                                        "und",
                                        "gegen", "Monster", "kämpfst." },
                        { "Monster", "können", "Gegenstände", "droppen,", "die", "dir", "helfen", "stärker", "zu",
                                        "werden." },
                        { "Du", "kannst", "maximal", "\u001B[31m", "drei", "Gegenstände", "\u001B[0m", "gleichzeitig",
                                        "tragen." },
                        { "Doch", "sei", "gewarnt...", "wenn", "du", "gegen", "ein", "Monster", "verlierst",
                                        "passieren", "\u001B[31m",
                                        "schlimme", "Dinge.", "\u001B[0m" },
                        { "Viel", "Glück...", "Achso", "wie", "war", "nochmal", "dein", "Name?" }
        };

        public String[][] endText = {
                        { "Du", "hast", "es", "geschafft,", "\u001B[31m", "Kutuluk", "\u001B[0m", "zu", "besiegen",
                                        "und", "deinen", "Heimatplaneten", "zu",
                                        "retten." },
                        { "Dein", "Mut", "und", "deine", "Stärke", "haben", "sich", "ausgezahlt." },
                        { "Dein", "Heimatplanet", "ist", "dir", "für", "immer", "dankbar." },
                        { "Du", "bist", "ein", "wahrer", "Held,", "der", "in", "die", "Geschichte", "eingehen",
                                        "wird." },
                        { "Möchtest", "du", "nochmal", "spielen?" }
        };
        public String[][] nameInputText = {
                        { "Bitte", "gib", "deinen", "Namen", "ein:" }
        };
        public String[][] ageInputText = {
                        { "Bitte", "gib", "dein", "Alter", "ein:" }
        };
        public String[][] planetSelectionText = {
                        { "Du", "befindest", "dich", "in", "deinem", "Raumschiff", "und", "fliegst", "verloren",
                                        "durch", "das",
                                        "Weltall." },
                        { "Du", "siehst", "ein", "paar", "\u001B[31m", "Planeten", "\u001B[0m", "in", "der", "Ferne.",
                                        "Welchen", "möchtest", "du",
                                        "anfliegen?" }
        };
        public String[][] invalidPlanetSelectionText = {
                        { "Um", "ehrlich", "zu", "sein", "weiß", "ich", "nicht", "wie", "du", "hier", "überleben",
                                        "willst,",
                                        "wenn", "du", "nichtmal", "eine", "Zahl", "zwischen", "\u001B[31m", "1", "bis",
                                        "", "\u001B[0m",
                                        "eingeben", "kannst", "..." },
                        { "Naja", "selbst", "ein", "\u001B[31m", "blindes", "Huhn", "\u001B[0m", "findet", "mal", "ein",
                                        "Korn.", "Versuch", "es",
                                        "nochmal." }
        };
        public String[][] playerGreetingText = {
                        { "Hallo", "\u001B[31m", "", "\u001B[0m", "du", "bist", "\u001B[31m", "", "\u001B[0m", "Jahre",
                                        "alt",
                                        "und", "hast", "eine", "Stärke", "von", "\u001B[31m", "", "\u001B[0m" },
                        { "Bist", "du", "bereit", "für", "dein", "Abenteuer?", "Ach", "ist", "auch", "egal,", "du",
                                        "hast", "keine",
                                        "Wahl.", "Los", "geht's!" }
        };
        public String[][] MonsterSelectionText = {
                        { "Du", "siehst", "ein", "paar", "Monster", "in", "der", "Ferne.", "Welches", "möchtest", "du",
                                        "bekämpfen?" }
        };
        public String[][] planetLandingText = {
                        { "Du", "bist", "auf", "dem", "Planeten", "", "gelandet." }
        };

        public String[][] PlanetFinishedText = {
                        { "Du", "hast", "alle", "Monster", "auf", "", "besiegt!", "Du", "bist", "bereit", "für", "die",
                                        "nächste",
                                        "Herausforderung!" }
        };
        public String[][] fightWonText = {
                        { "Du", "hast", "das", "Monster:", "\u001B[31m", "", "\u001B[0m", "besiegt!" },
                        { "Du", "hast", "den", "Gegenstand:", "\u001B[31m", "", "\u001B[0m", "gefunden!" },
                        { "Deine", "Stärke", "beträgt", "nun", "\u001B[31m", "", "\u001B[0m" }
        };
        public String[][] fightWonWithFullInventoryText = {
                        { "Du", "hast", "das", "Monster", "\u001B[31m", "", "\u001B[0m", "besiegt!" },
                        { "Du", "hast", "den", "Gegenstand:", "\u001B[31m", "", "\u001B[0m", "gefunden!" },
                        { "Leider", "hast", "zu", "viele", "Gegenstände", "im", "Inventar", "und", "musst", "einen",
                                        "ablegen,", "wenn",
                                        "du", "den", "Gegenstand:", "\u001B[31m", "", "\u001B[0m", "mit", "einer",
                                        "Kraft", "von",
                                        "\u001B[31m", "", "\u001B[0m", "aufnehmen", "möchtest." },
                        { "Welchen", "Gegenstand", "möchtest", "du", "ablegen?" }
        };
        public String[][] noMoreMonstersOnThisPlanetText = {
                        { "Es", "gibt", "keine", "Monster", "mehr", "auf", "diesem", "Planeten." }
        };

        public String[][] wrongInput = {
                        { "Das", "ist", "keine", "Option...", "Naja", "von", "einem", "Menschen", "hätte", "ich",
                                        "nichts",
                                        "anderes", "erwartet.", "Versuche", "es", "erneut!" }
        };
        public String[][] noItemExchangeText = {
                        { "Du", "willst", "keinen", "Gegenstand", "tauschen.", "Ob", "das", "so", "eine", "gute",
                                        "Idee", "ist...",
                                        "Naja", "du", "wirst", "schon", "sehen." }
        };
        public String[][] itemExchangeText = {
                        { "Du", "hast", "den", "Gegenstand:", "\u001B[31m", "", "\u001B[0m", "abgelegt." },
                        { "Du", "hast", "den", "Gegenstand:", "\u001B[31m", "", "\u001B[0m", "aufgenommen." },
                        { "Deine", "Stärke", "beträgt", "nun", "\u001B[31m", "", "\u001B[0m" },
                        { "Hoffen", "wir", "mal", "das", "war", "eine", "gute", "Entscheidung..." }
        };
        public String[][] lostItemText = {
                        { "Tja,", "das", "Monster: ", "\u001B[31m", "", "\u001B[0m", " hat", "dich", "erwischt", "...",
                                        "wie", "vorhergesagt!" },
                        { "Hättest", "du", "mal", "besser", "auf", "unsere", "Warnung", "gehört." },
                        { "Du", "verlierst", "den", "Gegenstand:", "\u001B[31m", "", "\u001B[0m" },
                        { "Versuch's", "nochmal,", "vielleicht", "lernst", "du", "ja", "draus." }
        };
        public String[][] noItemToLossText = {
                        { "Puh,", "das", "Monster:", "\u001B[31m", "", "\u001B[0m", " hat", "dich", "erledigt!",
                                        "Wenigstens", "hattest", "du", "nichts", "Wertvolles", "dabei." },
                        { "Versuch's", "einfach", "nochmal", "-", "schlechter", "kann's", "ja", "kaum", "werden!" }
        };
        public String[][] removeItemText = {
                        { "Wie,", "du", "meinst,", "aber", "ich", "hätte", "das", "nicht", "gemacht", },
                        { "Du", "hast", "den", "Gegenstand:", "\u001B[31m", "", "\u001B[0m", "abgelegt." },
                        { "Deine", "Stärke", "beträgt", "nun", "\u001B[31m", "", "\u001B[0m" }
        };
        public String[][] leaveInventoryText = {
                        { "Tja", "wer", "\u001B[31m", "nichts", "\u001B[0m", "hat", "kann", "auch", "nichts", "ablegen",
                                        "...", "oder", "irgendwie", "so." }
        };
        public String[][] invalidAgeText = {
                        { "In", "diesem", "Universum", "gibt", "es", "nur", "Altersangaben", "in", "\u001B[31m",
                                        "ganzen", "Zahlen.", "\u001B[0m", "Das", "fängt", "ja", "schon", "gut",
                                        "an..." }
        };

        // Funktionen zum setzte der Texte
        public void setinvalidPlanetSelectionTextWithParameter(int maxInput) {
                invalidPlanetSelectionText[0][21] = Integer.toString(maxInput);
        }

        public void setRemoveItemTextWithParameter(Object gegenstand, Player player) {
                removeItemText[1][5] = gegenstand.getName();
                removeItemText[2][5] = String.valueOf(player.getPowerLevel());
        }

        public void setLostItemTextWithParameters(Object gegenstand, Monster monster) {
                lostItemText[0][4] = monster.getName();
                lostItemText[2][5] = gegenstand.getName();
        }

        public void setNoItemLossTextWithParameter(Monster monster) {
                noItemToLossText[0][4] = monster.getName();
        }

        public void setItemExchangeTextWithParameter(Object gegenstand1, Object gegenstand2,
                        Player spieler) {
                itemExchangeText[0][5] = gegenstand1.getName();
                itemExchangeText[1][5] = gegenstand2.getName();
                itemExchangeText[2][5] = String.valueOf(spieler.getPowerLevel());
        }

        public void setFightWonWithFullInventoryTextWithParameter(Object gegenstand, Monster monster) {
                fightWonWithFullInventoryText[0][5] = monster.getName();
                fightWonWithFullInventoryText[1][5] = monster.getLoot().getName();
                fightWonWithFullInventoryText[2][16] = gegenstand.getName();
                fightWonWithFullInventoryText[2][23] = String.valueOf(gegenstand.getPowerLevel());
        }

        public void setFightWonTextWithParameters(Player spieler, Monster monster) {
                fightWonText[0][5] = monster.getName();
                fightWonText[1][5] = monster.getLoot().getName();
                fightWonText[2][5] = String.valueOf(spieler.getPowerLevel());
        }

        public void setPlayerGreetingTextWithParameter(Player spieler) {
                playerGreetingText[0][2] = spieler.getName();
                playerGreetingText[0][7] = String.valueOf(spieler.getAge());
                playerGreetingText[0][17] = String.valueOf(spieler.getPowerLevel());
        }

        public void setPlanetLandingTextWithParameter(Planet planet) {
                planetLandingText[0][5] = planet.getName();
        }

        public void setPlanetFinishedTextWithParameter(Planet planet) {
                PlanetFinishedText[0][5] = planet.getName();
        }

        // Funktionen zur Überprüfung der Eingabe
        public boolean isInputInRange(String input, int min, int max) {
                try {
                        Integer.parseInt(input);
                        if (Integer.parseInt(input) < min || Integer.parseInt(input) > max) {
                                return false;
                        }
                        return true;
                } catch (NumberFormatException e) {
                        return false;
                }
        }

        public boolean isInputInteger(String input) {
                try {
                        Integer.parseInt(input);
                        return true;
                } catch (NumberFormatException e) {
                        return false;
                }
        }

        // Funktionen zur Textausgabe
        public void clearConsole() {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.print("\033[0;0H");
        }

        public void writeText(String[][] text) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.print("\033[0;0H");

                for (String[] sentence : text) {
                        for (String word : sentence) {
                                for (char charValue : word.toCharArray()) {
                                        System.out.print(charValue);
                                        try {
                                                TimeUnit.MILLISECONDS.sleep(40);
                                        } catch (InterruptedException e) {
                                                e.printStackTrace();
                                        }
                                }
                                if ((word != "\u001B[31m") && (word != "\u001B[0m") && (word != ",") && (word != ".")) {
                                        System.out.print(" ");
                                }
                        }
                        System.out.println();
                }
                try {
                        TimeUnit.MILLISECONDS.sleep(700);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
                System.out.flush();
        }

        public void writeGameWonMessage() {
                String gameWonMessage = "███████╗██████╗ ██╗███████╗██╗          ██████╗ ███████╗██╗    ██╗ ██████╗ ███╗   ██╗███╗   ██╗███████╗███╗   ██╗\r\n"
                                +
                                "██╔════╝██╔══██╗██║██╔════╝██║         ██╔════╝ ██╔════╝██║    ██║██╔═══██╗████╗  ██║████╗  ██║██╔════╝████╗  ██║\r\n"
                                +
                                "███████╗██████╔╝██║█████╗  ██║         ██║  ███╗█████╗  ██║ █╗ ██║██║   ██║██╔██╗ ██║██╔██╗ ██║█████╗  ██╔██╗ ██║\r\n"
                                +
                                "╚════██║██╔═══╝ ██║██╔══╝  ██║         ██║   ██║██╔══╝  ██║███╗██║██║   ██║██║╚██╗██║██║╚██╗██║██╔══╝  ██║╚██╗██║\r\n"
                                +
                                "███████║██║     ██║███████╗███████╗    ╚██████╔╝███████╗╚███╔███╔╝╚██████╔╝██║ ╚████║██║ ╚████║███████╗██║ ╚████║\r\n";
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.print("\033[0;0H");
                System.out.print(gameWonMessage);
        }

        public void writeWelcomeMessage() {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.print("\033[0;0H");
                String welcomeMessage = "██╗    ██╗██╗██╗     ██╗     ██╗  ██╗ ██████╗ ███╗   ███╗███╗   ███╗███████╗███╗   ██╗    ██████╗ ███████╗██╗███╗   ███╗\r\n"
                                +
                                "██║    ██║██║██║     ██║     ██║ ██╔╝██╔═══██╗████╗ ████║████╗ ████║██╔════╝████╗  ██║    ██╔══██╗██╔════╝██║████╗ ████║\r\n"
                                +
                                "██║ █╗ ██║██║██║     ██║     █████╔╝ ██║   ██║██╔████╔██║██╔████╔██║█████╗  ██╔██╗ ██║    ██████╔╝█████╗  ██║██╔████╔██║\r\n"
                                +
                                "██║███╗██║██║██║     ██║     ██╔═██╗ ██║   ██║██║╚██╔╝██║██║╚██╔╝██║██╔══╝  ██║╚██╗██║    ██╔══██╗██╔══╝  ██║██║╚██╔╝██║\r\n"
                                +
                                "╚███╔███╔╝██║███████╗███████╗██║  ██╗╚██████╔╝██║ ╚═╝ ██║██║ ╚═╝ ██║███████╗██║ ╚████║    ██████╔╝███████╗██║██║ ╚═╝ ██║\r\n"
                                +
                                " ╚══╝╚══╝ ╚═╝╚══════╝╚══════╝╚═╝  ╚═╝ ╚═════╝ ╚═╝     ╚═╝╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝    ╚═════╝ ╚══════╝╚═╝╚═╝     ╚═╝\r\n"
                                +
                                "                                                                                                                       \r\n"
                                +
                                "██╗  ██╗ █████╗ ███╗   ███╗██████╗ ███████╗    ██████╗ ███████╗██████╗     ███████╗████████╗███████╗██████╗ ███╗   ██╗███████╗\r\n"
                                +
                                "██║ ██╔╝██╔══██╗████╗ ████║██╔══██╗██╔════╝    ██╔══██╗██╔════╝██╔══██╗    ██╔════╝╚══██╔══╝██╔════╝██╔══██╗████╗  ██║██╔════╝\r\n"
                                +
                                "█████╔╝ ███████║██╔████╔██║██████╔╝█████╗      ██║  ██║█████╗  ██████╔╝    ███████╗   ██║   █████╗  ██████╔╝██╔██╗ ██║█████╗  \r\n"
                                +
                                "██╔═██╗ ██╔══██║██║╚██╔╝██║██╔═══╝ ██╔══╝      ██║  ██║██╔══╝  ██╔══██╗    ╚════██║   ██║   ██╔══╝  ██╔══██╗██║╚██╗██║██╔══╝  \r\n"
                                +
                                "██║  ██╗██║  ██║██║ ╚═╝ ██║██║     ██║         ██████╔╝███████╗██║  ██║    ███████║   ██║   ███████╗██║  ██║██║ ╚████║███████╗\r\n"
                                +
                                "╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝     ╚═╝         ╚═════╝ ╚══════╝╚═╝  ╚═╝    ╚══════╝   ╚═╝   ╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝╚══════╝\r\n";
                System.out.print(welcomeMessage);
        }

        public void writeWonMessage() {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.print("\033[0;0H");
                // Webseite:
                // https://www.patorjk.com/software/taag/#p=display&f=ANSI%20Shadow&t=Gewonnen
                // Schriftart: ANSI Shadow
                String wonGame = " ██████╗ ███████╗██╗    ██╗ ██████╗ ███╗   ██╗███╗   ██╗███████╗███╗   ██╗\r\n"
                                +
                                "██╔════╝ ██╔════╝██║    ██║██╔═══██╗████╗  ██║████╗  ██║██╔════╝████╗  ██║\r\n" +
                                "██║  ███╗█████╗  ██║ █╗ ██║██║   ██║██╔██╗ ██║██╔██╗ ██║█████╗  ██╔██╗ ██║\r\n" +
                                "██║   ██║██╔══╝  ██║███╗██║██║   ██║██║╚██╗██║██║╚██╗██║██╔══╝  ██║╚██╗██║\r\n" +
                                "╚██████╔╝███████╗╚███╔███╔╝╚██████╔╝██║ ╚████║██║ ╚████║███████╗██║ ╚████║\r\n" +
                                "╚═════╝ ╚══════╝ ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═══╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═══╝";

                System.out.print(wonGame);
        }

        public void printSpaceshipAnimation() {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.print("\033[0;0H");
                String picture[] = new String[76];
                picture[0] = "                                                             `. ___\r\n" +
                                "                                                            __,' __`.                _..----....____\r\n"
                                +
                                "                                                __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                                          _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n"
                                +
                                "                                        ,'________________                           `-._`-','\r\n"
                                +
                                "                                         `._              ```````````------...___   '-.._'-:\r\n"
                                +
                                "                                            ```--.._      ,.                     ````--...__ -.\r\n"
                                +
                                "                                                    `.--. `-`                       ____    |  |`\r\n"
                                +
                                "                                                      `. `.                       ,'`````.  ;  ;`\r\n"
                                +
                                "                                                        `._`.        __________   `.      \'__/`\r\n"
                                +
                                "                                                           `-:._____/______/___/____`.       `\r\n"
                                +
                                "                                                                       |       `._    `.    \\r\n"
                                +
                                "                                                                       `._________`-.   `.   `.___\r\n"
                                +
                                "                                                                                     SSt  `------'`\r\n";
                picture[1] = "                                                            `. ___\r\n" +
                                "                                                           __,' __`.                _..----....____\r\n"
                                +
                                "                                               __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                                         _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n"
                                +
                                "                                       ,'________________                           `-._`-','\r\n"
                                +
                                "                                        `._              ```````````------...___   '-.._'-:\r\n"
                                +
                                "                                           ```--.._      ,.                     ````--...__ -.\r\n"
                                +
                                "                                                   `.--. `-`                       ____    |  |`\r\n"
                                +
                                "                                                     `. `.                       ,'`````.  ;  ;`\r\n"
                                +
                                "                                                       `._`.        __________   `.      \'__/`\r\n"
                                +
                                "                                                          `-:._____/______/___/____`.       `\r\n"
                                +
                                "                                                                      |       `._    `.    \\r\n"
                                +
                                "                                                                      `._________`-.   `.   `.___\r\n"
                                +
                                "                                                                                    SSt  `------'`\r\n";
                picture[2] = "                                                           `. ___\r\n" +
                                "                                                          __,' __`.                _..----....____\r\n"
                                +
                                "                                              __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                                        _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n"
                                +
                                "                                      ,'________________                           `-._`-','\r\n"
                                +
                                "                                       `._              ```````````------...___   '-.._'-:\r\n"
                                +
                                "                                          ```--.._      ,.                     ````--...__ -.\r\n"
                                +
                                "                                                  `.--. `-`                       ____    |  |`\r\n"
                                +
                                "                                                    `. `.                       ,'`````.  ;  ;`\r\n"
                                +
                                "                                                      `._`.        __________   `.      \'__/`\r\n"
                                +
                                "                                                         `-:._____/______/___/____`.       `\r\n"
                                +
                                "                                                                     |       `._    `.    \\r\n"
                                +
                                "                                                                     `._________`-.   `.   `.___\r\n"
                                +
                                "                                                                                    SSt  `------'`\r\n";
                picture[3] = "                                                          `. ___\r\n" +
                                "                                                         __,' __`.                _..----....____\r\n"
                                +
                                "                                             __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                                       _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n"
                                +
                                "                                     ,'________________                           `-._`-','\r\n"
                                +
                                "                                      `._              ```````````------...___   '-.._'-:\r\n"
                                +
                                "                                         ```--.._      ,.                     ````--...__ -.\r\n"
                                +
                                "                                                 `.--. `-`                       ____    |  |`\r\n"
                                +
                                "                                                   `. `.                       ,'`````.  ;  ;`\r\n"
                                +
                                "                                                     `._`.        __________   `.      \'__/`\r\n"
                                +
                                "                                                        `-:._____/______/___/____`.       `\r\n"
                                +
                                "                                                                    |       `._    `.    \\r\n"
                                +
                                "                                                                    `._________`-.   `.   `.___\r\n"
                                +
                                "                                                                                   SSt  `------'`\r\n";
                picture[4] = "                                                         `. ___\r\n" +
                                "                                                        __,' __`.                _..----....____\r\n"
                                +
                                "                                            __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                                      _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n"
                                +
                                "                                    ,'________________                           `-._`-','\r\n"
                                +
                                "                                     `._              ```````````------...___   '-.._'-:\r\n"
                                +
                                "                                        ```--.._      ,.                     ````--...__ -.\r\n"
                                +
                                "                                                `.--. `-`                       ____    |  |`\r\n"
                                +
                                "                                                  `. `.                       ,'`````.  ;  ;`\r\n"
                                +
                                "                                                    `._`.        __________   `.      \'__/`\r\n"
                                +
                                "                                                       `-:._____/______/___/____`.       `\r\n"
                                +
                                "                                                                   |       `._    `.    \\r\n"
                                +
                                "                                                                   `._________`-.   `.   `.___\r\n"
                                +
                                "                                                                                  SSt  `------'`\r\n";
                picture[5] = "                                                        `. ___\r\n" +
                                "                                                       __,' __`.                _..----....____\r\n"
                                +
                                "                                           __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                                     _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n"
                                +
                                "                                   ,'________________                           `-._`-','\r\n"
                                +
                                "                                    `._              ```````````------...___   '-.._'-:\r\n"
                                +
                                "                                       ```--.._      ,.                     ````--...__ -.\r\n"
                                +
                                "                                               `.--. `-`                       ____    |  |`\r\n"
                                +
                                "                                                 `. `.                       ,'`````.  ;  ;`\r\n"
                                +
                                "                                                   `._`.        __________   `.      \'__/`\r\n"
                                +
                                "                                                      `-:._____/______/___/____`.       `\r\n"
                                +
                                "                                                                  |       `._    `.    \\r\n"
                                +
                                "                                                                  `._________`-.   `.   `.___\r\n"
                                +
                                "                                                                                 SSt  `------'`\r\n";
                picture[6] = "                                                       `. ___\r\n" +
                                "                                                      __,' __`.                _..----....____\r\n"
                                +
                                "                                          __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                                    _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n"
                                +
                                "                                  ,'________________                           `-._`-','\r\n"
                                +
                                "                                   `._              ```````````------...___   '-.._'-:\r\n"
                                +
                                "                                      ```--.._      ,.                     ````--...__ -.\r\n"
                                +
                                "                                              `.--. `-`                       ____    |  |`\r\n"
                                +
                                "                                                `. `.                       ,'`````.  ;  ;`\r\n"
                                +
                                "                                                  `._`.        __________   `.      \'__/`\r\n"
                                +
                                "                                                     `-:._____/______/___/____`.       `\r\n"
                                +
                                "                                                                 |       `._    `.    \\r\n"
                                +
                                "                                                                 `._________`-.   `.   `.___\r\n"
                                +
                                "                                                                                SSt  `------'`\r\n";
                picture[7] = "                                                      `. ___\r\n" +
                                "                                                     __,' __`.                _..----....____\r\n"
                                +
                                "                                         __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                                   _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n"
                                +
                                "                                 ,'________________                           `-._`-','\r\n"
                                +
                                "                                  `._              ```````````------...___   '-.._'-:\r\n"
                                +
                                "                                     ```--.._      ,.                     ````--...__ -.\r\n"
                                +
                                "                                             `.--. `-`                       ____    |  |`\r\n"
                                +
                                "                                               `. `.                       ,'`````.  ;  ;`\r\n"
                                +
                                "                                                 `._`.        __________   `.      \'__/`\r\n"
                                +
                                "                                                    `-:._____/______/___/____`.       `\r\n"
                                +
                                "                                                                |       `._    `.    \\r\n"
                                +
                                "                                                                `._________`-.   `.   `.___\r\n"
                                +
                                "                                                                               SSt  `------'`\r\n";
                picture[8] = "                                                     `. ___\r\n" +
                                "                                                    __,' __`.                _..----....____\r\n"
                                +
                                "                                        __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                                  _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n"
                                +
                                "                                ,'________________                           `-._`-','\r\n"
                                +
                                "                                 `._              ```````````------...___   '-.._'-:\r\n"
                                +
                                "                                    ```--.._      ,.                     ````--...__ -.\r\n"
                                +
                                "                                            `.--. `-`                       ____    |  |`\r\n"
                                +
                                "                                              `. `.                       ,'`````.  ;  ;`\r\n"
                                +
                                "                                                `._`.        __________   `.      \'__/`\r\n"
                                +
                                "                                                   `-:._____/______/___/____`.       `\r\n"
                                +
                                "                                                               |       `._    `.    \\r\n"
                                +
                                "                                                               `._________`-.   `.   `.___\r\n"
                                +
                                "                                                                              SSt  `------'`\r\n";
                picture[9] = "                                                    `. ___\r\n" +
                                "                                                   __,' __`.                _..----....____\r\n"
                                +
                                "                                       __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                                 _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n"
                                +
                                "                               ,'________________                           `-._`-','\r\n"
                                +
                                "                                `._              ```````````------...___   '-.._'-:\r\n"
                                +
                                "                                   ```--.._      ,.                     ````--...__ -.\r\n"
                                +
                                "                                           `.--. `-`                       ____    |  |`\r\n"
                                +
                                "                                             `. `.                       ,'`````.  ;  ;`\r\n"
                                +
                                "                                               `._`.        __________   `.      \'__/`\r\n"
                                +
                                "                                                  `-:._____/______/___/____`.       `\r\n"
                                +
                                "                                                              |       `._    `.    \\r\n"
                                +
                                "                                                              `._________`-.   `.   `.___\r\n"
                                +
                                "                                                                             SSt  `------'`\r\n";
                picture[10] = "                                                   `. ___\r\n" +
                                "                                                  __,' __`.                _..----....____\r\n"
                                +
                                "                                      __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                                _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n"
                                +
                                "                              ,'________________                           `-._`-','\r\n"
                                +
                                "                               `._              ```````````------...___   '-.._'-:\r\n"
                                +
                                "                                  ```--.._      ,.                     ````--...__ -.\r\n"
                                +
                                "                                          `.--. `-`                       ____    |  |`\r\n"
                                +
                                "                                            `. `.                       ,'`````.  ;  ;`\r\n"
                                +
                                "                                              `._`.        __________   `.      \'__/`\r\n"
                                +
                                "                                                 `-:._____/______/___/____`.       `\r\n"
                                +
                                "                                                             |       `._    `.    \\r\n"
                                +
                                "                                                             `._________`-.   `.   `.___\r\n"
                                +
                                "                                                                            SSt  `------'`\r\n";
                picture[11] = "                                                  `. ___\r\n" +
                                "                                                 __,' __`.                _..----....____\r\n"
                                +
                                "                                     __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                               _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n"
                                +
                                "                             ,'________________                           `-._`-','\r\n"
                                +
                                "                              `._              ```````````------...___   '-.._'-:\r\n"
                                +
                                "                                 ```--.._      ,.                     ````--...__ -.\r\n"
                                +
                                "                                         `.--. `-`                       ____    |  |`\r\n"
                                +
                                "                                           `. `.                       ,'`````.  ;  ;`\r\n"
                                +
                                "                                             `._`.        __________   `.      \'__/`\r\n"
                                +
                                "                                                `-:._____/______/___/____`.       `\r\n"
                                +
                                "                                                            |       `._    `.    \\r\n"
                                +
                                "                                                            `._________`-.   `.   `.___\r\n"
                                +
                                "                                                                           SSt  `------'`\r\n";
                picture[12] = "                                                 `. ___\r\n" +
                                "                                                __,' __`.                _..----....____\r\n"
                                +
                                "                                    __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                              _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n"
                                +
                                "                            ,'________________                           `-._`-','\r\n"
                                +
                                "                             `._              ```````````------...___   '-.._'-:\r\n" +
                                "                                ```--.._      ,.                     ````--...__ -.\r\n"
                                +
                                "                                        `.--. `-`                       ____    |  |`\r\n"
                                +
                                "                                          `. `.                       ,'`````.  ;  ;`\r\n"
                                +
                                "                                            `._`.        __________   `.      \'__/`\r\n"
                                +
                                "                                               `-:._____/______/___/____`.       `\r\n"
                                +
                                "                                                           |       `._    `.    \\r\n"
                                +
                                "                                                           `._________`-.   `.   `.___\r\n"
                                +
                                "                                                                          SSt  `------'`\r\n";
                picture[13] = "                                                `. ___\r\n" +
                                "                                               __,' __`.                _..----....____\r\n"
                                +
                                "                                   __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                             _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n"
                                +
                                "                           ,'________________                           `-._`-','\r\n"
                                +
                                "                            `._              ```````````------...___   '-.._'-:\r\n" +
                                "                               ```--.._      ,.                     ````--...__ -.\r\n"
                                +
                                "                                       `.--. `-`                       ____    |  |`\r\n"
                                +
                                "                                         `. `.                       ,'`````.  ;  ;`\r\n"
                                +
                                "                                           `._`.        __________   `.      \'__/`\r\n"
                                +
                                "                                              `-:._____/______/___/____`.       `\r\n"
                                +
                                "                                                          |       `._    `.    \\r\n" +
                                "                                                          `._________`-.   `.   `.___\r\n"
                                +
                                "                                                                         SSt  `------'`\r\n";
                picture[14] = "                                               `. ___\r\n" +
                                "                                              __,' __`.                _..----....____\r\n"
                                +
                                "                                  __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                            _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n"
                                +
                                "                          ,'________________                           `-._`-','\r\n" +
                                "                           `._              ```````````------...___   '-.._'-:\r\n" +
                                "                              ```--.._      ,.                     ````--...__ -.\r\n"
                                +
                                "                                      `.--. `-`                       ____    |  |`\r\n"
                                +
                                "                                        `. `.                       ,'`````.  ;  ;`\r\n"
                                +
                                "                                          `._`.        __________   `.      \'__/`\r\n"
                                +
                                "                                             `-:._____/______/___/____`.       `\r\n" +
                                "                                                         |       `._    `.    \\r\n" +
                                "                                                         `._________`-.   `.   `.___\r\n"
                                +
                                "                                                                        SSt  `------'`\r\n";
                picture[15] = "                                              `. ___\r\n" +
                                "                                             __,' __`.                _..----....____\r\n"
                                +
                                "                                 __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                           _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n"
                                +
                                "                         ,'________________                           `-._`-','\r\n" +
                                "                          `._              ```````````------...___   '-.._'-:\r\n" +
                                "                             ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                                     `.--. `-`                       ____    |  |`\r\n"
                                +
                                "                                       `. `.                       ,'`````.  ;  ;`\r\n"
                                +
                                "                                         `._`.        __________   `.      \'__/`\r\n"
                                +
                                "                                            `-:._____/______/___/____`.       `\r\n" +
                                "                                                        |       `._    `.    \\r\n" +
                                "                                                        `._________`-.   `.   `.___\r\n"
                                +
                                "                                                                       SSt  `------'`\r\n";
                picture[16] = "                                             `. ___\r\n" +
                                "                                            __,' __`.                _..----....____\r\n"
                                +
                                "                                __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                          _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n"
                                +
                                "                        ,'________________                           `-._`-','\r\n" +
                                "                         `._              ```````````------...___   '-.._'-:\r\n" +
                                "                            ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                                    `.--. `-`                       ____    |  |`\r\n"
                                +
                                "                                      `. `.                       ,'`````.  ;  ;`\r\n"
                                +
                                "                                        `._`.        __________   `.      \'__/`\r\n" +
                                "                                           `-:._____/______/___/____`.       `\r\n" +
                                "                                                       |       `._    `.    \\r\n" +
                                "                                                       `._________`-.   `.   `.___\r\n"
                                +
                                "                                                                      SSt  `------'`\r\n";
                picture[17] = "                                            `. ___\r\n" +
                                "                                           __,' __`.                _..----....____\r\n"
                                +
                                "                               __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                         _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "                       ,'________________                           `-._`-','\r\n" +
                                "                        `._              ```````````------...___   '-.._'-:\r\n" +
                                "                           ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                                   `.--. `-`                       ____    |  |`\r\n" +
                                "                                     `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                                       `._`.        __________   `.      \'__/`\r\n" +
                                "                                          `-:._____/______/___/____`.       `\r\n" +
                                "                                                      |       `._    `.    \\r\n" +
                                "                                                      `._________`-.   `.   `.___\r\n"
                                +
                                "                                                                     SSt  `------'`\r\n";
                picture[18] = "                                           `. ___\r\n" +
                                "                                          __,' __`.                _..----....____\r\n"
                                +
                                "                              __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                        _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "                      ,'________________                           `-._`-','\r\n" +
                                "                       `._              ```````````------...___   '-.._'-:\r\n" +
                                "                          ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                                  `.--. `-`                       ____    |  |`\r\n" +
                                "                                    `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                                      `._`.        __________   `.      \'__/`\r\n" +
                                "                                         `-:._____/______/___/____`.       `\r\n" +
                                "                                                     |       `._    `.    \\r\n" +
                                "                                                     `._________`-.   `.   `.___\r\n" +
                                "                                                                    SSt  `------'`\r\n";
                picture[19] = "                                          `. ___\r\n" +
                                "                                         __,' __`.                _..----....____\r\n"
                                +
                                "                             __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                       _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "                     ,'________________                           `-._`-','\r\n" +
                                "                      `._              ```````````------...___   '-.._'-:\r\n" +
                                "                         ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                                 `.--. `-`                       ____    |  |`\r\n" +
                                "                                   `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                                     `._`.        __________   `.      \'__/`\r\n" +
                                "                                        `-:._____/______/___/____`.       `\r\n" +
                                "                                                    |       `._    `.    \\r\n" +
                                "                                                    `._________`-.   `.   `.___\r\n" +
                                "                                                                   SSt  `------'`\r\n";
                picture[20] = "                                         `. ___\r\n" +
                                "                                        __,' __`.                _..----....____\r\n" +
                                "                            __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n"
                                +
                                "                      _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "                    ,'________________                           `-._`-','\r\n" +
                                "                     `._              ```````````------...___   '-.._'-:\r\n" +
                                "                        ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                                `.--. `-`                       ____    |  |`\r\n" +
                                "                                  `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                                    `._`.        __________   `.      \'__/`\r\n" +
                                "                                       `-:._____/______/___/____`.       `\r\n" +
                                "                                                   |       `._    `.    \\r\n" +
                                "                                                   `._________`-.   `.   `.___\r\n" +
                                "                                                                  SSt  `------'`\r\n";
                picture[21] = "                                        `. ___\r\n" +
                                "                                       __,' __`.                _..----....____\r\n" +
                                "                           __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "                     _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "                   ,'________________                           `-._`-','\r\n" +
                                "                    `._              ```````````------...___   '-.._'-:\r\n" +
                                "                       ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                               `.--. `-`                       ____    |  |`\r\n" +
                                "                                 `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                                   `._`.        __________   `.      \'__/`\r\n" +
                                "                                      `-:._____/______/___/____`.       `\r\n" +
                                "                                                  |       `._    `.    \\r\n" +
                                "                                                  `._________`-.   `.   `.___\r\n" +
                                "                                                                 SSt  `------'`\r\n";
                picture[22] = "                                       `. ___\r\n" +
                                "                                      __,' __`.                _..----....____\r\n" +
                                "                          __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "                    _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "                  ,'________________                           `-._`-','\r\n" +
                                "                   `._              ```````````------...___   '-.._'-:\r\n" +
                                "                      ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                              `.--. `-`                       ____    |  |`\r\n" +
                                "                                `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                                  `._`.        __________   `.      \'__/`\r\n" +
                                "                                     `-:._____/______/___/____`.       `\r\n" +
                                "                                                 |       `._    `.    \\r\n" +
                                "                                                 `._________`-.   `.   `.___\r\n" +
                                "                                                                SSt  `------'`\r\n";
                picture[23] = "                                      `. ___\r\n" +
                                "                                     __,' __`.                _..----....____\r\n" +
                                "                         __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "                   _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "                 ,'________________                           `-._`-','\r\n" +
                                "                  `._              ```````````------...___   '-.._'-:\r\n" +
                                "                     ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                             `.--. `-`                       ____    |  |`\r\n" +
                                "                               `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                                 `._`.        __________   `.      \'__/`\r\n" +
                                "                                    `-:._____/______/___/____`.       `\r\n" +
                                "                                                |       `._    `.    \\r\n" +
                                "                                                `._________`-.   `.   `.___\r\n" +
                                "                                                               SSt  `------'`\r\n";
                picture[24] = "                                    `. ___\r\n" +
                                "                                   __,' __`.                _..----....____\r\n" +
                                "                       __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "                 _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "               ,'________________                           `-._`-','\r\n" +
                                "                `._              ```````````------...___   '-.._'-:\r\n" +
                                "                   ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                           `.--. `-`                       ____    |  |`\r\n" +
                                "                             `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                               `._`.        __________   `.      \'__/`\r\n" +
                                "                                  `-:._____/______/___/____`.       `\r\n" +
                                "                                              |       `._    `.    \\r\n" +
                                "                                              `._________`-.   `.   `.___\r\n" +
                                "                                                             SSt  `------'`\r\n";
                picture[25] = "                                   `. ___\r\n" +
                                "                                  __,' __`.                _..----....____\r\n" +
                                "                      __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "                _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "              ,'________________                           `-._`-','\r\n" +
                                "               `._              ```````````------...___   '-.._'-:\r\n" +
                                "                  ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                          `.--. `-`                       ____    |  |`\r\n" +
                                "                            `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                              `._`.        __________   `.      \'__/`\r\n" +
                                "                                 `-:._____/______/___/____`.       `\r\n" +
                                "                                             |       `._    `.    \\r\n" +
                                "                                             `._________`-.   `.   `.___\r\n" +
                                "                                                            SSt  `------'`\r\n";
                picture[26] = "                                  `. ___\r\n" +
                                "                                 __,' __`.                _..----....____\r\n" +
                                "                     __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "               _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "             ,'________________                           `-._`-','\r\n" +
                                "              `._              ```````````------...___   '-.._'-:\r\n" +
                                "                 ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                         `.--. `-`                       ____    |  |`\r\n" +
                                "                           `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                             `._`.        __________   `.      \'__/`\r\n" +
                                "                                `-:._____/______/___/____`.       `\r\n" +
                                "                                            |       `._    `.    \\r\n" +
                                "                                            `._________`-.   `.   `.___\r\n" +
                                "                                                           SSt  `------'`\r\n";
                picture[27] = "                                 `. ___\r\n" +
                                "                                __,' __`.                _..----....____\r\n" +
                                "                    __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "              _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "            ,'________________                           `-._`-','\r\n" +
                                "             `._              ```````````------...___   '-.._'-:\r\n" +
                                "                ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                        `.--. `-`                       ____    |  |`\r\n" +
                                "                          `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                            `._`.        __________   `.      \'__/`\r\n" +
                                "                               `-:._____/______/___/____`.       `\r\n" +
                                "                                           |       `._    `.    \\r\n" +
                                "                                           `._________`-.   `.   `.___\r\n" +
                                "                                                          SSt  `------'`\r\n";
                picture[28] = "                                `. ___\r\n" +
                                "                               __,' __`.                _..----....____\r\n" +
                                "                   __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "             _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "           ,'________________                           `-._`-','\r\n" +
                                "            `._              ```````````------...___   '-.._'-:\r\n" +
                                "               ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                       `.--. `-`                       ____    |  |`\r\n" +
                                "                         `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                           `._`.        __________   `.      \'__/`\r\n" +
                                "                              `-:._____/______/___/____`.       `\r\n" +
                                "                                          |       `._    `.    \\r\n" +
                                "                                          `._________`-.   `.   `.___\r\n" +
                                "                                                         SSt  `------'`\r\n";
                picture[29] = "                               `. ___\r\n" +
                                "                              __,' __`.                _..----....____\r\n" +
                                "                  __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "            _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "          ,'________________                           `-._`-','\r\n" +
                                "           `._              ```````````------...___   '-.._'-:\r\n" +
                                "              ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                      `.--. `-`                       ____    |  |`\r\n" +
                                "                        `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                          `._`.        __________   `.      \'__/`\r\n" +
                                "                             `-:._____/______/___/____`.       `\r\n" +
                                "                                         |       `._    `.    \\r\n" +
                                "                                         `._________`-.   `.   `.___\r\n" +
                                "                                                        SSt  `------'`\r\n";
                picture[30] = "                              `. ___\r\n" +
                                "                             __,' __`.                _..----....____\r\n" +
                                "                 __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "           _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "         ,'________________                           `-._`-','\r\n" +
                                "          `._              ```````````------...___   '-.._'-:\r\n" +
                                "             ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                     `.--. `-`                       ____    |  |`\r\n" +
                                "                       `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                         `._`.        __________   `.      \'__/`\r\n" +
                                "                            `-:._____/______/___/____`.       `\r\n" +
                                "                                        |       `._    `.    \\r\n" +
                                "                                        `._________`-.   `.   `.___\r\n" +
                                "                                                       SSt  `------'`\r\n";
                picture[31] = "                             `. ___\r\n" +
                                "                            __,' __`.                _..----....____\r\n" +
                                "                __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "          _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "        ,'________________                           `-._`-','\r\n" +
                                "         `._              ```````````------...___   '-.._'-:\r\n" +
                                "            ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                    `.--. `-`                       ____    |  |`\r\n" +
                                "                      `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                        `._`.        __________   `.      \'__/`\r\n" +
                                "                           `-:._____/______/___/____`.       `\r\n" +
                                "                                       |       `._    `.    \\r\n" +
                                "                                       `._________`-.   `.   `.___\r\n" +
                                "                                                      SSt  `------'`\r\n";
                picture[32] = "                            `. ___\r\n" +
                                "                           __,' __`.                _..----....____\r\n" +
                                "               __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "         _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "       ,'________________                           `-._`-','\r\n" +
                                "        `._              ```````````------...___   '-.._'-:\r\n" +
                                "           ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                   `.--. `-`                       ____    |  |`\r\n" +
                                "                     `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                       `._`.        __________   `.      \'__/`\r\n" +
                                "                          `-:._____/______/___/____`.       `\r\n" +
                                "                                      |       `._    `.    \\r\n" +
                                "                                      `._________`-.   `.   `.___\r\n" +
                                "                                                     SSt  `------'`\r\n";
                picture[33] = "                           `. ___\r\n" +
                                "                          __,' __`.                _..----....____\r\n" +
                                "              __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "        _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "      ,'________________                           `-._`-','\r\n" +
                                "       `._              ```````````------...___   '-.._'-:\r\n" +
                                "          ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                  `.--. `-`                       ____    |  |`\r\n" +
                                "                    `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                      `._`.        __________   `.      \'__/`\r\n" +
                                "                         `-:._____/______/___/____`.       `\r\n" +
                                "                                     |       `._    `.    \\r\n" +
                                "                                     `._________`-.   `.   `.___\r\n" +
                                "                                                    SSt  `------'`\r\n";
                picture[34] = "                          `. ___\r\n" +
                                "                         __,' __`.                _..----....____\r\n" +
                                "             __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "       _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "     ,'________________                           `-._`-','\r\n" +
                                "      `._              ```````````------...___   '-.._'-:\r\n" +
                                "         ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                 `.--. `-`                       ____    |  |`\r\n" +
                                "                   `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                     `._`.        __________   `.      \'__/`\r\n" +
                                "                        `-:._____/______/___/____`.       `\r\n" +
                                "                                    |       `._    `.    \\r\n" +
                                "                                    `._________`-.   `.   `.___\r\n" +
                                "                                                   SSt  `------'`\r\n";
                picture[35] = "                         `. ___\r\n" +
                                "                        __,' __`.                _..----....____\r\n" +
                                "            __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "      _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "    ,'________________                           `-._`-','\r\n" +
                                "     `._              ```````````------...___   '-.._'-:\r\n" +
                                "        ```--.._      ,.                     ````--...__ -.\r\n" +
                                "                `.--. `-`                       ____    |  |`\r\n" +
                                "                  `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                    `._`.        __________   `.      \'__/`\r\n" +
                                "                       `-:._____/______/___/____`.       `\r\n" +
                                "                                   |       `._    `.    \\r\n" +
                                "                                   `._________`-.   `.   `.___\r\n" +
                                "                                                  SSt  `------'`\r\n";
                picture[36] = "                        `. ___\r\n" +
                                "                       __,' __`.                _..----....____\r\n" +
                                "           __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "     _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "   ,'________________                           `-._`-','\r\n" +
                                "    `._              ```````````------...___   '-.._'-:\r\n" +
                                "       ```--.._      ,.                     ````--...__ -.\r\n" +
                                "               `.--. `-`                       ____    |  |`\r\n" +
                                "                 `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                   `._`.        __________   `.      \'__/`\r\n" +
                                "                      `-:._____/______/___/____`.       `\r\n" +
                                "                                  |       `._    `.    \\r\n" +
                                "                                  `._________`-.   `.   `.___\r\n" +
                                "                                                 SSt  `------'`\r\n";
                picture[37] = "                       `. ___\r\n" +
                                "                      __,' __`.                _..----....____\r\n" +
                                "          __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "    _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "  ,'________________                           `-._`-','\r\n" +
                                "   `._              ```````````------...___   '-.._'-:\r\n" +
                                "      ```--.._      ,.                     ````--...__ -.\r\n" +
                                "              `.--. `-`                       ____    |  |`\r\n" +
                                "                `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                  `._`.        __________   `.      \'__/`\r\n" +
                                "                     `-:._____/______/___/____`.       `\r\n" +
                                "                                 |       `._    `.    \\r\n" +
                                "                                 `._________`-.   `.   `.___\r\n" +
                                "                                                SSt  `------'`\r\n";
                picture[38] = "                      `. ___\r\n" +
                                "                     __,' __`.                _..----....____\r\n" +
                                "         __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "   _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                " ,'________________                           `-._`-','\r\n" +
                                "  `._              ```````````------...___   '-.._'-:\r\n" +
                                "     ```--.._      ,.                     ````--...__ -.\r\n" +
                                "             `.--. `-`                       ____    |  |`\r\n" +
                                "               `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                 `._`.        __________   `.      \'__/`\r\n" +
                                "                    `-:._____/______/___/____`.       `\r\n" +
                                "                                |       `._    `.    \\r\n" +
                                "                                `._________`-.   `.   `.___\r\n" +
                                "                                               SSt  `------'`\r\n";
                picture[39] = "                     `. ___\r\n" +
                                "                    __,' __`.                _..----....____\r\n" +
                                "        __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "  _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                ",'________________                           `-._`-','\r\n" +
                                " `._              ```````````------...___   '-.._'-:\r\n" +
                                "    ```--.._      ,.                     ````--...__ -.\r\n" +
                                "            `.--. `-`                       ____    |  |`\r\n" +
                                "              `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                `._`.        __________   `.      \'__/`\r\n" +
                                "                   `-:._____/______/___/____`.       `\r\n" +
                                "                               |       `._    `.    \\r\n" +
                                "                               `._________`-.   `.   `.___\r\n" +
                                "                                              SSt  `------'`\r\n";
                picture[40] = "                     `. ___\r\n" +
                                "                    __,' __`.                _..----....____\r\n" +
                                "        __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "  _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                ",'________________                           `-._`-','\r\n" +
                                " `._              ```````````------...___   '-.._'-:\r\n" +
                                "    ```--.._      ,.                     ````--...__ -.\r\n" +
                                "            `.--. `-`                       ____    |  |`\r\n" +
                                "              `. `.                       ,'`````.  ;  ;`\r\n" +
                                "                `._`.        __________   `.      \'__/`\r\n" +
                                "                   `-:._____/______/___/____`.       `\r\n" +
                                "                               |       `._    `.    \\r\n" +
                                "                               `._________`-.   `.   `.___\r\n" +
                                "                                              SSt  `------'`\r\n";
                picture[41] = "                    `. ___\r\n" +
                                "                   __,' __`.                _..----....____\r\n" +
                                "       __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                " _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "'________________                           `-._`-','\r\n" +
                                "`._              ```````````------...___   '-.._'-:\r\n" +
                                "   ```--.._      ,.                     ````--...__ -.\r\n" +
                                "           `.--. `-`                       ____    |  |`\r\n" +
                                "             `. `.                       ,'`````.  ;  ;`\r\n" +
                                "               `._`.        __________   `.      \'__/`\r\n" +
                                "                  `-:._____/______/___/____`.       `\r\n" +
                                "                              |       `._    `.    \\r\n" +
                                "                              `._________`-.   `.   `.___\r\n" +
                                "                                             SSt  `------'`\r\n";
                picture[42] = "                   `. ___\r\n" +
                                "                  __,' __`.                _..----....____\r\n" +
                                "      __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "_..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "________________                           `-._`-','\r\n" +
                                "._              ```````````------...___   '-.._'-:\r\n" +
                                "  ```--.._      ,.                     ````--...__ -.\r\n" +
                                "          `.--. `-`                       ____    |  |`\r\n" +
                                "            `. `.                       ,'`````.  ;  ;`\r\n" +
                                "              `._`.        __________   `.      \'__/`\r\n" +
                                "                 `-:._____/______/___/____`.       `\r\n" +
                                "                             |       `._    `.    \\r\n" +
                                "                             `._________`-.   `.   `.___\r\n" +
                                "                                            SSt  `------'`\r\n";
                picture[43] = "                  `. ___\r\n" +
                                "                 __,' __`.                _..----....____\r\n" +
                                "     __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "_______________                           `-._`-','\r\n" +
                                "_              ```````````------...___   '-.._'-:\r\n" +
                                " ```--.._      ,.                     ````--...__ -.\r\n" +
                                "         `.--. `-`                       ____    |  |`\r\n" +
                                "           `. `.                       ,'`````.  ;  ;`\r\n" +
                                "             `._`.        __________   `.      \'__/`\r\n" +
                                "                `-:._____/______/___/____`.       `\r\n" +
                                "                            |       `._    `.    \\r\n" +
                                "                            `._________`-.   `.   `.___\r\n" +
                                "                                           SSt  `------'`\r\n";
                picture[44] = "                  `. ___\r\n" +
                                "                 __,' __`.                _..----....____\r\n" +
                                "     __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "_______________                           `-._`-','\r\n" +
                                "_              ```````````------...___   '-.._'-:\r\n" +
                                " ```--.._      ,.                     ````--...__ -.\r\n" +
                                "         `.--. `-`                       ____    |  |`\r\n" +
                                "           `. `.                       ,'`````.  ;  ;`\r\n" +
                                "             `._`.        __________   `.      \'__/`\r\n" +
                                "                `-:._____/______/___/____`.       `\r\n" +
                                "                            |       `._    `.    \\r\n" +
                                "                            `._________`-.   `.   `.___\r\n" +
                                "                                           SSt  `------'`\r\n";
                picture[45] = "                 `. ___\r\n" +
                                "                __,' __`.                _..----....____\r\n" +
                                "    __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                ".-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "______________                           `-._`-','\r\n" +
                                "              ```````````------...___   '-.._'-:\r\n" +
                                "```--.._      ,.                     ````--...__ -.\r\n" +
                                "        `.--. `-`                       ____    |  |`\r\n" +
                                "          `. `.                       ,'`````.  ;  ;`\r\n" +
                                "            `._`.        __________   `.      \'__/`\r\n" +
                                "               `-:._____/______/___/____`.       `\r\n" +
                                "                           |       `._    `.    \\r\n" +
                                "                           `._________`-.   `.   `.___\r\n" +
                                "                                          SSt  `------'`\r\n";
                picture[46] = "                `. ___\r\n" +
                                "               __,' __`.                _..----....____\r\n" +
                                "   __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "_____________                           `-._`-','\r\n" +
                                "             ```````````------...___   '-.._'-:\r\n" +
                                "``--.._      ,.                     ````--...__ -.\r\n" +
                                "       `.--. `-`                       ____    |  |`\r\n" +
                                "         `. `.                       ,'`````.  ;  ;`\r\n" +
                                "           `._`.        __________   `.      \'__/`\r\n" +
                                "              `-:._____/______/___/____`.       `\r\n" +
                                "                          |       `._    `.    \\r\n" +
                                "                          `._________`-.   `.   `.___\r\n" +
                                "                                         SSt  `------'`\r\n";
                picture[47] = "               `. ___\r\n" +
                                "              __,' __`.                _..----....____\r\n" +
                                "  __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "''-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "____________                           `-._`-','\r\n" +
                                "            ```````````------...___   '-.._'-:\r\n" +
                                "`--.._      ,.                     ````--...__ -.\r\n" +
                                "      `.--. `-`                       ____    |  |`\r\n" +
                                "        `. `.                       ,'`````.  ;  ;`\r\n" +
                                "          `._`.        __________   `.      \'__/`\r\n" +
                                "             `-:._____/______/___/____`.       `\r\n" +
                                "                         |       `._    `.    \\r\n" +
                                "                         `._________`-.   `.   `.___\r\n" +
                                "                                        SSt  `------'`\r\n";
                picture[48] = "              `. ___\r\n" +
                                "             __,' __`.                _..----....____\r\n" +
                                " __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "'-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "___________                           `-._`-','\r\n" +
                                "           ```````````------...___   '-.._'-:\r\n" +
                                "--.._      ,.                     ````--...__ -.\r\n" +
                                "     `.--. `-`                       ____    |  |`\r\n" +
                                "       `. `.                       ,'`````.  ;  ;`\r\n" +
                                "         `._`.        __________   `.      \'__/`\r\n" +
                                "            `-:._____/______/___/____`.       `\r\n" +
                                "                        |       `._    `.    \\r\n" +
                                "                        `._________`-.   `.   `.___\r\n" +
                                "                                       SSt  `------'`\r\n";
                picture[49] = "             `. ___\r\n" +
                                "            __,' __`.                _..----....____\r\n" +
                                "__...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "-------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "__________                           `-._`-','\r\n" +
                                "          ```````````------...___   '-.._'-:\r\n" +
                                "-.._      ,.                     ````--...__ -.\r\n" +
                                "    `.--. `-`                       ____    |  |`\r\n" +
                                "      `. `.                       ,'`````.  ;  ;`\r\n" +
                                "        `._`.        __________   `.      \'__/`\r\n" +
                                "           `-:._____/______/___/____`.       `\r\n" +
                                "                       |       `._    `.    \\r\n" +
                                "                       `._________`-.   `.   `.___\r\n" +
                                "                                      SSt  `------'`\r\n";
                picture[50] = "            `. ___\r\n" +
                                "           __,' __`.                _..----....____\r\n" +
                                "_...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "------'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "_________                           `-._`-','\r\n" +
                                "         ```````````------...___   '-.._'-:\r\n" +
                                ".._      ,.                     ````--...__ -.\r\n" +
                                "   `.--. `-`                       ____    |  |`\r\n" +
                                "     `. `.                       ,'`````.  ;  ;`\r\n" +
                                "       `._`.        __________   `.      \'__/`\r\n" +
                                "          `-:._____/______/___/____`.       `\r\n" +
                                "                      |       `._    `.    \\r\n" +
                                "                      `._________`-.   `.   `.___\r\n" +
                                "                                     SSt  `------'`\r\n";
                picture[51] = "           `. ___\r\n" +
                                "          __,' __`.                _..----....____\r\n" +
                                "...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "-----'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "________                           `-._`-','\r\n" +
                                "        ```````````------...___   '-.._'-:\r\n" +
                                "._      ,.                     ````--...__ -.\r\n" +
                                "  `.--. `-`                       ____    |  |`\r\n" +
                                "    `. `.                       ,'`````.  ;  ;`\r\n" +
                                "      `._`.        __________   `.      \'__/`\r\n" +
                                "         `-:._____/______/___/____`.       `\r\n" +
                                "                     |       `._    `.    \\r\n" +
                                "                     `._________`-.   `.   `.___\r\n" +
                                "                                    SSt  `------'`\r\n";
                picture[52] = "          `. ___\r\n" +
                                "         __,' __`.                _..----....____\r\n" +
                                "..--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "----'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "_______                           `-._`-','\r\n" +
                                "       ```````````------...___   '-.._'-:\r\n" +
                                "_      ,.                     ````--...__ -.\r\n" +
                                " `.--. `-`                       ____    |  |`\r\n" +
                                "   `. `.                       ,'`````.  ;  ;`\r\n" +
                                "     `._`.        __________   `.      \'__/`\r\n" +
                                "        `-:._____/______/___/____`.       `\r\n" +
                                "                    |       `._    `.    \\r\n" +
                                "                    `._________`-.   `.   `.___\r\n" +
                                "                                   SSt  `------'`\r\n";
                picture[53] = "         `. ___\r\n" +
                                "        __,' __`.                _..----....____\r\n" +
                                ".--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "---'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "______                           `-._`-','\r\n" +
                                "      ```````````------...___   '-.._'-:\r\n" +
                                "      ,.                     ````--...__ -.\r\n" +
                                "`.--. `-`                       ____    |  |`\r\n" +
                                "  `. `.                       ,'`````.  ;  ;`\r\n" +
                                "    `._`.        __________   `.      \'__/`\r\n" +
                                "       `-:._____/______/___/____`.       `\r\n" +
                                "                   |       `._    `.    \\r\n" +
                                "                   `._________`-.   `.   `.___\r\n" +
                                "                                  SSt  `------'`\r\n";
                picture[54] = "        `. ___\r\n" +
                                "       __,' __`.                _..----....____\r\n" +
                                "--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "--'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "_____                           `-._`-','\r\n" +
                                "     ```````````------...___   '-.._'-:\r\n" +
                                "     ,.                     ````--...__ -.\r\n" +
                                ".--. `-`                       ____    |  |`\r\n" +
                                " `. `.                       ,'`````.  ;  ;`\r\n" +
                                "   `._`.        __________   `.      \'__/`\r\n" +
                                "      `-:._____/______/___/____`.       `\r\n" +
                                "                  |       `._    `.    \\r\n" +
                                "                  `._________`-.   `.   `.___\r\n" +
                                "                                 SSt  `------'`\r\n";
                picture[55] = "       `. ___\r\n" +
                                "      __,' __`.                _..----....____\r\n" +
                                "-.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "-'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "____                           `-._`-','\r\n" +
                                "    ```````````------...___   '-.._'-:\r\n" +
                                "    ,.                     ````--...__ -.\r\n" +
                                "--. `-`                       ____    |  |`\r\n" +
                                "`. `.                       ,'`````.  ;  ;`\r\n" +
                                "  `._`.        __________   `.      \'__/`\r\n" +
                                "     `-:._____/______/___/____`.       `\r\n" +
                                "                 |       `._    `.    \\r\n" +
                                "                 `._________`-.   `.   `.___\r\n" +
                                "                                SSt  `------'`\r\n";
                picture[56] = "      `. ___\r\n" +
                                "     __,' __`.                _..----....____\r\n" +
                                ".'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "'   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "___                           `-._`-','\r\n" +
                                "   ```````````------...___   '-.._'-:\r\n" +
                                "   ,.                     ````--...__ -.\r\n" +
                                "-. `-`                       ____    |  |`\r\n" +
                                ". `.                       ,'`````.  ;  ;`\r\n" +
                                " `._`.        __________   `.      \'__/`\r\n" +
                                "    `-:._____/______/___/____`.       `\r\n" +
                                "                |       `._    `.    \\r\n" +
                                "                `._________`-.   `.   `.___\r\n" +
                                "                               SSt  `------'`\r\n";
                picture[57] = "     `. ___\r\n" +
                                "    __,' __`.                _..----....____\r\n" +
                                "'``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "   `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "__                           `-._`-','\r\n" +
                                "  ```````````------...___   '-.._'-:\r\n" +
                                "  ,.                     ````--...__ -.\r\n" +
                                ". `-`                       ____    |  |`\r\n" +
                                " `.                       ,'`````.  ;  ;`\r\n" +
                                "`._`.        __________   `.      \'__/`\r\n" +
                                "   `-:._____/______/___/____`.       `\r\n" +
                                "               |       `._    `.    \\r\n" +
                                "               `._________`-.   `.   `.___\r\n" +
                                "                              SSt  `------'`\r\n";
                picture[58] = "    `. ___\r\n" +
                                "   __,' __`.                _..----....____\r\n" +
                                "``;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "  `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "_                           `-._`-','\r\n" +
                                " ```````````------...___   '-.._'-:\r\n" +
                                " ,.                     ````--...__ -.\r\n" +
                                " `-`                       ____    |  |`\r\n" +
                                "`.                       ,'`````.  ;  ;`\r\n" +
                                "._`.        __________   `.      \'__/`\r\n" +
                                "  `-:._____/______/___/____`.       `\r\n" +
                                "              |       `._    `.    \\r\n" +
                                "              `._________`-.   `.   `.___\r\n" +
                                "                             SSt  `------'`\r\n";
                picture[59] = "   `. ___\r\n" +
                                "  __,' __`.                _..----....____\r\n" +
                                "`;.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                " `'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "                           `-._`-','\r\n" +
                                "```````````------...___   '-.._'-:\r\n" +
                                ",.                     ````--...__ -.\r\n" +
                                "`-`                       ____    |  |`\r\n" +
                                ".                       ,'`````.  ;  ;`\r\n" +
                                "_`.        __________   `.      \'__/`\r\n" +
                                " `-:._____/______/___/____`.       `\r\n" +
                                "             |       `._    `.    \\r\n" +
                                "             `._________`-.   `.   `.___\r\n" +
                                "                            SSt  `------'`\r\n";
                picture[60] = "  `. ___\r\n" +
                                " __,' __`.                _..----....____\r\n" +
                                ";.   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "`'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "                          `-._`-','\r\n" +
                                "``````````------...___   '-.._'-:\r\n" +
                                ".                     ````--...__ -.\r\n" +
                                "-`                       ____    |  |`\r\n" +
                                "                       ,'`````.  ;  ;`\r\n" +
                                "`.        __________   `.      \'__/`\r\n" +
                                "`-:._____/______/___/____`.       `\r\n" +
                                "            |       `._    `.    \\r\n" +
                                "            `._________`-.   `.   `.___\r\n" +
                                "                           SSt  `------'`\r\n";
                picture[61] = " `. ___\r\n" +
                                "__,' __`.                _..----....____\r\n" +
                                ".   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "'   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "                         `-._`-','\r\n" +
                                "`````````------...___   '-.._'-:\r\n" +
                                "                     ````--...__ -.\r\n" +
                                "`                       ____    |  |`\r\n" +
                                "                      ,'`````.  ;  ;`\r\n" +
                                ".        __________   `.      \'__/`\r\n" +
                                "-:._____/______/___/____`.       `\r\n" +
                                "           |       `._    `.    \\r\n" +
                                "           `._________`-.   `.   `.___\r\n" +
                                "                          SSt  `------'`\r\n";
                picture[62] = "`. ___\r\n" +
                                "_,' __`.                _..----....____\r\n" +
                                "   ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "   `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "                        `-._`-','\r\n" +
                                "````````------...___   '-.._'-:\r\n" +
                                "                    ````--...__ -.\r\n" +
                                "                       ____    |  |`\r\n" +
                                "                     ,'`````.  ;  ;`\r\n" +
                                "        __________   `.      \'__/`\r\n" +
                                ":._____/______/___/____`.       `\r\n" +
                                "          |       `._    `.    \\r\n" +
                                "          `._________`-.   `.   `.___\r\n" +
                                "                         SSt  `------'`\r\n";
                picture[63] = ". ___\r\n" +
                                ",' __`.                _..----....____\r\n" +
                                "  ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "  `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "                       `-._`-','\r\n" +
                                "```````------...___   '-.._'-:\r\n" +
                                "                   ````--...__ -.\r\n" +
                                "                      ____    |  |`\r\n" +
                                "                    ,'`````.  ;  ;`\r\n" +
                                "       __________   `.      \'__/`\r\n" +
                                "._____/______/___/____`.       `\r\n" +
                                "         |       `._    `.    \\r\n" +
                                "         `._________`-.   `.   `.___\r\n" +
                                "                        SSt  `------'`\r\n";
                picture[64] = " ___\r\n" +
                                "' __`.                _..----....____\r\n" +
                                " ,.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                " `'   `'     O ``-''._   (,;') _,'\r\n" +
                                "                      `-._`-','\r\n" +
                                "``````------...___   '-.._'-:\r\n" +
                                "                  ````--...__ -.\r\n" +
                                "                     ____    |  |`\r\n" +
                                "                   ,'`````.  ;  ;`\r\n" +
                                "      __________   `.      \'__/`\r\n" +
                                "_____/______/___/____`.       `\r\n" +
                                "        |       `._    `.    \\r\n" +
                                "        `._________`-.   `.   `.___\r\n" +
                                "                       SSt  `------'`\r\n";
                picture[65] = "__\r\n" +
                                " __`.                _..----....____\r\n" +
                                ",.   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "`'   `'     O ``-''._   (,;') _,'\r\n" +
                                "                     `-._`-','\r\n" +
                                "`````------...___   '-.._'-:\r\n" +
                                "                 ````--...__ -.\r\n" +
                                "                    ____    |  |`\r\n" +
                                "                  ,'`````.  ;  ;`\r\n" +
                                "     __________   `.      \'__/`\r\n" +
                                "____/______/___/____`.       `\r\n" +
                                "       |       `._    `.    \\r\n" +
                                "       `._________`-.   `.   `.___\r\n" +
                                "                      SSt  `------'`\r\n";
                picture[66] = "\r\n" +
                                "__`.                _..----....____\r\n" +
                                ".   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "'   `'     O ``-''._   (,;') _,'\r\n" +
                                "                    `-._`-','\r\n" +
                                "````------...___   '-.._'-:\r\n" +
                                "                ````--...__ -.\r\n" +
                                "                   ____    |  |`\r\n" +
                                "                 ,'`````.  ;  ;`\r\n" +
                                "    __________   `.      \'__/`\r\n" +
                                "___/______/___/____`.       `\r\n" +
                                "      |       `._    `.    \\r\n" +
                                "      `._________`-.   `.   `.___\r\n" +
                                "                     SSt  `------'`\r\n";
                picture[67] = "\r\n" +
                                "_`.                _..----....____\r\n" +
                                "   ;``--..__     .'    ,-._    _.-'\r\n" +
                                "   `'     O ``-''._   (,;') _,'\r\n" +
                                "                   `-._`-','\r\n" +
                                "```------...___   '-.._'-:\r\n" +
                                "               ````--...__ -.\r\n" +
                                "                  ____    |  |`\r\n" +
                                "                ,'`````.  ;  ;`\r\n" +
                                "   __________   `.      \'__/`\r\n" +
                                "__/______/___/____`.       `\r\n" +
                                "     |       `._    `.    \\r\n" +
                                "     `._________`-.   `.   `.___\r\n" +
                                "                    SSt  `------'`\r\n";
                picture[68] = "\r\n" +
                                "`.                _..----....____\r\n" +
                                "  ;``--..__     .'    ,-._    _.-'\r\n" +
                                "  `'     O ``-''._   (,;') _,'\r\n" +
                                "                  `-._`-','\r\n" +
                                "``------...___   '-.._'-:\r\n" +
                                "              ````--...__ -.\r\n" +
                                "                 ____    |  |`\r\n" +
                                "               ,'`````.  ;  ;`\r\n" +
                                "  __________   `.      \'__/`\r\n" +
                                "_/______/___/____`.       `\r\n" +
                                "    |       `._    `.    \\r\n" +
                                "    `._________`-.   `.   `.___\r\n" +
                                "                   SSt  `------'`\r\n";
                picture[69] = "     \r\n" +
                                ".                _..----....____\r\n" +
                                " ;``--..__     .'    ,-._    _.-'\r\n" +
                                " `'     O ``-''._   (,;') _,'\r\n" +
                                "                 `-._`-','\r\n" +
                                "`------...___   '-.._'-:\r\n" +
                                "             ````--...__ -.\r\n" +
                                "                ____    |  |`\r\n" +
                                "              ,'`````.  ;  ;`\r\n" +
                                " __________   `.      \'__/`\r\n" +
                                "/______/___/____`.       `\r\n" +
                                "   |       `._    `.    \\r\n" +
                                "   `._________`-.   `.   `.___\r\n" +
                                "                  SSt  `------'`\r\n";
                picture[70] = "\r\n" +
                                "                _..----....____\r\n" +
                                ";``--..__     .'    ,-._    _.-'\r\n" +
                                "`'     O ``-''._   (,;') _,'\r\n" +
                                "                `-._`-','\r\n" +
                                "------...___   '-.._'-:\r\n" +
                                "            ````--...__ -.\r\n" +
                                "               ____    |  |`\r\n" +
                                "             ,'`````.  ;  ;`\r\n" +
                                "__________   `.      \'__/`\r\n" +
                                "______/___/____`.       `\r\n" +
                                "  |       `._    `.    \\r\n" +
                                "  `._________`-.   `.   `.___\r\n" +
                                "                 SSt  `------'`\r\n";
                picture[71] = "\r\n" +
                                "               _..----....____\r\n" +
                                "``--..__     .'    ,-._    _.-'\r\n" +
                                "'     O ``-''._   (,;') _,'\r\n" +
                                "               `-._`-','\r\n" +
                                "-----...___   '-.._'-:\r\n" +
                                "           ````--...__ -.\r\n" +
                                "              ____    |  |`\r\n" +
                                "            ,'`````.  ;  ;`\r\n" +
                                "_________   `.      \'__/`\r\n" +
                                "_____/___/____`.       `\r\n" +
                                " |       `._    `.    \\r\n" +
                                " `._________`-.   `.   `.___\r\n" +
                                "                SSt  `------'`\r\n";
                picture[72] = "\r\n" +
                                "              _..----....____\r\n" +
                                "`--..__     .'    ,-._    _.-'\r\n" +
                                "     O ``-''._   (,;') _,'\r\n" +
                                "              `-._`-','\r\n" +
                                "----...___   '-.._'-:\r\n" +
                                "          ````--...__ -.\r\n" +
                                "             ____    |  |`\r\n" +
                                "           ,'`````.  ;  ;`\r\n" +
                                "________   `.      \'__/`\r\n" +
                                "____/___/____`.       `\r\n" +
                                "|       `._    `.    \\r\n" +
                                "`._________`-.   `.   `.___\r\n" +
                                "               SSt  `------'`\r\n";
                picture[73] = "\r\n" +
                                "             _..----....____\r\n" +
                                "--..__     .'    ,-._    _.-'\r\n" +
                                "    O ``-''._   (,;') _,'\r\n" +
                                "             `-._`-','\r\n" +
                                "---...___   '-.._'-:\r\n" +
                                "         ````--...__ -.\r\n" +
                                "            ____    |  |`\r\n" +
                                "          ,'`````.  ;  ;`\r\n" +
                                "_______   `.      \'__/`\r\n" +
                                "___/___/____`.       `\r\n" +
                                "       `._    `.    \\r\n" +
                                "._________`-.   `.   `.___\r\n" +
                                "              SSt  `------'`\r\n";
                picture[74] = "\r\n" +
                                "             _..----....____\r\n" +
                                "--..__     .'    ,-._    _.-'\r\n" +
                                "    O ``-''._   (,;') _,'\r\n" +
                                "             `-._`-','\r\n" +
                                "---...___   '-.._'-:\r\n" +
                                "         ````--...__ -.\r\n" +
                                "            ____    |  |`\r\n" +
                                "          ,'`````.  ;  ;`\r\n" +
                                "_______   `.      \'__/`\r\n" +
                                "___/___/____`.       `\r\n" +
                                "       `._    `.    \\r\n" +
                                "._________`-.   `.   `.___\r\n" +
                                "              SSt  `------'`\r\n";
                picture[75] = "\r\n" +
                                "            _..----....____\r\n" +
                                "-..__     .'    ,-._    _.-'\r\n" +
                                "   O ``-''._   (,;') _,'\r\n" +
                                "            `-._`-','\r\n" +
                                "--...___   '-.._'-:\r\n" +
                                "        ````--...__ -.\r\n" +
                                "           ____    |  |`\r\n" +
                                "         ,'`````.  ;  ;`\r\n" +
                                "______   `.      \'__/`\r\n" +
                                "__/___/____`.       `\r\n" +
                                "      `._    `.    \\r\n" +
                                "_________`-.   `.   `.___\r\n" +
                                "             SSt  `------'`\r\n";

                for (int i = 0; i < (picture.length - 1); i++) {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.print("\033[0;0H");
                        System.out.println(picture[i]);
                        try {
                                TimeUnit.MILLISECONDS.sleep(40);
                        } catch (InterruptedException e) {
                                e.printStackTrace();
                        }
                }
        }
}
