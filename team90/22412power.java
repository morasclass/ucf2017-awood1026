import java.util.*;

public class power{
   public static void main (String[] args){
   Scanner in = new Scanner(System.in);
 
   int c = in.nextInt();
  
   
   for(int d = 0; d<c;d++){
   
   int x = in.nextInt();
   int f = 2;
   if(x>0){
  
for(int b = 0; b<x; b++){

f = f*2;
//System.out.println(f);
   }
   //f =f-1;
   
System.out.println(f-1);
f = 2;
}
else if(x<0 && x%2 == 0){
x = x*-1;
for(int b = 0; b<x; b++){

f = f*2;
   }
  
System.out.println(f-1);
f = 2;
}
else if(x<0 && x%2!= 0){
x =x*-1;
for(int b = 0; b<x; b++){
f = f*2;
   }
   f =(f-1)*-1;
System.out.println(f);
f = 2;
}
}
}
}
  //double y = (Math.pow(2,x)-1);

// g = g.valueOf(y);


  // else{System.out.println("");
   //}
 
  
  
    
   

