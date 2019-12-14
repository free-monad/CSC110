import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class UseExisting05{
  public static void main(String [] args) throws IOException{
    Television tv = new Television();
    tv.receiveCommand(Television.TURN_ON);
    tv.programChannel(1, new Channel("mtv"));
    tv.programChannel(2, new Channel("cn"));
    tv.programChannel(3, new Channel("cmt"));
    tv.programChannel(4, new Channel("tbs"));
    tv.programChannel(5, new Channel("cnn"));

    System.out.println(findCmt(tv));
  }

  public static int findCmt(Television tv){
    int val = -1;

    for(int i =0; i < Television.HIGHEST_CHANNEL; i++){
      if(tv.getCurrentNetwork().equals("cmt")){
        val = tv.getCurrentChannelNumber();
      }

      tv.receiveCommand(Television.UP_ONE_CHANNEL);
    }
 
    return val;
  }
}
