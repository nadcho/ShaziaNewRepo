/**
 * Created by nadimchouglay on 06/06/2017.
 */
public class Exercise12 {
    public static void main(String[] args) {
        int[]myarray={1,2,5,7,8,7,2};

        for(int i=0;i<myarray.length-1;i++){

            for (int j=i+1;j<myarray.length;j++){

                if ((myarray[i]==myarray[j]) &&(i !=j)) {
                    System.out.println("duplicate element : "+myarray[j]);
                }
            }

        }

    }
}
