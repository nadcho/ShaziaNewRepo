import java.util.Arrays;

/**
 * Created by nadimchouglay on 03/06/2017.
 */
public class Daysofweek {
    public static void main(String[] args) {
        //create arr of days week and name


        int[] daysofweek = {1, 2, 3, 4, 5, 6, 7};
        String[] day = {"mon", "tue", "wed", "thur", "fri", "sat", "sun"};

        System.out.println("daysofweek"+ Arrays.toString(daysofweek));
        Arrays.sort(daysofweek);
        System.out.println("Days"+Arrays.toString(day));
        Arrays.sort(day);


        System.out.println("mon is :" +findindex(daysofweek,2));
        System.out.println("wed is :"+findindex(daysofweek,4));
        System.out.println("fri is :"+findindex(daysofweek,6));



    }
    public static int findindex(int[]daysofweek,int day){
        if(daysofweek==null) return -1;
        int len=daysofweek.length;
        int i=0;
        while (i<len){
            if(daysofweek[i]==day) return i;
            else i=i+1;
        }
        return -1;
    }

}