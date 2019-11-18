import java.util.Scanner;

public class Writing6{
  public static void main(String [] args){
    Scanner s = new Scanner(System.in);

    double weight, height;

    System.out.println("How much do you weigh in lbs?");
    weight = Double.parseDouble(s.nextLine());

    System.out.println("How tall are you in feet?");
    height = Double.parseDouble(s.nextLine());

    if(height > 6 && weight < 150){
      System.out.println("My how tall and skinny you are!");
    } else if(height < 5 && weight > 400){
      System.out.println("My how short and fat you are!");
    } else if(height  > 6 && weight > 500){
      System.out.println("My how tall and fat you are!");
    } else if(height < 5 && weight < 100){
      System.out.println("My how short and skinny you are!");
    } else {
      System.out.println("You are very average! YAWN!");
    }
  }
}
