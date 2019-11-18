public class Writing2 {
  public static void main(String [] args){
   System.out.println(Math.round(Math.random()));
   
   /*alternatively*/
   double r = Math.random();

   if(r < 0.5){
    r = 0;
   } else {
    r = 1;
   }

   System.out.println(r);
  }

}
