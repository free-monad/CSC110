import java.io.IOException;

public class LivingRoom{
  public static void main(String [] args) throws IOException{
    Television tv = new Television();
    Remote remote = new Remote(tv);

    Channel nbc = new Channel("nbc");
    Channel mtv = new Channel("mtv");
    Channel abc = new Channel("abc");

    tv.programChannel(1, nbc);
    tv.programChannel(3, mtv);

    remote.programButton(1, Television.TURN_ON);
    remote.programButton(2, Television.TURN_OFF);
    remote.programButton(3, Television.UP_ONE_CHANNEL);
    remote.programButton(4, Television.DOWN_ONE_CHANNEL);
    remote.programButton(5, Television.INCREASE_VOLUME);
    remote.programButton(6, Television.DECREASE_VOLUME);
    

    String maxVolumeCommandScript = "";

    for(int i = 0; i < Television.HIGHEST_VOLUME; i++){
      maxVolumeCommandScript += (Television.INCREASE_VOLUME + " ");
    }

    remote.programButton(7, maxVolumeCommandScript);
    System.out.println(remote.getButtonCommandScript(7));

    String muteCommandScript = "";

    for(int i = 0; i < Television.LOWEST_VOLUME; i++){
      muteCommandScript += (Television.DECREASE_VOLUME + " ");
    }

    remote.programButton(8, muteCommandScript);
    System.out.println(remote.getButtonCommandScript(8));

    System.out.println(tv);

    remote.press(1);
    remote.press(3);
    remote.press(3);
    remote.press(7);

    System.out.println(tv); 
    
    System.out.println(tv.receiveBroadcast());
    System.out.println(tv.receiveBroadcast());

    remote.press(3);
    remote.press(3);
    remote.press(3);
    
    System.out.println(tv);

    System.out.println(tv.receiveBroadcast());
    System.out.println(tv.receiveBroadcast());

    remote.press(3);
    System.out.println(tv);
    System.out.println(tv.receiveBroadcast());
  }
}
