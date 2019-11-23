public class User {
    int year;

    public User(int year) {
        this.year = year;
    }

    public int checkSum(int[]years){
        float sum = 0;
        for (int i = 0; i < years.length; i++) {
            sum += years[i];
        }
        sum /= years.length;
        return (int) sum;
    }
}






