import java.lang.Math;

public class Pyramid {

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
    double vol = (l*w*h)/3;
    return vol;
  }

  public double calcSurfArea () {
    double sa = (l*w) + (l * Math.sqrt(w/2 * w/2 + h*h)) + (w * (Math.sqrt(l/2*l/2 + h*h)));
    return sa;
  }
}
