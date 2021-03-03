import player.Cricket;
import player.BasketBall;
import player.Football;
import payroll.payroll;
import java.util.*;

public class myClass {

  public static void main(String args[]){
   
   int x;
   
   
   do{
   
      System.out.println("1.Football");
      System.out.println("2.Cricket");
      System.out.println("3.BasketBall");
     
      Scanner input = new Scanner(System.in);
      x=input.nextInt();
     
      switch(x){
     
        case 1:
        {
         int nom,now,total,flag=0,pos;
         Football f = new Football();
         System.out.println("Enter player name");
         input = new Scanner(System.in);
         String n = input.nextLine();
         f.setName(n);
         System.out.println("Enter number of matches");
         nom = input.nextInt();
         System.out.println("Enter total number of goals");
         total = input.nextInt();
         System.out.println("Enter number of wins");
         now = input.nextInt();
	 System.out.println("Enter position 1. forward 2. defend 3. GK \n >");
	 pos = 	input.nextInt();
         
         f.setStatistics(nom,total,now);
         
         System.out.println("Enter 1 to play a game or 0 to not!");
         flag = input.nextInt();
         
         if(flag==1){
          f.playGame();
         }
         
         System.out.println("Player information are:");
         System.out.println("Name : " +f.getName());
         int[] ob = f.getStatistics();
         System.out.println("Number of matches : " +ob[0]);
         System.out.println("Number of goals : " +ob[1]);
         System.out.println("Number of wins : " +ob[2]);
         payroll py = new payroll(pos,ob[1],ob[2]);
	 System.out.println("Salary :"+py.salary() );
         break;
         
        }
       
        case 2:
        {
	 int pos;
         int nom,now,total,flag=0;
         Cricket c = new Cricket();
         System.out.println("Enter player name");
         input = new Scanner(System.in);
         String n = input.nextLine();
         c.setName(n);
         System.out.println("Enter number of matches");
         nom = input.nextInt();
         System.out.println("Enter total number of wicket");
         total = input.nextInt();
         System.out.println("Enter number of wins");
         now = input.nextInt();
	 
       	 System.out.println("Enter position 1. batsman 2. bowler \n >");
	 pos = 	input.nextInt();
         
         c.setStatistics(nom,total,now);
         
         System.out.println("Enter 1 to play a game or 0 to not!");
         flag = input.nextInt();
         
         if(flag==1){
          c.playGame();
         }
         
         System.out.println("Player information are:");
         System.out.println("Name : " +c.getName());
         int[] ob = c.getStatistics();
         System.out.println("Number of matches : " +ob[0]);
         System.out.println("Number of wickets : " +ob[1]);
         System.out.println("Number of wins : " +ob[2]);
	 payroll py = new payroll(pos,ob[1],ob[2]);
	 System.out.println("Salary :"+py.salary() );
          break;
        }
       
        case 3:
        {
         int nom,now,total,flag=0,pos;
         BasketBall b = new BasketBall();
	 
         System.out.println("Enter player name");
         input = new Scanner(System.in);
         String n = input.nextLine();
         b.setName(n);
         System.out.println("Enter number of matches");
         nom = input.nextInt();
         System.out.println("Enter total number of baskets");
         total = input.nextInt();
         System.out.println("Enter number of wins");
         now = input.nextInt();
	 System.out.println("Enter position 1. forward 2. guard \n >");
	 pos = 	input.nextInt();
         
         b.setStatistics(nom,total,now);
         
         System.out.println("Enter 1 to play a game or 0 to not!");
         flag = input.nextInt();
         
         if(flag==1){
          b.playGame();
         }
         
         System.out.println("Player information are:");
         System.out.println("Name : " +b.getName());
         int[] ob = b.getStatistics();
         
	 System.out.println("Number of matches : " +ob[0]);
         System.out.println("Number of baskets : " +ob[1]);
         System.out.println("Number of wins : " +ob[2]);
	 payroll py = new payroll(pos,ob[1],ob[2]);
	 System.out.println("Salary :"+py.salary() );
          break;
        }
     
      }
   
   
   
   }while(x<=3);
   
 
  }


}

