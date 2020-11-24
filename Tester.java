public class Tester{
  public static void main(String[] args){
    RealNumber a = new RealNumber(10.453);
    RealNumber b= new RealNumber(100.2);
    RealNumber c= new RealNumber(Math.sqrt(2));
    RealNumber d= new RealNumber(10.4531);

    System.out.println(a.equals(d));
    System.out.println(a.add(d));
    System.out.println(a.subtract(d));
    System.out.println(a.multiply(d));
    System.out.println(a.divide(d));

    RationalNumber e= new RationalNumber(3,5);
    RationalNumber f= new RationalNumber(-3,5);
    RationalNumber g= new RationalNumber(3,-5);
    RationalNumber h= new RationalNumber(-3,-5);
  //  RationalNumber i= new RationalNumber(3,0);
    System.out.println(e.getValue());
    System.out.println(f.getValue());
    System.out.println(g.getValue());
    System.out.println(h.getValue());
  //  System.out.println(i.getValue());

    System.out.println(e.getNumerator());
    System.out.println(e.getDenominator());

    System.out.println(e.reciprocal());
    System.out.println(f.reciprocal());

    System.out.println(e.equals(f));
    System.out.println(e.equals(h));

    RationalNumber j= new RationalNumber(-10,-5);
    RationalNumber k= new RationalNumber(30,3);

    System.out.println(j);
    System.out.println(k);

    System.out.println(j.add(e));
    System.out.println(k.subtract(f));
    System.out.println(j.multiply(g));
    System.out.println(k.divide(g));



  }
}
