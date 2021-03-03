import java.io.*;
import java.util.*;

public class Validate{
	private String[] name;
	private String dob;
	private String emailId;
	private String currentDate;

	private static final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	Validate(String[] name, String dob, String emailId, String currentDate){
		this.name=name;
		this.dob=dob;
		this.emailId=emailId;
		this.currentDate=currentDate;
	}
	Validate(){
		this.name=null;
		this.dob=null;
		this.emailId=null;
		this.currentDate=null;
	}

	public void displayDetails(){
		System.out.println("First Name: "+name[0]);
		System.out.println("Last Name: "+name[1]);
		System.out.println("Date of Birth: "+formatDOB());
		System.out.println("Domain Name: "+validateEmail());
	}
	private String validateEmail(){
		String[] parsedEmail=this.emailId.split("@");
		String domainName=parsedEmail[1];


		if(domainName.split("\\.").length==2){
			return domainName;
		}
		else{
			return "Please enter a valid mail id.";
		}
	}
	public static boolean isLeap(int year){
		if(year%4==0){
			if(year%100!=0)
				return true;
			else
			{
				if(year%400==0)
					return true;
				else
					return false;
			}
		}
		else
			return false;

	}
	public static boolean dateIsValid(String date){
		String[] parsedDate=date.split("/");

		int days=Integer.parseInt(parsedDate[0]);
		int month=Integer.parseInt(parsedDate[1]);
		int year=Integer.parseInt(parsedDate[2]);

		if(year>2099 || year<1000)
			return false;

		else if(!(month>=1 && month<=12))
			return false;

		else if(month==01 || month==03 || month==05 || month==07 || month==8 || month==10 || month==11){
			if(days>31 || days<1)
				return false;
			else
				return true;
		}
		else{
		  	if(month!=02){
				if(days>30 || days<1)
					return false;
				else
					return true;
			}
		  	else
		  	{
		  		if(isLeap(year)){
		  			if(days>29 || days<1)
		  				return false;
		  			else
		  				return true;
		  		}
		  		else{
		  			if(days>28 || days<1)
		  				return false;
		  			else
		  				return true;
		  		}
		    }
		}
	}
	public boolean dobIsValid(){
	  if(!dateIsValid(dob)){
	  	return false;
	  }
	  else
		{
		String[] parsedDob=this.dob.split("/");
		String[] parsedDate=this.currentDate.split("/");

		int dobDay=Integer.parseInt(parsedDob[0]);
		int dobMonth=Integer.parseInt(parsedDob[1]);
		int dobYear=Integer.parseInt(parsedDob[2]);

		int currentDay=Integer.parseInt(parsedDate[0]);
		int currentMonth=Integer.parseInt(parsedDate[1]);
		int currentYear=Integer.parseInt(parsedDate[2]);

		if(dobYear>currentYear){
			return false;
		}
	    else if(dobYear==currentYear && dobMonth>currentMonth){
			return false;
	    }
	    else if(dobYear==currentYear && dobMonth==currentMonth && dobDay>currentDay){
			return false;
	    }
	    else{
	    	return true;
	    }
	   }

	}
	public String formatDOB(){
		if(!this.dobIsValid())
			return "Please enter a valid date.";
		else{
			String[] parsedDOB=this.dob.split("/");

			String day=parsedDOB[0];
			String month=parsedDOB[1];
			String year=parsedDOB[2];

			switch(month){
				case "01":
					return day+"-January-"+year;
				case "02":
					return day+"-February-"+year;

			    case "03":
					return day+"-March-"+year;

			    case "04":
					return day+"-April-"+year;

			    case "05":
					return day+"-May-"+year;

				case "06":
					return day+"-June-"+year;

				case "07":
					return day+"-July-"+year;

				case "08":
					return day+"-August-"+year;

				case "09":
					return day+"-September-"+year;

				case "10":
					return day+"-October-"+year;

				case "11":
					return day+"-November-"+year;

				case "12":
					return day+"-December-"+year;

				default:
					return "default string";
			}
		}
	}
	public static void main(String[] args) throws IOException{
		String[] name=new String[2];
		String currentDate;
		name[0]=args[0];
		name[1]=args[1];

		System.out.print("Enter current date in (dd/mm/yyyy) format: ");
		currentDate=br.readLine().trim();

		if(dateIsValid(currentDate)){
		Validate v=new Validate(name, args[2], args[3], currentDate);
		v.displayDetails();
		}
		else
			System.out.println("Current Date entered is Invalid!");
	}
}
