package tnsjavabasicsprograms;

 public class  loopsDemoMain{
    public static void main(String[] args) {

        // For Loop
        System.out.println("Using for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // While Loop
        System.out.println("\nUsing while loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Number: " + j);
            j++;
        }

        // Do-While Loop
        System.out.println("\nUsing do-while loop:");
        int k = 1;
        do {
            System.out.println("Number: " + k);
            k++;
        } while (k <= 5);
}
}
