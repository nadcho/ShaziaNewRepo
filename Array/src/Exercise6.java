/**
 * Created by nadimchouglay on 03/06/2017.
 */
public class Exercise6 {
    public static boolean contains(int[]arr,int item){
        for(int n:arr){
            if(item==n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int []myarray={ 76,87,98,65,67};
        System.out.println(contains(myarray,87));
        System.out.println(contains(myarray,789));
    }
}
