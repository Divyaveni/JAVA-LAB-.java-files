import java.util.*;

class Employee {
	long id;
	String name;
	int basic;// da, hra;

	/*public void payscale(int basic, int da, int hra){
		this.basic = basic;
		this.da = da;
		this.hra = hra;
	}*/

	public double salary(){ return 0.0; }
}

class Manager extends Employee {

	Manager(String name, long id, int basic){
		this.name =name;
		this.id =id;
		this.basic = basic;
	}
	public double salary(){
		return basic + 0.02*basic +  0.04*basic;
	}

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("M A N A G E R");
		System.out.print("Name : ");
		String name = sc.nextLine();		
		System.out.print("Id : ");
		long id = sc.nextLong();
		System.out.print("Basic Pay : ");
		int basic = sc.nextInt();
		Manager manager = new Manager(name, id, basic);
		System.out.println("\n Your Salary : "+manager.salary());
	}
}

class Clerk extends Employee {

	Clerk(String name, long id, int basic){
		this.name =name;
		this.id =id;
		this.basic = basic;
	}
	public double salary(){
		return basic ;
	}

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("C L E R K");
		System.out.print("Name : ");
		String name = sc.nextLine();		
		System.out.print("Id : ");
		long id = sc.nextLong();
		System.out.print("Daily rate : ");
		int basic = sc.nextInt();
		System.out.print("Oertime : ");
		basic += sc.nextInt();
		Clerk clerk = new Clerk(name, id, basic);
		System.out.println("\n Your Salary : "+clerk.salary());
	}
}

class Officer extends Employee {

	Officer(String name, long id, int basic){
		this.name =name;
		this.id =id;
		this.basic = basic;
	}
	public double salary(){
		return basic + 0.02*basic;
	}

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("M A N A G E R");
		System.out.print("Name : ");
		String name = sc.nextLine();		
		System.out.print("Id : ");
		long id = sc.nextLong();
		System.out.print("Basic Pay : ");
		int basic = sc.nextInt();
		Officer officer = new Officer(name, id, basic);
		System.out.println("\n Your Salary : "+officer.salary());
	}
}