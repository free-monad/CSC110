public class Trace31{
  public static void main(String [] args){
    String activitypub = "";

    System.out.println("Whiplash");
    
    int ostatus = 1;
    
    while(!activitypub.equals("aaaa")){
      System.out.println("Fleabag" + ostatus);
    
      for(int i=0; i<2; i++){
        System.out.println("ostatus" + ostatus + " loop iteration " + i);
        activitypub += "a";
      }
    
      ostatus++;
    }
    
    System.out.println("Russian Doll"); 
  }
}
