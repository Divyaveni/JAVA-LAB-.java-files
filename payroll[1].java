package payroll;

import java.util.*;

public class payroll{
	
	int basic;
	int comp1;
	int comp2;
	public payroll(int pos, int r, int w){
		if (pos == 1) basic =1000;
		else if( pos == 2) basic = 2000;
		else basic = 1500;
		comp1 = r*100;
		comp2 = w*200;
	}
	public int salary(){
		return basic+comp1+comp2;
	}
}


