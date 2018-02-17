import java.util.Arrays;

/**
 * Created by nadimchouglay on 02/06/2017.
 */
public class Exercise1 {
    public static void main(String[] args) {
        int[] myarray={154,546,768,987,786};
        String[] myarray1={"java","python","c++","c#","cprogramming"};
        System.out.println("original numeric array "+ Arrays.toString(myarray));
        Arrays.sort(myarray);
        System.out.println("sorted numeric array "+Arrays.toString(myarray1));
        Arrays.sort(myarray1);
    }

}
