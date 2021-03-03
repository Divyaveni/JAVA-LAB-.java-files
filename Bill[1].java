import java.util.Scanner;
public class Bill {
         String name;
         Long phno;
         float unit;
         float hire_charge;
         double bill;

        Bill(String consumer,Long phone, int uniti )
        {
                name=consumer;
                phno=phone;
                unit=uniti;
        }
        public  void cal_bill() {
                Scanner scan = new Scanner(System.in);
                System.out.println("\nenter the hire charges ");
                hire_charge=scan.nextFloat();
                if(unit<=100)
                {
                         bill=hire_charge+unit*1;
                         display();
                }
                else if(unit>100 && unit<=200)
                {       unit=unit-100;
                        bill=hire_charge+100+unit*1.5;
                        display();

                }
                else
                {
                        unit=unit-200;
                        bill=hire_charge+250+unit*2;
                        display();
                        

                }
                
        }
        public  void display() {
                
                if (bill==0) {
                        System.out.println("pls insert the value");
                        
                }
                else{
                        System.out.println("************bill*****************");
                        System.out.println(" name:"+name);
                        System.out.println(" phone number:"+phno);
                        System.out.println(" unit consume :"+unit);
                        System.out.println(" hire_charges:"+hire_charge);
                        System.out.println(" total billl to pay:"+bill);
                }
                
        }

        
}

class Main {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the consumer name ");
        String name=scan.next();
        System.out.println("consumer phone  ");
        long phne=scan.nextLong();
        System.out.println(" consumed unit ");
        int unit =scan.nextInt();


        Bill s =new Bill(name,phne,unit);
        s.cal_bill();

        


}

    }