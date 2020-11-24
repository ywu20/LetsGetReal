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
  }
}
