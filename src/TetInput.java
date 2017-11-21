import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.SyncFailedException;
import java.util.Scanner;

public class TetInput {

    public  class TestTnput{
        public  static void (String [] args{
            // BufferedReader
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What is your name ? : ");
        String name = reader.readLine();
        System.out.println();(" your name is "+ name);
        System.out.print ("How oid are you? : ");
        int age = Integer.parseInt(reader.readLine());
        System.out.println(" you are "+ age +"years old." ) ;

        //Scanner
           Scanner scanner = new Scanner (System.in);
            System.out.print("Where are you come from ?: ");
            String city = Scanner.nextLine();
            System.out.println("You came form "+city);


    }//main

}//class
