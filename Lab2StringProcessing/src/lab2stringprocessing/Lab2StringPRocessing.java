package lab2stringprocessing;

import java.io.FileNotFoundException;
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
      java.io.File  read = new java.io.File(args[0]);      
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

            records[currentIndex] = String.format("%-20s%-20s%-10s%-10s%-20s%-10s",firstName,lastName,age,gender,phoneNumber,email);
             System.out.println(records[currentIndex]);
            currentIndex++;
    // TODO code application logic here
    }
      } catch (FileNotFoundException ex){
         System.err.println("File not Found");

}
    }
}