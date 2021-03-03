
public class Currency {

        String CC;
        String CN;
        Double ER;
        Double TA;

       Currency()
       {
               CC="IND";
               CN="Rupee";
               ER=70.5;
               System.out.println("Currency Code:"+CC +"\ncurrency Name:"+CN +"\nEXchange RAte:"+ ER);
       } 
       Currency(String UCC,String UCN, double UER)
       {
               this.CC=UCC;
               this.CN=UCN;
               this.ER=UER;
               
       }
       void cal(double HM)
       {
               
               TA=HM*ER;
               System.out.println("IND-> "+ CN+" to buy  "+HM+CC+ " is :"+TA );
       }
}

/**
 * ramlal
 */
class Ramlal {
        public static void main(String[] args) {
                
                System.out.println("***************************** ");
                Currency obj =new Currency();
                //***************************** */
                
                Currency obj1 =new Currency("$","Dollor",70.0);
                obj1.cal(50);
                //***************************** */
               
                Currency obj2 =new Currency("EUR","EURO",40.0);
                obj2.cal(30);
                 
                
                 Currency obj3 =new Currency("#","Pound",30.0);
                 obj3.cal(20);
                
                
                
                


        
        }

        
}
