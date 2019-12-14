import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class SlotMachine{

  public SlotMachine(){
    moneyPot = 1000000;
  }


  public SlotMachine(String filename) throws IOException{
    Scanner s = new Scanner(new File(filename));
    moneyPot = s.nextDouble();
  }


  public double pullLever(double bet){
    slot1 = spin();
    slot2 = spin();
    slot3 = spin();  

    double jackpot = 0.00;

    if(hasHitJackpot()){
      jackpot = bet * 10;
      moneyPot -= jackpot;

      if(moneyPot < 0){
        moneyPot = 0.00;
      }
    }

    return jackpot;
  }


  public double getMoneyPot(){
    return moneyPot;
  }
  

  public void save(String filename) throws IOException{
    PrintWriter w = new PrintWriter(new File(filename));
    w.print(moneyPot);
    w.close();
  }


  public String toString(){
   return Character.toString(slot1) + Character.toString(slot2) + Character.toString(slot3);
  }

  private static int getRandom1to3(){
   return (int) Math.ceil(Math.random() * 3);
  }


  private static char charMap(int val){
    char c = ' ';

    switch(val){
      case SMILEY_INT:
        c = SMILE_CHAR;
	break;
      case HEART_INT:
	c = HEART_CHAR;
	break;
      case SEVEN_INT:
	c = SEVEN_CHAR;
	break;
      default:
	c = ' ';
	break;
    }

    return c;
  }


  private static char spin(){
    return charMap(getRandom1to3());
  }


  private boolean hasHitJackpot(){
   return slot1 == slot2 && slot2 == slot3;
  }


  public static final int SMILEY_INT = 1;
  public static final int HEART_INT = 2;
  public static final int SEVEN_INT = 3;

  public static final char SMILE_CHAR = '\u263A';
  public static final char HEART_CHAR = '\u2764';
  public static final char SEVEN_CHAR = '\u0037';

  private char slot1;
  private char slot2;
  private char slot3;
  private double moneyPot;
}
