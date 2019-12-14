import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Channel {
  public Channel(String network) throws IOException{
   this.name = network;
   s = new Scanner(new File(network + ".txt"));
  }

  public String stream(){
    String screen = GAUSSIAN_NOISE; 

    if(s.hasNext()){
      screen = s.nextLine();
    }

    return screen;
  }

  public String getName(){
    return name;
  }

  public String toString(){
    return getName();
  }

  public static String GAUSSIAN_NOISE = "<GAUSSIAN STATIC>.34.2.92-23-92-935.25029sjlkgset39690)(%*)(^*@#(@)(^)(@#%)TLj..c...gdkgkjp[][ppppfj4309506390346t#%*(@)@(%(@)// fjkalsf;lsksjflkslskkdfjsk...<NO BROADCAST>";
  private Scanner s;
  private String name;
}
