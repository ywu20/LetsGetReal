public abstract class Number{
  public abstract double getValue();

  /*return 0 when this Number equals the other Number
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  public int compareTo(Number other){
      if(this.equals(other)){
        return 0;
      }
      else if (this.getValue()>other.getValue()){
        return 1;
      }
      else{
        return -1;
      }
    }

  /*
  *Return true when the % difference of the values
  *are within 0.00001 of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(Number other){
    if (this.getValue()==0 || other.getValue()==0){
      return this.getValue()== other.getValue();
    }
    if(Math.abs((other.getValue()-this.getValue())/this.getValue())<=0.00001 || Math.abs((other.getValue()-this.getValue())/other.getValue())<=0.00001){
      return true;
    }
    return false;
  }

}
