class Main {
  public static void feelGood()
  {
    System.out.println("It is Monday!!  I am feeling great and ready to learn today!!");
  }
  public static void add2(int n)
  {
    System.out.println(2 + n);
  }

  // #1
  public static int add2Return(int n)
  {
    return 2 + n;
  }

  // #2 circumference method 
  public static double circum(double r)
  {
    return 2 * 3.14 * r;
  }

  // #3 area of a circle method areaCir, hint: a = 3.14 * r^2
  public static double areaCir(double radius)
  {
    // return (3.14 * radius * radius);
    //return 3.14 * Math.pow(radius, 2);
    return Math.PI * Math.pow(radius, 2);
  }

  // #4 Area of a square, areaSq method of side s. Test with side = 5
  public static double areaSq(double s)
  {
    //return Math.pow(s, 2);
    return s * s;
  }

  // #5 perimeterRect method of side w, h.  Test with w=3, h=4
  public static double perimeterRect(double h, double w)
  {
    return 2*h + 2*w;
  }

  // #6 areaRect method of sides w, h. Test with w = 3.0 and h = 4.0
  public static double areaRect(double h, double w)
  {
    return h * w;
  }

  // #7 volume of sphere. Method volSphere(). Test it with r=3.
  


  public static void main(String[] args) {
    // feelGood();
    // Monday.feelGood();
    // add2(3);
    // int x = add2Return(13);
    // int y = x * 3;
    // System.out.println(y);

    int radius = 3;
    System.out.println(circum(radius));
    double r = 3;
    System.out.println(areaCir(r));

    double s = 5;
    System.out.println(areaSq(s));
    double w = 3;
    double h = 4;
    System.out.println(perimeterRect(h, w));
    h = 4.5;
    w = 3.5; 
    System.out.println(areaRect(h, w));


  }

  // Returning Methods

}