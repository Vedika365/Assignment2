/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1assignment2;
import java.util.Scanner;
/**
 *
 * @author Vedika
 */
public class Task1Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner calculator = new Scanner (System.in); 

        //ask the user for his imput 
        System.out.print("Welcome to the world population calculator\n"); 
        
        System.out.print("Enter the current world population:"); 
        long worldpop = calculator.nextLong(); 

        System.out.print("Enter the current growth rate(e.g 1.14% would be 0.014):"); 
        double growth = calculator.nextDouble(); 

          
        //display the title 
        String year = "Year"; 
        String pop= "Estimated population"; 
        String change = "Change from prior year"; 
        //print the title 
        System.out.printf("%-10s %20s %30s\n", year, pop,change); 
        
        //inilialize the variables that I'll use in the loop
        long newpop = worldpop ;
        long changes = 0;
        
        //use a for loop to print evrything because we know the number of years
        for (int years=1 ; years<=75 ;years++){ 
             //keep giving the newpopulation
             worldpop += worldpop * growth;
             //calculate the change in the population
             changes = (long)(worldpop-newpop);
             //update the newpop everytime
             newpop = worldpop;
             //print everything
             System.out.printf("%d  %20d %30d \n", years,worldpop,changes);
        } 
    }     
}
