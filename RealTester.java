public class RealTester {
  public static void main(String[] args) {
    RealNumber x = new RealNumber(3);
    RealNumber y = new RealNumber(3.00000003);
    System.out.println(x.equals(y));
    System.out.println(x.add(y));
    System.out.println(x.multiply(y));
    System.out.println(y.divide(x));
    System.out.println(x.subtract(y));
  }
}
