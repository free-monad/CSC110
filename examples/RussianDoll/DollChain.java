public class DollChain {

  public DollChain(RussianDoll r){
    this.outermost = r;
  }


  public DollChain(String name){
    this.outermost = new RussianDoll(name);
  }


  public void add(RussianDoll r){
    r.insertDoll(outermost);
    outermost = r;
  }

  public RussianDoll removeOutermost(){
    RussianDoll previousOutermost = this.outermost;

    this.outermost = this.outermost.getDoll();

    return previousOutermost;
  }

  



  private RussianDoll outermost;
}
