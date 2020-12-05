public class RationalNumber extends Number {
  private int numerator, denominator;
  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    }
    else if (deno < 0) {
      numerator = Math.abs(nume);
      denominator = Math.abs(deno);
      reduce();
    }
    else {
      numerator = nume;
      denominator = deno;
      reduce();
    }
  }

  public double getValue(){
    return (double) numerator/denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber result = new RationalNumber(denominator, numerator);
    return result;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return numerator == other.getNumerator() && denominator == other.getDenominator();

  }

  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    if (denominator == 1 || numerator == 0) {
      return numerator + "";
    }
    return numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    if (a==0) {
      return b;
    }
    if (a < b) {
      int c = a;
      a = b;
      b = c;
    }
    int y = a % b;
    while (y != 0) {
      a = b;
      b = y;
      y = a % b;
    }
    return b;
    /*use euclids method or a better one*/
  //  http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
  }
  private void reduce(){
    int x = gcd(Math.abs(numerator), denominator);
    numerator = numerator / x;
    denominator = denominator / x;
  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    RationalNumber result = new RationalNumber(numerator * other.getNumerator(), denominator* other.getDenominator());
    return result;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return null;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    return null;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return null;
  }
}
