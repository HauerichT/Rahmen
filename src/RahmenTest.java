public class RahmenTest {
    public static void main(String[] args) {

        // Rahmen-Test 1
        System.out.println("Rahmen-Test 1:");
        String[] test1 = {"Rahmen", "sind", "toll"};
        Rahmen rahmen1 = new Rahmen(test1);
        rahmen1.printTextMitRahmen();

        // Rahmen-Test 2
        System.out.println("\n\nRahmen-Test 2:");
        String[] test2 = {"Das ist", "ein", "Test"};
        Rahmen rahmen2 = new Rahmen(test2);
        rahmen2.printTextMitRahmen();

    }

}
