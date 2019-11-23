public class UserTest {
    public static void main(String[] args){

        User example=new User(String name, int year);
        int[] years = new int[]{42, 18, 32, 24};
        int i = example.calculateYearsSumAndReturnAverage(years);
        System.out.println(i);

        User userOne=new User("Kasia",42);
        System.out.println(userOne.getName()+userOne.getYear());

        User userTwo=new User("Krystian",18);
        System.out.println(userTwo.name+userTwo.year);

        User userThree=new User("Michał",32);
        System.out.println(userThree.name+userThree.year);

        User userFour=new User("Aneta",24);
        System.out.println(userFour.name+userFour.year);
    }
}
