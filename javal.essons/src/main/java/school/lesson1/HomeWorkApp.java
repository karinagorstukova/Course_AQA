package school.lesson1;

public class HomeWorkApp {
    public static void main (String [] args) {
            printThreeWords();
            checkSumSign();
        }
        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }

        public static void checkSumSign() {
            int a = 10;
            int b = 5;
            int sum = a + b;

            if (sum >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
    }
}