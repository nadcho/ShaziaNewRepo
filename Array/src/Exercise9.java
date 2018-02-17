import java.util.Arrays;

/**
 * Created by nadimchouglay on 04/06/2017.
 */
public class Exercise9 {

    public static void main(String[] args) {
        int[]myarray={25,14,56,15,36,56,77,18,29,49};

        //insert an element in 3rd position of array

        int indexposition=2;
        int newvalue=5;
        System.out.println("original array" + Arrays.toString(myarray));
        for(int i=myarray.length-1;i>indexposition;i--){
            myarray[i]=myarray[i-1];
        }
        myarray[indexposition]=newvalue;
        System.out.println("new array :"+Arrays.toString(myarray));
    }
}
