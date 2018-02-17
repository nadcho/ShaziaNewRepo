/**
 * Created by nadimchouglay on 02/06/2017.
 */
public class Books {
    String name, author;


    public static void main(String[] args) {

        Books []b=new Books[3];
        b[0]=new Books();
        b[1]=new Books();
        b[2]=new Books();

        b[0].name=" sam ";
        b[1].name=" frodo ";
        b[2].name=" lolo ";
        b[0].author=" bob ";
        b[1].author=" sue ";
        b[2].author=" ian";
        int z=0;
        while(z<4){
            System.out.println(b[z].name);
            System.out.println(" by");
            System.out.println(b[z].author);
            z=z+1;



        }

    }
}