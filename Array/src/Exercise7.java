/**
 * Created by nadimchouglay on 03/06/2017.
 */
public class Exercise7 {
    public static int findindex(int[]myarray,int t){
        if(myarray==null) return -1;
        int len=myarray.length;
        int i=0;
        while(i<len){
            if(myarray[i]==t) return i;
            else i=i+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]myarray={25,14,56,15,36,29};
        System.out.println("indexposition of36 is"+findindex(myarray,36));
    }
}
