package player;

import java.util.*;

public class Cricket {
 
  public String nme;
  public int nom,now,total;
 
 public void setName(String name){
   
   nme = name;
   
 }
 
 public String getName(){
 
  return nme;
 
 }
 

 
 public void setStatistics(int nm,int t,int nw){
   nom=nm;
   total = t;
   now = nw;
 }
 
 public int[] getStatistics(){
   return new int[]{nom,total,now};
 }
 
 
 public void playGame(){
 
  nom++;
 
 }
 

}


