/**
 * Created by nadimchouglay on 02/06/2017.
 */
public class Librarybook {
    String name;



    public static void main(String[] args) {
        Librarybook[] l=new Librarybook[4];
        int x=0;

        l[0]=new Librarybook();
        l[1]=new Librarybook();
        l[2]=new Librarybook();
        l[3]=new Librarybook();
        if(x<5) {

            System.out.println("issue books");
        }
        else if (x>4){


            System.out.println("issue declined");
            x=x+1;

        }



    }

}


