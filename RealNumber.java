public class RealNumber extends Number {
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  /*
   *Return true when the values are within 0.001% of eachother.
   *Special case: if one is exactly zero, the other must be exactly zero.
   */
   public boolean equals(RealNumber other){
     return true;
   }

   /*
   *Return a new RealNumber that has the value of:
   *the sum of this and the other
   */
   public RealNumber add(RealNumber other){
     RealNumber sum = new RealNumber(value+other.getValue());
      //other can be ANY RealNumber, including a RationalNumber
      //or other subclasses of RealNumber (that aren't written yet)
      return sum;
   }

   /*
   *Return a new RealNumber that has the value of:
   *the product of this and the other
   */
   public RealNumber multiply(RealNumber other){
     RealNumber product = new RealNumber(value * other.getValue());
     return product;
   }

   /*
   *Return a new RealNumber that has the value of:
   *this divided by the other
   */
   public RealNumber divide(RealNumber other){
     RealNumber quotient = new RealNumber(value / other.getValue());
     return quotient;
   }

   /*
   *Return a new RealNumber that has the value of:
   *this minus the other
   */
   public RealNumber subtract(RealNumber other){
     RealNumber difference = new RealNumber(value - other.getValue());
     return difference;
   }
 }
