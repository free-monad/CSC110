import java.io.IOException;

public class UseExisting02{
  public static void main(String [] args) throws IOException{
    Television tv = new Television();
    tv.programChannel(2, new Channel("cn"));
  }
}
