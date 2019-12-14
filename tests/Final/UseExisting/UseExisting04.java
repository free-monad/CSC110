import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class UseExisting04{
  public static void main(String [] args) throws IOException{
    Television tv = new Television();
    tv.receiveCommand(Television.TURN_ON);
    tv.programChannel(1, new Channel("mtv"));

    tivo(tv);
  }

  public static void tivo(Television tv) throws IOException{

    PrintWriter x = new PrintWriter("saved-episode.txt");
    
    for(int i =0; i < 5; i++){
      x.println(tv.receiveBroadcast());
    }

    x.close();
  }
}
