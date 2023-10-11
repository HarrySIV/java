public class Loopys {
    public static void main(String[] args) {
        //for loop
        for(int i = 0; i <= 5; i++ ) {
            System.out.println(i);
        }

        //while loop
        int j = 0;
        while (true) {
            if (j > 5) break;
            System.out.println(j);
            j++;
        }

        // do while loop
        int k = 0;
        boolean isReady = true;
        do {
            System.out.println(k);
            k++;
            if (k > 5) isReady = false;
        } while (isReady);

        //using continue to skip multiples of 25
        int number = 0;
        while (number < 50) {
            number += 5;
            if ( number % 25 == 0) continue;
            System.out.print(number + " ");
        }
    }
}
