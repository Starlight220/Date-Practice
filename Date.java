public class Date {
  private long year;
  private int month;
  private int day;

  public Date(int day, int month, long year){
    if(day < 31 && month < 13){
      this.day = day;
      this.month = month;
      this.year = year;
    }
    else{
      System.out.println("Error");
    }
  }

  public boolean equals(Date other) {
    return false; //you write here (this == other)
  }

  public String toString(){
    return ("Year: " + this.getYear() + ". \n" + "Month: " + this.getMonth() + ". \n" + "Day: " + this.getDay() + ".");
  }

  public int getDay(){
    return this.day;
  }
  public int getMonth(){
    return this.month;
  }
  public long getYear(){
    return this.year;
  }

  public boolean isBefore(Date other) {
    boolean answer = false;
    if (this.getYear()<other.getYear()) {answer = true}
    else if (this.getYear()==other.getYear() && this.getMonth()<other.getMonth()){answer = true}
    else if (this.getYear()==other.getYear() && this.getMonth()==other.getMonth() && this.getDay()<other.getDay()){answer = true}
    return answer;

    // return other.getYear() > this.year || (other.getYear() == this.year && (other.getMonth() > this.month || (other.getMonth() == this.month && other.getDay() > this.day)));
  }


  //setters

}