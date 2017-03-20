import java.util.*;

public class burrito{
   public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      for(int b = 0; b<a; b++){
         int volume = in.nextInt();
         int radius = in.nextInt();
         int width = in.nextInt();
         int length = in.nextInt();
         int blength = volume/((int)((Math.PI)*(Math.pow(radius, 2))));
         if(length>=(blength+2*radius) || width>=(blength+2*radius)){
            if(width>=(int)(2*(Math.PI)*radius)){
               System.out.println("Burrito #"+(b+1)+": Don\'t worry, the burrito fits!");
            }
         }
         else if(width>=(blength+2*radius)){
            if(length>=(int)(2*(Math.PI)*radius)){
               System.out.println("Burrito #"+(b+1)+": Don\'t worry, the burrito fits!");
            }
         }
         else{
         System.out.println("Burrito #"+(b+1)+": Looks like a cold burrito today.");
         }
      }
   }
}