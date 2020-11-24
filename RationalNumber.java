public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *  If the denominator is negative, negate both numerator and denominator
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(nume/(double)deno);
    if(deno<0){
      deno= -1*deno;
      nume= -1*nume;
    }
    if(deno==0){
      nume=0;
      deno=1;
    }
    numerator=nume;
    denominator=deno;
    reduce();
  }

  public double getValue(){
    return (double)numerator/denominator;
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
    RationalNumber out = new RationalNumber(denominator,numerator);
    return out;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    if(numerator==other.numerator && denominator == other.denominator){
      return true;
    }
    return false;
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return numerator+"/"+denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b)
    {
        if (a == 0)
            return b;

        return gcd(b%a, a);
    }
  /*
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    /*
    int c=Math.max(a,b);
    int d=Math.min(a,b);
    if (d == 0){
        return c;}
    return gcd(c, c%d);
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int GCD=gcd(Math.abs(numerator),denominator);
    numerator=numerator/GCD;
    denominator=denominator/GCD;
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    RationalNumber out =new RationalNumber(other.numerator*numerator, other.denominator*denominator);
    return out;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    other=other.reciprocal();
    return multiply(other);
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int commonDeno=other.denominator*denominator/gcd(other.denominator, denominator);
    RationalNumber out =new RationalNumber(other.numerator*(commonDeno/other.denominator)+numerator*(commonDeno/denominator), commonDeno);
    return out;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    RationalNumber otherAdd = new RationalNumber(-1*other.numerator, other.denominator);
    return add(otherAdd);
  }
}
