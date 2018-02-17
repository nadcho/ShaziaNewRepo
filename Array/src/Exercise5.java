/**
 * Created by nadimchouglay on 03/06/2017.
 */
public class Exercise5 {
    public static boolean contains(int[] arr,int item){
        for(int n:arr){
            if (item==n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int []myarray={1765,566,765,876};
        System.out.println(contains(myarray,566));
        System.out.println(contains(myarray,76));
    }
}
