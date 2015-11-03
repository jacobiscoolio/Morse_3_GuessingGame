

package morse_3_guessinggame;
import java.util.Scanner;
import java.util.Random;
public class Morse_3_GuessingGame {
  static int ZZTOP =5;
    public static void main(String[] args) {
   
        name();
        
        while(ZZTOP > 0){
        easygame();
        ZZTOP--;
        System.out.println("You have " + ZZTOP + " lives left.");
        
        }
        
    }
    static void name(){
        System.out.println("What is your name?");
    Scanner name = new Scanner(System.in);
    String x = name.nextLine();
    System.out.println("Hello " + x);
    
    }
    static void easygame(){
       
       
    //while (itsaboolean){
        
        System.out.println("Pick a number between 0 and 10 please.");
        Scanner hh = new Scanner(System.in);
        int a = hh.nextInt();
        Random number = new Random();
        int jj = number.nextInt(1);
        if(a == jj){
            System.out.println("You've won level 1");
            int itsacounter = 5;
            while(itsacounter > 0){
        mediumgame();
        itsacounter--;
        System.out.println("You have " + itsacounter + " lives left.");
        }
        }
        if(a != jj){
            System.out.println("You're wrong.");
     }
        if(a > jj){
            System.out.println("You're too high.");
     }
        if(a < jj){
            System.out.println("You're too low.");
     }
      
        
     
    }
    static void mediumgame(){
      
        System.out.println("Pick a number between 0 and 50 please.");
        Scanner hh = new Scanner(System.in);
        int a = hh.nextInt();
        Random number = new Random();
        int jj = number.nextInt(1);
        if(a == jj){
            System.out.println("You've won level 2");
            int r = 5;
            while(r > 0){
        hardgame();
        r--;
        System.out.println("You have " + r + " lives left.");
        }
        }
        if(a != jj){
            System.out.println("You're wrong.");
        }
        if(a > jj){
            System.out.println("You're too high.");
     }
        if(a < jj){
            System.out.println("You're too low.");
     }
     
        
    }
    static void hardgame(){
        
        System.out.println("Pick a number between 0 and 100 please.");
        Scanner hh = new Scanner(System.in);
        int a = hh.nextInt();
        Random number = new Random();
        int jj = number.nextInt(1);
        if(a == jj){
            System.out.println("You've won");
            int xxx = 5;
            while(xxx > 0){
        end();
        
        
        }
        }
        if(a != jj){
            System.out.println("You're wrong.");
            
        }
        if(a > jj){
            System.out.println("You're too high.");
     }
        if(a < jj){
            System.out.println("You're too low.");
     }
     
        }
static void end(){
 

}    
}


