import java.util.Scanner;
class Editor
{
public static void main(String[] args)
{
System.out.println("Enter sentence");
Scanner in7 = new Scanner(System.in);
String S=in7.nextLine();

System.out.println("Press 1 to add new word");
System.out.println("Press 2 to modify existing word spelling");
System.out.println("Press 3 to delete word");
System.out.println("Press 4 to add punctuation");
System.out.println("Press 0 to exit");

Scanner in = new Scanner(System.in);
int n=1;
System.out.println("Existing sentence : "+S);
while(n!=0)
{
System.out.println("Enter your choice");
n=in.nextInt();


switch(n)
{

case 1:
System.out.println("Enter new word");
String s;
Scanner in1 = new Scanner(System.in);
s=in1.nextLine();


String modstr;
System.out.println("Enter the word after which you want to insert new word");
String w;
Scanner in8 = new Scanner(System.in);
w=in8.nextLine();
s=" "+s;
String p=w.concat(s);

modstr=S.replaceAll(w,p);

S=modstr;
System.out.println("Modified sentence :"+modstr);
System.out.println("New string with added word : "+S);
break;

case 2:
System.out.println("Enter existing word");
Scanner in2 = new Scanner(System.in);
String ex=in2.nextLine();

System.out.println("Enter new word to modify :");
Scanner in3 = new Scanner(System.in);
String mod=in3.nextLine();

modstr=S.replaceAll(ex,mod);


S=modstr;
System.out.println("Modified sentence :"+modstr);

break;

case 3:
Scanner in4 = new Scanner(System.in);
System.out.println("Enter word to delete :");
String del=in4.nextLine();


modstr=S.replaceAll(del,"");

S=modstr;
System.out.println("Modified sentence :"+modstr);
break;

case 4:

System.out.println("Enter word after which you want to apply punctuation");
Scanner in5 = new Scanner(System.in);
String ex1=in5.nextLine();

System.out.println("Enter the punctuation");
Scanner in6 = new Scanner(System.in);
String mod1=in6.nextLine();

String punc=ex1.concat(mod1);

modstr=S.replaceAll(ex1,punc);

S=modstr;
System.out.println("Modified sentence :"+modstr);

break;

}
}

}

}


