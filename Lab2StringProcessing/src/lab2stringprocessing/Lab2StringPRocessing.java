package lab2stringprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Tyheem Washington
 */
public class Lab2StringPRocessing {
static String[] records;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 records = new String[100];
      try {
      java.io.File  read = new java.io.File(args[0]); // Set up Scanner scn to read file “likely.txt”      
      java.util.Scanner  toy= new java.util.Scanner( read );
        int currentIndex = 0;    
        while(toy.hasNext()){
            String[] line = toy.nextLine().split(",");
            String firstName = line[0];
            String lastName = line[1];
            String age = line[2];
            String gender = line [3];
            String phoneNumber = line[4];
            String email = line[5];

            records[currentIndex] = String.format("");
             
            currentIndex++;
    // TODO code application logic here
    }
      } catch (FileNotFoundException ex){
         System.err.println("File not Found");

}
    }
}