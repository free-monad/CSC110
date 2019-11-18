public class Writing3{
  public static void main(String [] args){
    String original = "abcdefghij";
    String shifted = "";

    for(int i = 0; i < original.length(); i++){
      shifted += (char) ((original.charAt(i) + 4));
    }

    System.out.println(shifted);
  }
}
