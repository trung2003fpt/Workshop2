
package workshop.pkg2;

import java.util.Scanner;
public class Part2 {
  public static void main(String[] args) { 
        boolean cont = false; 
        do { 
            try{ 
                String s = ""; 
                String pattern = "SE123"; 
                Scanner sc = new Scanner(System.in); 
                System.out.println("Enter the string: "); 
                s = sc.nextLine(); 
                if(!s.matches(pattern)) 
                    throw new Exception(); 
                System.out.println("The string is: " + s); 
                cont = false; 
            }catch(Exception e){ 
                System.out.println("The string is invalid"); 
                cont = true; } } while (cont); 
    }
}