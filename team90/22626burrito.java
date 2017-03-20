import java.util.*;

public class burrito{
   public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      for(int b = 0; b<a; b++){
         double volume = in.nextDouble();
         double radius = in.nextDouble();
         double width = in.nextDouble();
         double length = in.nextDouble();
         double blength = volume/(((Math.PI)*(Math.pow(radius, 2))));
         if(length>=(blength+2*radius) || width>=(blength+2*radius)){
            if(width>=(2*(Math.PI)*radius)){
               System.out.println("Don\'t worry, the burrito fits!");
            }
         }
         else if(width>=(blength+2*radius)){
            if(length>=(2*(Math.PI)*radius)){
               System.out.println("Don\'t worry, the burrito fits!");
            }
         }
         else{
         System.out.println("Looks like a cold burrito today.");
         }
      }
   }
}