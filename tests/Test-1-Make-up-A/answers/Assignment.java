import java.util.Scanner;
import java.util.Random;

public class Assignment {
    public static void main(String [] args) {


        Scanner s = new Scanner(System.in);
        Random r = new Random();

        String input = "";

        String c1, c2, c3, c4, c5;

        System.out.println("Give me a letter");
        c1 = s.nextLine();

        System.out.println("Give me another letter");
        c2 = s.nextLine();

        System.out.println("Give me another letter");
        c3 = s.nextLine();

        System.out.println("Give me another letter");
        c4 = s.nextLine();

        System.out.println("Give me another letter");
        c5 = s.nextLine();


        while (!(input.toLowerCase().trim().equals("done") || input.toLowerCase().trim().equals("exit"))) {
            String randomString = "";

            for (int i = 0; i < 10; i++) {
                switch (r.nextInt(5)) {
                    case 0:
                        randomString += c1;
                        break;
                    case 1:
                        randomString += c2;
                        break;
                    case 2:
                        randomString += c3;
                        break;
                    case 3:
                        randomString += c4;
                        break;
                    case 4:
                        randomString += c5;
                        break;
                }
            }
            System.out.println("Your random string is: " + randomString);

            System.out.println("");
            System.out.println("If you are finished type done or exit");
            input = s.nextLine();
        }
    }
}
