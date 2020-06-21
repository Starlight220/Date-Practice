public class Date {
  private long year;
  private int month;
  private int day;

  public Date(int day, int month, long year){
    //you fill here
  }

  public boolean equals(Date other) {
    boolean day_bool = this.day == other.day;
    boolean month_bool = this.month == other.month;
    boolean year_bool = this.year == other.year;
    return day_bool && month_bool && year_bool;
  }

  public String toString(){
    return String.format("%d/%d/%d", this.day, this.month, this.year);
  }

  public int getDay(){
    return this.day;
  }
  public int getMonth(){
    return this.month;

  }  public long getYear(){
    return this.year;
  }

  public void setMonth(int month){
    if (month > 0 && month <= 12) {
      this.month = month;
    }
  }
  public void setDay(int day){
    if (day > 0 && day <= 30){
      this.day = day;
    }
  }

  public void setYear(int year) {
    if (year > 0) {
      this.day = year;
   }

}