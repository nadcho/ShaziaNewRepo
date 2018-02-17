

import java.util.Scanner;

/**
 * Created by nadimchouglay on 02/07/2017.
 */
public class SimpleAddition {
    static int simplearraysum(int n, int[] ar) {
        ar = new int[6];
        ar[0] = 1;
        ar[1] = 2;
        ar[3] = 3;
        ar[4] = 10;
        ar[5] = 11;
        return simplearraysum(n, ar);

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner scanner=new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();

        }
        int result = simplearraysum(n, ar);
        System.out.println(result);
    }
}




