public class Television{

  public Television(){
    isOn = false;
    currentChannel = 1;
    volume = 5;
  }

  public void programChannel(int number, Channel c){
    switch(number){
      case 1:
        c1 = c;
        break;
      case 2:
      	c2 = c;
      	break;
      case 3:
 	c3 = c;
        break;
      case 4:
	c4 = c;
	break;
      case 5:
	c5 = c;
	break;
      default:
	c5 = c;
    }
  }

  private void increaseVolume(){
   if(volume < HIGHEST_VOLUME){
     volume++;
   }
  }

  private void decreaseVolume(){
    if(volume > LOWEST_VOLUME){
      volume--;
    }
  }

  private void upOneChannel(){
    if(currentChannel < HIGHEST_CHANNEL){
      currentChannel++;
    } else {
      currentChannel = LOWEST_CHANNEL;
    }
  }

  private void downOneChannel(){
    if(currentChannel > LOWEST_CHANNEL){
      currentChannel--;
    } else {
      currentChannel = HIGHEST_CHANNEL;
    }
  }

  public String receiveBroadcast(){
    String stream = "<Tv is off>";

    if(isOn){
      if(getCurrentChannel() != null){
        stream = getCurrentChannel().stream();
      } else{
        stream = Channel.GAUSSIAN_NOISE;
      }
    }

    return stream;
  }

  private Channel getCurrentChannel(){

    Channel channelToReturn = null;

    switch(currentChannel){
      case 1:
        channelToReturn = c1;
	break;
      case 2:
	channelToReturn = c2;
	break;
      case 3:
	channelToReturn = c3;
	break;
      case 4:
	channelToReturn = c4;
	break;
      case 5:
	channelToReturn = c5;
	break;
    }

    return channelToReturn;
  }

  private void dispatchCommand(String c){
    switch(c){
      case TURN_ON:
	turnOn();
	break;
      case TURN_OFF:
	turnOff();
	break;
      case UP_ONE_CHANNEL:
	upOneChannel();
	break;
      case DOWN_ONE_CHANNEL:
	downOneChannel();
	break;
      case INCREASE_VOLUME:
	increaseVolume();
	break;
      case DECREASE_VOLUME:
	decreaseVolume();
	break;
    }
  }

  private void turnOn(){
    isOn = true;
  }

  private void turnOff(){
    isOn = false;
  }

  public void receiveCommand(String c){
    if(isOn){
      
      String [] splitted = c.split(" ");

      for(int i = 0; i < splitted.length; i++){
        dispatchCommand(splitted[i]);
      }

    } else{

     if(c.equals("turnOn")){
       dispatchCommand(c);
     }

    }
  }

  public int getVolume(){
    return volume;
  }

  public int getCurrentChannelNumber(){
    return currentChannel;
  }

  public String getCurrentNetwork(){
    return getCurrentChannel().getName();
  }
  
  public String toString(){
    String str = "";

    str += ("\nSet: " + (isOn ? "On" : "Off") + "\n");
    str += ("Channel " + getCurrentChannelNumber() + ": " +  getCurrentChannel() + "\n"); 
    str += ("Volume: " + getVolume() + "\n\n");

    return str;
  }

  public static final String TURN_ON = "turnOn";
  public static final String TURN_OFF = "turnOff";
  public static final String UP_ONE_CHANNEL = "upOneChannel";
  public static final String DOWN_ONE_CHANNEL = "downOneChannel";
  public static final String INCREASE_VOLUME = "increaseVolume";
  public static final String DECREASE_VOLUME = "decreaseVolume";

  public static final int LOWEST_CHANNEL = 1;
  public static final int HIGHEST_CHANNEL = 5;
  public static final int LOWEST_VOLUME = 0;
  public static final int HIGHEST_VOLUME = 10;

  private Channel c1;
  private Channel c2;
  private Channel c3;
  private Channel c4;
  private Channel c5;

  private boolean isOn;
  private int volume;
  private int currentChannel;
  
}
