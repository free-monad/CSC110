public class U1 {
  public static void main (String [] args){
    Die a = new Die(12, "a");
    Die b = new Die(7, "b");

    for(int i = 0; i < 3; i++){
      a.roll();
      b.roll();
    }

    int aThirdRollValue = a.getCurrentSide();
    int bThirdRollValue = b.getCurrentSide();
    int sumOfThirdRoll = aThirdRollValue + bThirdRollValue;

    System.out.println(a);
    System.out.println(b);
   
    int maximumPossibleRoll = a.getNumberOfSides() + b.getNumberOfSides();

    if(sumOfThirdRoll < maximumPossibleRoll){
      System.out.println("Distance from maximum roll: " + (maximumPossibleRoll - sumOfThirdRoll));
    } else{
      System.out.println("Congrats! You rolled the highest possible roll!");
    }
  }
}
