 import java.util.Scanner;
public class Miniproject {
    public static void main(String args[]) {
       Scanner scan = new Scanner(System.in);
       do{
       int myNumber = (int)(Math.random()*100);
       int usernumber = 0;
       int chances=7;
        do {
           System.out.println("Guess my number : ");
           usernumber = scan.nextInt();
           if(usernumber == myNumber) {
                System.out.println("WOOHOO... CORRECT ANSWER");
                break;
           } else if (usernumber<myNumber) {
               chances=chances-1;
               System.out.println("your number is too small..");
               System.out.println("you have "+chances+" left");
               if(chances==0)break;
           }
               else{
                   System.out.println("your number is too large..");
                   chances=chances-1;
                   System.out.println("you have "+chances+" left");
                   if(chances==0)break;
               }
       }while(chances>0); 
           System.out.println("my number was: "+myNumber); 
           System.out.println("Do You Wish You Continue?(1 or 0):");
              int choice=scan.nextInt();
              if(choice==0)break;
       }while(true);
       
        
    } 
}