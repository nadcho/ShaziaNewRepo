/**
 * Created by nadimchouglay on 02/06/2017.
 */
public class Exercise4 {
    public static void main(String[] args) {
        int[] num = {2,3,6};
        //calculate sum of all array elements
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
            double average=sum/num.length;
            System.out.println("average value of num is "+average);

        }
    }
}
