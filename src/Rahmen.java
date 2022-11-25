public class Rahmen {

    // Methode generiert passenden Rahmen um den Text
    public void printTextMitRahmen(String[] text) {

        if (text == null || text.length == 0) {
            System.out.println("Das Text-Array ist leer.");
            System.exit(0);
        }

        // Speicherung des längsten Strings im Array
        int lengthOfLongestString = text[0].length();

        // längsten String ermitteln
        for (int i = 0; i < text.length; i++) {
            if (text[i].length() > lengthOfLongestString) {
                lengthOfLongestString = text[i].length();
            }
        }

        // printet die obere Seite des Rahmens
        for (int i = 0; i < lengthOfLongestString+4; i++) {
            System.out.print("*");
        }

        // Zeilenumbruch
        System.out.println();

        // printet die Zeilen der Strings
        for (int i = 0; i < text.length; i++) {

            // printet Zeile bis zum Textende
            System.out.print("* " + text[i]);

            // berechnet die Anzahl der nötigen Leerzeichen nach dem Text
            int numberOfSpaces = lengthOfLongestString - text[i].length() + 1;

            // printet die berechnete Anzahl der Leerzeichen nach dem Text
            for (int j = 0; j < numberOfSpaces; j++) {
                System.out.print(" ");
            }

            // printet das Symbol nach dem Text
            System.out.print("*");

            // Zeilenumbruch
            System.out.println();

        }

        // printet die untere Seite des Rahmens
        for (int i = 0; i < lengthOfLongestString+4; i++) {
            System.out.print("*");
        }
    }
}