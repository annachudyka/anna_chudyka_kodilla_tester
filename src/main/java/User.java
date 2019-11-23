public class User {
    String name;
    int year;

    public User(String name, int year){
        this.name = name;
        this.year = year;
    }
    public String calculateYearsSumAndReturnAverage(User[]users){
        int result=0;
        for(int i=0; i<users.length; i++){
            result+= users[i].getYear();
        }
        result /=users.length;
        return (int) result;
    }
    public String getName(User[]users){
        return this.name;
    }
    public int getYear(User[]users){
        return this.year;
    }
}












