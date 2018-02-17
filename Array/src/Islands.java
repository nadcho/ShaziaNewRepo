import java.util.Arrays;

/**
 * Created by nadimchouglay on 03/06/2017.
 */
public class Islands {
    public static void main(String[] args) {
        int[]islands={1,2,3,4};
        String[]name={"Bermuda","Fiji","Azores","Cozumel"};
        System.out.println("islands"+ Arrays.toString(islands));
        Arrays.sort(islands);
        System.out.println("name"+Arrays.toString(name));
        Arrays.sort(name);
    }
}
