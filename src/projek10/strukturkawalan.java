/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek10;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class strukturkawalan {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char sains;
    char math ;
    
    System.out.println("Apakah gred bagi Math:[A/B/C/D/E/F/G]");
        sains=input.next().charAt(0);
    System.out.println("Apakah gred bagi sains:[A/B/C/D/E/F/G]");
        math=input.next().charAt(0);
        
    if (sains==math)
               System.out.println("Gred yang diperolehi adalah sama");
    if (sains!=math) // also CORRECT>
               System.out.println("Gred yang diperolehi tidak sama");
    }
}
