import java.util.*;

public class shift{
   public static void main(String[] args){
   Scanner in = new Scanner(System.in);
   char[] shift ={'~','!','@','#','$','%','^','&','*','(',')','_','+','{','}','|',':','"','<','>','?'};
   char[] jon = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
   
   
   int yo = in.nextInt();
   in.nextLine();
   for(int v = 0; v<yo; v++){
   String a = in.nextLine();
   int ma = 0;
   
   for(int x = 0; x<a.length()-1; x++){
   
   for(int c = 0; c<shift.length-1; c++){
   
   
      if(a.charAt(x)==(shift[c])){
      ma++;
      }
      }
      for(int j = 0; j<jon.length-1; j++){
      if(a.charAt(x) == (jon[j])){
      ma++;
      }
      }
   }
   System.out.println("The shift key was pressed "+ma+" times.");
   }
  // if(a.getLabel().equalsIgnoreCase("shift");
   
   
   }
}