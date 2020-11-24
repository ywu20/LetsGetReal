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
    RationalNumber i= new RationalNumber(3,0);
    System.out.println(e.getValue());
    System.out.println(f.getValue());
    System.out.println(g.getValue());
    System.out.println(h.getValue());
    System.out.println(i.getValue());
    
  }
}
