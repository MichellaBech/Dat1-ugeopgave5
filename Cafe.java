package Task2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Cafe {

   private ArrayList<String> coffeeMenu = new ArrayList<>();

   public Cafe()
   {

   }

   public void loadMenuData()
   {
       File file = new File("coffees.txt");
       try
       {
           Scanner scanner = new Scanner(file);
           while(scanner.hasNextLine())
           {
               String input = scanner.nextLine();
               coffeeMenu.add(input);
               System.out.println(input);
           }
       }
       catch (FileNotFoundException e)
       {
           System.out.println("The file does not exist");
       }
   }

}
