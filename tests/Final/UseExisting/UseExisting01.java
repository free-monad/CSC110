public class UseExisting01{
  public static void main(String [] args){
    Television tv = new Television();
    Remote remote = new Remote(tv);

    tv.receiveCommand(Television.TURN_ON);
    tv.receiveCommand(Television.DECREASE_VOLUME);
    tv.receiveCommand(Television.DECREASE_VOLUME);

    System.out.println(tv);

    String middleVolumeScript = "";

    for(int i = 0; i < Television.HIGHEST_VOLUME; i++){
      middleVolumeScript += (Television.DECREASE_VOLUME + " ");
    }

    for(int i = 0; i < (Television.HIGHEST_VOLUME / 2); i++){
      middleVolumeScript += (Television.INCREASE_VOLUME + " ");
    }

    System.out.println(middleVolumeScript);

    remote.programButton(7, middleVolumeScript);
    
    remote.press(7);
    System.out.println(tv);
  }
}
