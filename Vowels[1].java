import java.util.*;

class Vowels{
    
    public static void main(String[] args){
        int count=0,i,k=0,j;
        String sentenceArray = new String();
        String startsA = "";
        String startsE = "";
        String startsI = "";
        String startsO = "";
        String startsU = "";
        String[] sentence = {"", "", "", "", ""};
        Scanner sc = new Scanner(System.in);        
        sentenceArray = sc.nextLine();
        for(j=0;j<sentenceArray.length();j++){
            if(sentenceArray.charAt(j)==' '){
                if(sentenceArray.charAt(j+1) == 'a' || sentenceArray.charAt(j+1) == 'A'){
                    count++;System.out.println("A");
                    
                    for( i=j+1;sentenceArray.charAt(i) !=' '&&sentenceArray.charAt(i) !='.';i++);
                    startsA += sentenceArray.substring(j+1, i);
                    startsA += ",";                    
                }
                if(sentenceArray.charAt(j+1) == 'e' || sentenceArray.charAt(j+1) == 'E'){
                    count++;System.out.println("e");
                    for( i=j+1;sentenceArray.charAt(i) !=' '&&sentenceArray.charAt(i) !='.';i++);
                    startsE += sentenceArray.substring(j+1, i);
                    startsE += ",";                    
                }
                if(sentenceArray.charAt(j+1) == 'i' || sentenceArray.charAt(j+1) == 'I'){
                    count++;System.out.println("i");
                    for( i=j+2;sentenceArray.charAt(i) !=' ' && sentenceArray.charAt(i) !='.' ;i++);  startsI += sentenceArray.substring(j+1, i);
                    startsI += ",";                    
                }
                if(sentenceArray.charAt(j+1) == 'o' || sentenceArray.charAt(j+1) == 'O'){
                    count++;System.out.println("o");
                    for( i=j+1;sentenceArray.charAt(i) !=' '&&sentenceArray.charAt(i) !='.';i++);  startsO += sentenceArray.substring(j+1, i);
                    startsO += ",";                    
                }
                if(sentenceArray.charAt(j+1) == 'u' || sentenceArray.charAt(j+1) == 'U'){
                    count++;System.out.println("u");
                    for( i=j+1;sentenceArray.charAt(i) !=' '&&sentenceArray.charAt(i) !='.';i++);  startsU += sentenceArray.substring(j+1, i);
                    startsU += ",";                    
                } 
            }
        }
        for(j=0;j<sentenceArray.length();j++){
            if(Character.isDigit(sentenceArray.charAt(j))){
                i=j+1;
                while(Character.isDigit(sentenceArray.charAt(i))){ i++; }
                System.out.println(i+" "+j);
                sentence[k] += sentenceArray.substring(j, i);
                sentence[k] += ",";
                j=i;
            }
            if(sentenceArray.charAt(j) =='.') k++;
        }
        System.out.println("No of words that start with vowels: "+count);
        System.out.println("A: "+startsA);
        System.out.println("E: "+startsE);
        System.out.println("I: "+startsI);
        System.out.println("O: "+startsO);
        System.out.println("U: "+startsU);  
        System.out.println("========================"+k);
        
        for(i=0;i<5;i++){
             System.out.println("Sentence"+(i+1)+"- "+sentence[i]);
        }
    }
}   