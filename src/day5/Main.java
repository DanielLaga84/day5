package day5;

public class Main {

    public static void main(String[] args) {
        // i++ zawsze dodaje +1 i=i+1
        // i-- zawsze odejmuje decrement -1  i=i-1
        int countBlock;
        int levels = 3;
        {
            int total = 0;
            for (int i = 1; i <= levels; i++) {
                total = total + (i * i);
                System.out.print(total);
            }
        }

        int addNumbers;
        {
            int sum = 0;
            for (int i = 15; i <= 20; i++) {
                sum = sum + i;
                System.out.println(sum);

            }
        }
        int LoppDecrementing;
        {
            for (int p = 3; p >= 1; p--) {
                System.out.print(p);
            }
        }

        int evenNumbers;
        {
            for (int w = 2; w <= 5; w += 2) {
                System.out.print(w);
            }
        }
        int serachWifi;
        {
            for (int z = 1; z <= 10; z++) {
                boolean wifiAviable = true;
                if (wifiAviable) {
                    System.out.println("Wifi found");
                    break;
                }
            }
        }

        boolean rollaSix;
        {
            int dice = (int) (Math.random() + 1 * 6);
            while (dice != 6) {
                dice = (int) (Math.random() + 1 * 6);
                if (dice == 3) ;
                break;
            }
            if (dice == 6) ;
            System.out.print(dice + " You have won!");
            if (dice < 6) ;
            System.out.println("Loose");
        }
// Checking int []
        int[] numbers = {12, 1, 777, 3, 4, 0, 0, 121, 1, -4, 0, -100, 2};
        System.out.print(numbers[9] * numbers[12] + "miss");

// Checking double
        double[] fracNumbers = {4.0, 6.2, 3.75, 5.1, 9.99};
        double s = (fracNumbers[0] + fracNumbers[3]);
        System.out.print(s + "lol" +
                "Done ");
// Lucky String, wanna do something like this dowloading news from the internet.
        String[] newsOutlet = {"abc", "bbc", "CNN", "CBS", "AP", "NBC", "FOX", "npr", "sky", "aljazeera"};
        double lucky = Math.random();
        lucky *= 10;
        int luckyindex = (int) lucky;
        System.out.print(newsOutlet[luckyindex]);
// Calculate average
        double calculateAvarege;
        double[] temperatures = {75, 73, 72, 80};
        int size = temperatures.length;
        double total = 0;
        for (int a = 0; a < size; a++) {
            total += temperatures[a];
            double average = total / size;
            System.out.print(average);
        }
        // Rubik's cube Championship checking lowest one

        double search;
        double[] speed = {7.85, 7.32, 4.9, 6.22, 5.4, 7.3, 5.19};
        double minimum = speed[0];
        int sizeR = speed.length;
        for (int qs = 1; qs < sizeR; qs++) {
            if (speed[qs] < minimum) {
                minimum = speed[qs];
                System.out.println("." + "jest dobrze " + minimum);
            }
        }
// Longest name found

        String findLongestName;
        String[] names = {"Zuzanna Kloc", "Agnieszka Madra", "Beata Ozik", "Dagmara Love", "Kamila Galczynska"};
        int sizeK = names.length;
        String longestName = names[0];
        for (int ok = 1; ok < sizeK; ok++) {
            if (names[ok].length() > longestName.length()) {
                longestName = names[ok];
            }
        }
        System.out.println(longestName);

// Loop into loop
    }
    public static void nestedLoops (String[] args){
        int n = 10;
        while (n < 50) {
            n = n * 2;
        }
        System.out.println(n);

       }}