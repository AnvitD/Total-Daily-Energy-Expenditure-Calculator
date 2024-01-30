 
/**
 * this program is used to calculate your TDEE.
 *
 */

import java.util.Scanner;
public class TDEE
{
    public static void main(String[] args) 
  {
      Scanner in = new Scanner(System.in); 
      String tDee = ""; 
      double dTdee; 
      double aF; 
       
      
      
      System.out.println("Please enter your name."); 
      String name = in.nextLine(); 
      System.out.println("Please enter your gender. (M/F)");
      String gender = in.nextLine(); 
      System.out.println("Please enter your BMR.");
      double bmr = in.nextInt(); 
      
      
      System.out.println(); 
      System.out.println(); 
      System.out.println("***************************************************************************");
      System.out.println(); 
      System.out.println("Activity levels."); 
      System.out.println(); 
      System.out.println(" [A] Resting          (Sleeping, Reclining) "); 
      System.out.println(" [B] Sedentary        (Minimal movement) "); 
      System.out.println(" [C] Light            (Office work, Sitting) "); 
      System.out.println(" [D] Moderate         (Light manual labor) "); 
      System.out.println(" [E] Very Active      (Hard manual labor) "); 
      System.out.println(" [F] Extremely Active (Heavy manual labor) ");
      
      System.out.println(); 
      System.out.println("Please select you activity level"); 
      String level = in.next(); 
      
      if( level.equalsIgnoreCase("A")) 
        aF = 1.0; 
      else if( level.equalsIgnoreCase("B") ) 
        aF = 1.3; 
      else if( level.equalsIgnoreCase("C") && gender.equalsIgnoreCase("M"))
        aF = 1.6;
      else if( level.equalsIgnoreCase("C") && gender.equalsIgnoreCase("F"))
        aF = 1.5; 
      else if( level.equalsIgnoreCase("D") && gender.equalsIgnoreCase("M"))
        aF = 1.7;
      else if( level.equalsIgnoreCase("D") && gender.equalsIgnoreCase("F"))
        aF = 1.6; 
      else if( level.equalsIgnoreCase("E") && gender.equalsIgnoreCase("M"))
        aF =  2.1; 
      else if( level.equalsIgnoreCase("E") && gender.equalsIgnoreCase("F")) 
        aF =  1.9; 
      else if( level.equalsIgnoreCase("F") && gender.equalsIgnoreCase("M")) 
        aF = 2.4; 
      else if( level.equalsIgnoreCase("F") && gender.equalsIgnoreCase("F"))
        aF = 2.2; 
      else 
        aF = 0; 
        
      
      if( level.equalsIgnoreCase("A"))
        dTdee = bmr * 1.0; 
      else if( level.equalsIgnoreCase("B") ) 
        dTdee = bmr * 1.3; 
      else if( level.equalsIgnoreCase("C") && gender.equalsIgnoreCase("M"))
        dTdee = bmr * 1.6;
      else if( level.equalsIgnoreCase("C") && gender.equalsIgnoreCase("F"))
        dTdee = bmr * 1.5; 
      else if( level.equalsIgnoreCase("D") && gender.equalsIgnoreCase("M"))
        dTdee = bmr * 1.7;
      else if( level.equalsIgnoreCase("D") && gender.equalsIgnoreCase("F"))
        dTdee = bmr * 1.6; 
      else if( level.equalsIgnoreCase("E") && gender.equalsIgnoreCase("M"))
        dTdee = bmr * 2.1; 
      else if( level.equalsIgnoreCase("E") && gender.equalsIgnoreCase("F")) 
        dTdee = bmr * 1.9; 
      else if( level.equalsIgnoreCase("F") && gender.equalsIgnoreCase("M")) 
        dTdee = bmr * 2.4; 
      else if( level.equalsIgnoreCase("F") && gender.equalsIgnoreCase("F"))
        dTdee = bmr * 2.2; 
      else 
        dTdee = 0; 
      
      if (dTdee == 0) 
        System.out.println("Please choose an appropiate option"); 
      else 
      {
      System.out.println("***************************************************************************");
      System.out.println(); 
      System.out.println(); 
      System.out.println("Name: " + name); 
      System.out.println("Gender: " + gender);
      System.out.println("BMR: " + bmr); 
      System.out.println("Activity factor: " + aF);
      System.out.println("TDEE: " + dTdee); 
    }
      
    }
}
      
