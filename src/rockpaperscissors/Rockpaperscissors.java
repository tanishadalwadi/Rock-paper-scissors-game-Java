/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author tanis
 */
public class Rockpaperscissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int score_of_player=0, score_of_computer=0; 
        int round_number= 1;
        Scanner t= new Scanner(System.in);
        Random p= new Random();
        System.out.println("Enter number of rounds you want to play:");
        int rounds= t.nextInt();
        for(int i=0;i<rounds;i++){
            System.out.println("----Rock, Paper, Scissors----");
            System.out.println("round:" +round_number);
            round_number+=1;
            System.out.println("weapons:");
            System.out.println("1. Rock ");
            System.out.println("2. Paper");
            System.out.println("3.Scissor");
            System.out.println("Choose weapons:");
            int weaponofplayer= t.nextInt();
            int weaponofcomputer= p.nextInt(3) +1;
            System.out.println(weaponofplayer + "VS" + weaponofcomputer);
            //if draw
            if(weaponofcomputer == weaponofplayer )
            {
                System.out.println("Draw- no win");
                
            }
            //Player win
            if(weaponofcomputer== 1 && weaponofplayer== 2)
            {
                System.out.println("Palyer won!");
                score_of_player=+1;
            }
            else if(weaponofcomputer== 1 && weaponofplayer== 3)
            {
                System.out.println("Palyer won!");
                score_of_player=+1;
            }
            else if(weaponofcomputer== 2 && weaponofplayer== 3)
            {
                System.out.println("Palyer won!");
                score_of_player=+1;
            }
            //Computer win 
            else {
                System.out.println("Computer won!");
                score_of_computer=+1;
            }
           
        }
         System.out.println("Total score: player =" +score_of_player+ "Computer=" +score_of_computer);
         if(score_of_player > score_of_computer)
         {
            System.out.println("Player wins the game");
         }
         
         
         else if (score_of_player < score_of_computer) {
             System.out.println("Computer wins the game");
         }
         else
         {
             System.out.println("It is a draw");
         }
         System.out.println("Thank you for playing");
        // TODO code application logic here
    }
    
}
