public class User {
    String name;
    int year;

    public User(String name, int year){
        this.name=name;
        this.year=year;
    }

    public int calculateYearsSumAndReturnAverage(int[]years){
        float sum = 0;
        for (int i = 0; i < years.length; i++) {
            sum += years[i];
        }
        sum /= years.length;
        return (int) sum;
    }
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
}






