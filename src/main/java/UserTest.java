public class UserTest {
    public static void main(String[] args){

        User[] users=new User[]{"userOne","userTwo","userThree","userFour"};


        User userOne=new User("Kasia",42);
        System.out.println(userOne.getName()+userOne.getYear());

        User userTwo=new User("Krystian",18);
        System.out.println(userTwo.getName()+userTwo.getYear());

        User userThree=new User("Michał",32);
        System.out.println(userThree.getName()+userThree.getYear());

        User userFour=new User("Aneta",24);
        System.out.println(userFour.getName()+userFour.getYear());
    }
}
