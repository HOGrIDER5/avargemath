/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arayfindingspped;
import java.util.Scanner;
public class Arayfindingspped {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner keyedInput= new Scanner(System.in);
     double avarge=0;
     double sum=0;
     double [] marks = new double [5];
        System.out.println("Enter 5 marks ");
        for(int i = 0; i<=4; i++)
        {
            marks [i]= keyedInput.nextDouble();
        }
        for(int i=0; i<=4; i++)
        {
            sum= marks[i]+sum;
            
        }
        System.out.println("your sum is "+ sum );
        
        for (int i=0; i<=4; i++ )
        {
            avarge =sum/5;
            
        } 
        System.out.println("your avarge is "+ avarge);
       }
    
    
}
