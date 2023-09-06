public class Box {

  private double l;
  private double w;
  private double h;
  
  public void box(){
    l=0;
    w=0;
    h=0;
  }

  public void setL(double l) {
    this.l=l;
  }

  public void setW(double w) {
    this.w=w;
  }

  public void setH(double h) {
    this.h=h; 
  }

  public double calcVol() {
    double vol = l*w*h;
    return vol;
  }

  public double calcSurfArea () {
    double sa = 2 * (l*w + l*h + h*w);
    return sa;
  }
}