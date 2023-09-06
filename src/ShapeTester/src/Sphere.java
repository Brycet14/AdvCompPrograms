public class Sphere {
  
  private double r;
  private double pi = 3.14;

  public void sphere() {
    r=0;
  }

  public void setR(double r) {
    this.r=r;
  }

  public double calcVol(){    
    double vol = (4/3)*pi*(r*r*r);
    return vol;
  }

  public double calcSurfArea (){
    double sa = 4 * pi * (r*r);
    return sa;
  }
}