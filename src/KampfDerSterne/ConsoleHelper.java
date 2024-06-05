package KampfDerSterne;

import java.util.concurrent.TimeUnit;

public class ConsoleHelper {

    public String[][] anfangstext = {
            { "Willkommen", "bei","\u001B[31m" , "Kampf", "der", "Sterne!","\u001B[0m"},
            { "Dein", "Heimatplanet", "wurde", "durch","\u001B[31m", "Katuluk","\u001B[0m",", ", "einem", "Mächtigen", "Monster,", "angegriffen." },
            { "Dein", "Ziel", "ist", "es","\u001B[31m", "Katuluk","\u001B[0m",", ", "zu", "besiegen", "und", "deinen", "Heimatplaneten", "zu",
                    "retten." },
            { "Leider", "bist", "du", "noch", "viel", "zu", "schwach", "um","\u001B[31m", "Katuluk","\u001B[0m",", ", "zu", "besiegen." },
            { "Du", "musst", "stärker", "werden,", "indem", "du", "von", "Planet", "zu", "Planet", "reist", "und",
                    "gegen", "Monster", "kämpfst." },
            { "Monster", "können", "Gegenstände", "droppen,", "die", "dir", "helfen", "stärker", "zu", "werden." },
            { "Du", "kannst", "maximal","\u001B[31m", "drei", "Gegenstände","\u001B[0m", "gleichzeitig", "tragen."},
            { "Doch", "sei", "gewarnt...", "wenn", "du", "gegen", "ein", "Monster", "verlierst", "passieren",
                    "schlimme", "Dinge." },
            { "Viel", "Glück...", "Achso", "wie", "war", "nochmal", "dein", "Name?" }
    };

    public String[][] endtext = {
            { "Du", "hast", "es", "geschafft,","\u001B[31m", "Katuluk","\u001B[0m", "zu", "besiegen", "und", "deinen", "Heimatplaneten", "zu",
                    "retten." },
            { "Dein", "Mut", "und", "deine", "Stärke", "haben", "sich", "ausgezahlt." },
            { "Dein", "Heimatplanet", "ist", "dir", "für", "immer", "dankbar." },
            { "Du", "bist", "ein", "wahrer", "Held,", "der", "in", "die", "Geschichte", "eingehen", "wird." },
            { "Möchtest", "du", "nochmal", "spielen?" }
    };
    public String[][] NameEingabeText = {
            { "Bitte", "gib", "deinen", "Namen", "ein:" }
    };
    public String[][] alterEingabeText = {
            { "Bitte", "gib", "dein", "Alter", "ein:" }
    };
    public String[][] planetenAuswahlText = {
            { "Du", "befindest", "dich", "in", "deinem", "Raumschiff", "und", "fliegst", "verloren", "durch", "das",
                    "Weltall." },
            { "Du", "siehst", "ein", "paar", "Planeten", "in", "der", "Ferne.", "Welchen", "möchtest", "du",
                    "anfliegen?" }
    };
    public String[][] falscheEingabeBeiPlanetenauswahlText = {
            { "Um", "ehrlich", "zu", "sein", "weiß", "ich", "nicht", "wie", "du", "hier", "überleben", "willst,",
                    "wenn", "du", "nichtmal", "eine", "Zahl", "zwischen", "1", "und", "3", "eingeben", "kannst",".",".","." },
            { "Naja", "selbst", "ein", "blindes", "Huhn", "findet", "mal", "ein", "Korn.", "Versuch", "es", "nochmal." }
    };
    public String[][] begrueßungSpielerText = {
            { "Hallo", "\u001B[31m", "", "\u001B[0m", "du", "bist", "\u001B[31m", "", "\u001B[0m", "Jahre", "alt",
                    "und", "hast", "eine", "Stärke", "von", "\u001B[31m", "", "\u001B[0m","." },
            { "Bist", "du", "bereit", "für", "dein", "Abenteuer?", "Ach", "ist", "auch", "egal,", "du", "hast", "keine",
                    "Wahl.", "Los", "geht's!" }
    };
    public String[][] monsterAuswahlText = {
            { "Du", "siehst", "ein", "paar", "Monster", "in", "der", "Ferne.", "Welches", "möchtest", "du",
                    "bekämpfen?" }
    };
    public String[][] planetenLandungText = {
            { "Du", "bist", "auf", "dem", "Planeten", "", "gelandet." }
    };

    public String[][] kampfVerlorenText = {
            { "Das", "war", "ziemlich", "knapp...", "Du", "konntest", "dich", "in", "dein", "Raumschiff", "retten",
                    "und", "bist", "zurück", "ins", "Weltall", "geflogen." }
    };

    public String[][] planetenBesiegtText = {
            { "Du", "hast", "alle", "Monster", "auf", "", "besiegt!", "Du", "bist", "bereit", "für", "die", "nächste",
                    "Herausforderung!" }
    };
    public String[][] kampfGewonnenText = {
            { "Du", "hast", "das", "Monster:", "\u001B[31m", "", "\u001B[0m", "besiegt!" },
            { "Du", "hast","den", "Gegenstand:", "\u001B[31m", "", "\u001B[0m", "gefunden!" },
            { "Deine", "Stärke", "beträgt", "nun", "\u001B[31m", "", "\u001B[0m","." }
    };
    public String[][] kampfGewonnenMitVollemInventarText = {
            { "Du", "hast", "das", "Monster", "\u001B[31m", "", "\u001B[0m", "besiegt!" },
            { "Du", "hast", "den", "Gegenstand:", "\u001B[31m", "", "\u001B[0m", "gefunden!" },
            { "Leider", "hast", "zu", "viele", "Gegenstände", "im", "Inventar", "und", "musst", "einen", "ablegen,", "wenn",
                    "du", "den", "Gegenstand:", "\u001B[31m", "", "\u001B[0m", "mit", "einer", "Kraft", "von",
                    "\u001B[31m", "", "\u001B[0m", "aufnehmen", "möchtest." },
            { "Welchen", "Gegenstand", "möchtest", "du", "ablegen?" }
    };
    public String[][] keinMonsterText = {
            { "Es", "gibt", "keine", "Monster", "mehr", "auf", "diesem", "Planeten." }
    };
    
    public String[][] falscheEingabeBeiGegenstandTauschText = {
            { "Das", "ist", "keine", "Option...", "Naja", "von", "einem", "Menschen", "hätte", "ich", "nichts",
                    "anderes", "erwartet.", "Versuche", "es", "erneut!" }
    };
    public String[][] keinGegenstandTauschText = {
            { "Du", "willst", "keinen", "Gegenstand", "tauschen.", "Ob", "das", "so", "eine", "gute", "Idee", "ist...",
                    "Naja", "du", "wirst", "schon", "sehen." }
    };
    public String[][] tauscheGegenstaendeText = {
            { "Du", "hast", "den", "Gegenstand:", "\u001B[31m", "", "\u001B[0m", "abgelegt." },
            { "Du", "hast", "den", "Gegenstand:", "\u001B[31m", "", "\u001B[0m", "aufgenommen." },
            { "Deine", "Stärke", "beträgt", "nun", "\u001B[31m", "", "\u001B[0m","." },
            { "Hoffen", "wir", "mal", "das", "war", "eine", "gute", "Entscheidung..." }
    };
    public void initialisiereTauscheGegenstaendeTextMitParameter(Gegenstand gegenstand1, Gegenstand gegenstand2, Mensch spieler) {
        tauscheGegenstaendeText[0][5] = gegenstand1.getName();
        tauscheGegenstaendeText[1][5] = gegenstand2.getName();
        tauscheGegenstaendeText[2][5] = String.valueOf(spieler.getKraft());
    }

    public void initiasiereKampfGewonnenMitVollemInventarTextMitParameter(Gegenstand gegenstand, Monster monster) {
        kampfGewonnenMitVollemInventarText[0][5] = monster.getName();
        kampfGewonnenMitVollemInventarText[1][5] = monster.getLoot().getName();
        kampfGewonnenMitVollemInventarText[2][16] = gegenstand.getName();
        kampfGewonnenMitVollemInventarText[2][23] = String.valueOf(gegenstand.getKraft());
    }

    public void initiasiereKampfGewonnenTextMitParameter(Mensch spieler, Monster monster) {
        kampfGewonnenText[0][5] = monster.getName();
        kampfGewonnenText[1][5] = monster.getLoot().getName();
        kampfGewonnenText[2][5] = String.valueOf(spieler.getKraft());
    }

    public void initiasiereAnfangsTextMitParameter(Mensch spieler) {
        begrueßungSpielerText[0][2] = spieler.getName();
        begrueßungSpielerText[0][7] = String.valueOf(spieler.getAlter());
        begrueßungSpielerText[0][17] = String.valueOf(spieler.getKraft());
    }

    public void initiasiereplanetenLandungTextMitParameter(Planet planet) {
        planetenLandungText[0][5] = planet.getName();
    }

    public void initiasiereplanetenBesiegtTextMitParameter(Planet planet) {
        planetenBesiegtText[0][5] = planet.getName();
    }
    public void schreibeText(String[][] text) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("\033[0;0H");

        for (String[] sentence : text) {
            for (String word : sentence) {
                for (char zeichen : word.toCharArray()) {
                    System.out.print(zeichen);
                    try {
                        TimeUnit.MILLISECONDS.sleep(40);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if ((word != "\u001B[31m") && (word != "\u001B[0m") && (word != ",")&& (word != ".")) {
                        System.out.print(" ");
                }              
            }
            System.out.println();
        }
        try {
            TimeUnit.MILLISECONDS.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.flush();
    }

    public void schreibeLogo() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("\033[0;0H");
        String Zeile1 = " _    _ _ _ _ _                                          _          _              \r\n" + //
                "| |  | (_) | | |                                        | |        (_)             \r\n" + //
                "| |  | |_| | | | _____  _ __ ___  _ __ ___   ___ _ __   | |__   ___ _ _ __ ___     \r\n" + //
                "| |/\\| | | | | |/ / _ \\| '_ ` _ \\| '_ ` _ \\ / _ \\ '_ \\  | '_ \\ / _ \\ | '_ ` _ \\    \r\n" + //
                "\\  /\\  / | | |   < (_) | | | | | | | | | | |  __/ | | | | |_) |  __/ | | | | | |   \r\n" + //
                " \\/  \\/|_|_|_|_|\\_\\___/|_| |_| |_|_| |_| |_|\\___|_| |_| |_.__/ \\___|_|_| |_| |_|   \r\n" + //
                "                                                                                   \r\n" + //
                "                                                                                   \r\n" + //
                " _   __                       __       _             _____ _                       \r\n" + //
                "| | / /                      / _|     | |           /  ___| |                      \r\n" + //
                "| |/ /  __ _ _ __ ___  _ __ | |_    __| | ___ _ __  \\ `--.| |_ ___ _ __ _ __   ___ \r\n" + //
                "|    \\ / _` | '_ ` _ \\| '_ \\|  _|  / _` |/ _ \\ '__|  `--. \\ __/ _ \\ '__| '_ \\ / _ \\\r\n" + //
                "| |\\  \\ (_| | | | | | | |_) | |   | (_| |  __/ |    /\\__/ / ||  __/ |  | | | |  __/\r\n" + //
                "\\_| \\_/\\__,_|_| |_| |_| .__/|_|    \\__,_|\\___|_|    \\____/ \\__\\___|_|  |_| |_|\\___|\r\n" + //
                "                      | |                                                          \r\n" + //
                "                      |_|                                                          \r\n" + //
                "";
        System.out.print(Zeile1);
    }
}
