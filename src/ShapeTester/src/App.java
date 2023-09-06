import java.util.Scanner;

public class App {


    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to shape tester! \n to make a box press 1 \n to make a sphere press 2 \n to make a pyramid press 3,\n to exit press 0");
    int start = sc.nextInt();
    Box b1 = new Box();
    Sphere s1 = new Sphere();
    Pyramid p1 = new Pyramid();
    double val = 0.0;
 
    
    if (start == 1) {
      System.out.println("Please enter box length");

      while(sc.hasNext()){
        if(sc.hasNextDouble()){
      val = sc.nextDouble();
      b1.setL(val);

      System.out.println("Please enter box width");
      val = sc.nextDouble();
      b1.setW(val);

      System.out.println("Please enter box height");
      val = sc.nextDouble();
      b1.setH(val);

      System.out.println("Volume: " + b1.calcVol());
      System.out.println("Surface Area: " + b1.calcSurfArea());

          while(!isDouble(Double.toString(val))) {
      System.out.println("Invalid input. Please enter a valid double");
      System.out.println("Please enter correct measurement");
      val = sc.nextDouble();
    }
        }
    }
  }

    if (start == 2) {
      System.out.println("Please enter sphere radius");
      val = sc.nextDouble();
      s1.setR(val);

      System.out.println("Volume: " + s1.calcVol());
      System.out.println("Surface Area: " + s1.calcSurfArea());
    }

    if (start == 3) {
      System.out.println("Please enter pyramid length");
      val = sc.nextDouble();
      p1.setL(val);

      System.out.println("Please enter pyramid width");
      val = sc.nextDouble();
      p1.setW(val);

      System.out.println("Please enter pyramid height");
      val = sc.nextDouble();
      p1.setH(val);

      System.out.println("Volume: " + p1.calcVol());
      System.out.println("Surface Area: " + p1.calcSurfArea());

          while(!isDouble(Double.toString(val))) {
      System.out.println("Invalid input. Please enter a valid double");
      System.out.println("Please enter correct measurement");
      val = sc.nextDouble();
    }
    }

    if(start == 0){
      System.exit(0);
      sc.close();
    }
    }

        public static boolean isDouble(String userInput) {
      try {
        double userDouble = Double.parseDouble(userInput);
        return true;
      } catch(NumberFormatException e) {
        return false;
      }
    }

}
    
