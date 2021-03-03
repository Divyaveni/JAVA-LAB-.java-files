import java.util.Scanner;

class StoreData	{
	int top, bottom;
	void insert(int data)	{
	}
	void delete()	{
	}
}

class Stack extends StoreData	{
	int max=100;
	int stack[]= new int[max];
	int top=-1;
	void insert(int data)	{
		if(top>=max-1) {
			System.out.println("Stack is full!");
			System.exit(1);
		}
		stack[++top]=data;
		System.out.println(data+" is inserted.");
	}
	void delete()	{
		if(top<0)	{
			System.out.println("Stack is empty!");
			System.exit(1);
		}
		else {
			int x= stack[top--];
			System.out.println(x+" is deleted.");
		}
	}				
}

class Queue extends StoreData	{
	int max=100;
	int queue[]= new int[max];
	int top=-1;
	int bottom=-1;
	void insert(int data)	{
		if(bottom>=max) {
			System.out.println("Queue is full!");
			System.exit(1);
		}
		else {
			queue[bottom+1]=data;
			System.out.println(queue[bottom+1]+" is inserted.");
			bottom++;
		}
	}
	void delete()	{
		if(bottom<0 || queue[top+1]==0)	{
			System.out.println("Queue is empty!");
			System.exit(1);
		}
		else	{
			System.out.println(queue[top+1]+" is deleted.");
			top++;
		}
	}
}

class Main	{
	public static void main(String args[])	{
		int n, a=0, b=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1)Stack operation. \t 2)Queue operation. ");
		n = sc.nextInt();
			switch(n)	{
				case 1:
					Stack obj1 = new Stack();
					while(a!=3)	{
						System.out.println("1)Insertion. \t 2)Deletion. \t 3)Exit.");
						a = sc.nextInt();
						switch(a) {
							case 1:
								int val1;
								System.out.println("Enter the value to be inserted: ");
								val1 = sc.nextInt();
								obj1.insert(val1);
								break;
							case 2: 
								obj1.delete();
								break;
							case 3:
								System.exit(1);
								break;
						}
					}
					
				case 2:
					Queue obj2 = new Queue();
					while(b!=3)	{
						System.out.println("1)Insertion. \t 2)Deletion. \t 3)Exit.");
						b = sc.nextInt();
						switch(b) {
							case 1:
								int val2;
								System.out.println("Enter the value to be inserted: ");
								val2 = sc.nextInt();
								obj2.insert(val2);
								break;
							case 2:
								obj2.delete();
								break;
							case 3:
								System.exit(1);
								break;
						}
					}
			}
	}
}