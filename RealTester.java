public class RealTester {
  public static void main(String[] args) {
    RealNumber x = new RealNumber(3);
    RealNumber y = new RealNumber(3.00000003);
    System.out.println(x.equals(y));
    System.out.println(x.add(y));
    System.out.println(x.multiply(y));
    System.out.println(y.divide(x));
    System.out.println(x.subtract(y));

    RationalNumber z = new RationalNumber(2,4);
    System.out.println(z.getValue());
    System.out.println(z.getNumerator());
    System.out.println(z.getDenominator());
    System.out.println(z.reciprocal());
    RationalNumber a = new RationalNumber(1,2);
    System.out.println(z.equals(a));
    System.out.println(z.toString());
    System.out.println(z.multiply(a));
    System.out.println(z.divide(a));
    System.out.println(z.add(a));
    System.out.println(z.subtract(a));
  }
}
