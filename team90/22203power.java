import java.util.*;

public class power{
   public static void main (String[] args){
   Scanner in = new Scanner(System.in);
   String g ="";
   int c = in.nextInt();
   int v = 0;
   for(int d = 0; d<c;d++){
   
   double x = in.nextDouble();

  double y = (Math.pow(2,x)-1);
  //BigDecimal u = new BigDecimal(y);
  //System.out.println(y);
 g = g.valueOf(y);
 for(int e  = 0; e<g.length()-1;e++){
   if(g.charAt(e)== '.'){
   g = g.substring(0,e);
    System.out.println(g);
   }
   else{System.out.println("");
   }
 }
  
  
    
   }
   }
   }
   
