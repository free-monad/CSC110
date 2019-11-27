public class Remote{
  public Remote(Television tv){
    this.tv = tv;
  }

  public void press(int buttonNumber){
    switch(buttonNumber){
      case 1:
        tv.receiveCommand(button1);
	break;
      case 2:
	tv.receiveCommand(button2);
	break;
      case 3:
	tv.receiveCommand(button3);
	break;
      case 4:
	tv.receiveCommand(button4);
	break;
      case 5:
	tv.receiveCommand(button5);
	break;
      case 6:
	tv.receiveCommand(button6);
	break;
      case 7:
	tv.receiveCommand(button7);
	break;
      case 8:
	tv.receiveCommand(button8);
	break;
    }
  }

  public void programButton(int buttonNumber, String command){
    switch(buttonNumber){
      case 1:
        button1 = command;
	break;
      case 2:
	button2 = command;
	break;
      case 3:
	button3 = command;
	break;
      case 4:
	button4 = command;
	break;
      case 5:
	button5 = command;
	break;
      case 6:
	button6 = command;
	break;
      case 7:
	button7 = command;
	break;
      case 8:
	button8 = command;
	break;
    }
  }

  public String getButtonCommandScript(int buttonNumber){
      String commandScript = "";

      switch(buttonNumber){
        case 1:
          commandScript = button1;
          break;
        case 2:
          commandScript = button2;
          break;
        case 3:
          commandScript = button3;
          break;
        case 4:
          commandScript = button4;
          break;
        case 5:
          commandScript = button5;
          break;
        case 6:
          commandScript = button6;
          break;
        case 7:
          commandScript = button7;
          break;
        case 8:
          commandScript = button8;
          break;	  
      }

      return commandScript;
  }
  

  public String toString(){
    String strRemote = "";

    strRemote += ("button1: " + button1);
    strRemote += ("button2: " + button2);
    strRemote += ("button3: " + button3);
    strRemote += ("button4: " + button4);
    strRemote += ("button5: " + button5);
    strRemote += ("button6: " + button6);
    strRemote += ("button7: " + button7);
    strRemote += ("button8: " + button8);

    return strRemote;
  }

  private String button1;
  private String button2;
  private String button3;
  private String button4;
  private String button5;
  private String button6;
  private String button7;
  private String button8;

  private Television tv;
}
