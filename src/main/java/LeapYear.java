public class LeapYear {
    int year;

    public LeapYear(int year){
        this.year=year;
    }

    public String checkIfYearIsLeap(){
        if(this.year%400==0) {
            return ("This year is leap");
        }else if(this.year%100==0){
            return("This year isn't leap");
        }else if(this.year%4==0){
            return("This year is leap");
        }else{
            return("This year isn't leap");
        }
    }
}
