public class VariablesPracticeTest {
    public static void main(String[] args){
        String word="Life";
        String word1="";
        String word2=" \nis \ngreat";
        String text=word+word1+word2;
        System.out.println(text);

        String example="Next example";


        System.out.println("");
        System.out.println(example);
        boolean text1=(0>10);
        System.out.println(text1);

        System.out.println(example);
        int age;
        String myName;
        age=30;
        myName="Anna";
        System.out.println(myName+" "+age);
        System.out.println("");
        System.out.println(example);

        int a=10;
        int b=4;
        int sum=a+b;
        int sub=a-b;
        int multi=a*b;
        int div=a/b;
        int mod=a%b;

        boolean n=true;
        System.out.println(n);

        String name=("Anna");
        int age1=24;
        char x=('A');
        System.out.println(name+" "+x+" "+age1);

        System.out.println("Next example");
        System.out.println(" ");

        String myName1=("Anna");
        System.out.println(myName1);
        int myAge=24;
        System.out.println(myAge);
        double myHeigh=1.75;
        System.out.println(myHeigh);
        char variable='A';
        System.out.println(variable);
        boolean isGoodProgrammer=true;
        System.out.println(isGoodProgrammer);

        System.out.println("Next example");
        System.out.println(" ");


        VariablesPractice object=new VariablesPractice();
        object.displayWelcome(); //wyświetlenie Hello world poprzez metodę void. Jak mamy void wyświetlamy poprzez do obiektu a nie systemm.out

        String welcome1=object.getWelcome();
        System.out.println(welcome1);

        String[] friends=new String[]{"Sylwia","Magda","Ada","Noemi"};
        String friend=friends[3];
        System.out.println(friend);
        int numberOfElements=friends.length;
        System.out.println("Moja tablica zawiera"+" "+numberOfElements+" "+"elementy");

        double result=object.multiply(4.00,5.00);
        System.out.println(result);

        String welcome="Nazywam się Amigo";
        String agree="Zgadzam się na wynagrodzenie w wysokości ";
        String money=" zł/miesiąc";
        int number=10;
        String grateful="Dziękuję za Twą hojność, mój przyjacielu Raszi";
        System.out.println(welcome);
        System.out.println(agree+number+money);
        System.out.println(grateful);

        System.out.print("Diego ");
        System.out.println("jest najlepszy");
        System.out.print("Amigo ");
        System.out.print("jest najlepszy");
        System.out.println(" I basta!");

        String fruit="brzoskwinia ";
        String fruit2="banan";
        System.out.println(fruit);
        System.out.print(fruit2);



    }
}

