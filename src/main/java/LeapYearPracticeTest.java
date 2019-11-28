public class LeapYearPracticeTest {
    public static void main(String[] args){
        LeapYearPractice object=new LeapYearPractice(2010);
        System.out.println(object.ifYearIsLeap());
        //wywołanie metody zwracającej return do obiektu, po kropce metoda oraz przes system.out

        String variableIfYearIsLeap=object.ifYearIsLeap();
        System.out.println(variableIfYearIsLeap);
        //wywołanie metody zwracającej return poprzez utworzenie kolejnej zmiennej


    }
}
