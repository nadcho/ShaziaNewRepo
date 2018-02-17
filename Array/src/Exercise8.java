import java.util.Arrays;

/**
 * Created by nadimchouglay on 04/06/2017.
 */
public class Exercise8 {
    public static void main(String[] args) {
        int []myarray={25,14,56,15,36,77,18,29,49};
        int []newarray=new int[10];
        System.out.println("sourceArray:"+ Arrays.toString(myarray));
        for (int i=0;i<myarray.length;i++){
            newarray[i]=myarray[i];
        }
        System.out.println("newarray "+Arrays.toString(newarray));
    }
}
