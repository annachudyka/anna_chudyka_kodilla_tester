public class LeapYearPractice {
    int year;

    public LeapYearPractice(int year) {
        this.year = year;
    }

    public String ifYearIsLeap() {
        if (this.year % 4 == 0) {
            return ("This year is leap");
        } else if (this.year % 400 != 0){
            return ("This year is leap");
        } else if (this.year % 100 != 0){
            return("This year is leap");
        } else {
            return("This year isn't leap");
        }
    }
}