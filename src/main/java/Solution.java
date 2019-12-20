import java.sql.SQLOutput;

public class Solution {

    public static void print3(String s) {
        System.out.println(s);
    }
    public static void print4(String s) {
        System.out.print(s+" ");
        System.out.print(s+" ");
    }
    int serialNumber;
    String culture;
    int century;
    public Solution(int serialNumber){
        this.serialNumber=serialNumber;
    }
    public Solution(int serialNumber, String culture){
        this.serialNumber=serialNumber;
        this.culture=culture;
    }
    public Solution(int serialNumber, String culture,int century){
        this.serialNumber=serialNumber;
        this.culture=culture;
        this.century=century;
    }
    public static class Osoba {
        public int wiek = 20;

        public void dostosujWiek(int wiek) {
            wiek = wiek + 20;
            this.wiek=wiek;
            System.out.println("Wiek w dostosujWiek() to " + wiek);
        }
    }
    public static class Jablko{

        public static int cenaJablek=0;

        public static void podniesCene(int cenaJablek){

            Jablko.cenaJablek+=cenaJablek;
        }
    }

    public static void main(String[] args) {
        print4("okno");
        print4("plik");

        Solution solution=new Solution(2345);
        Solution solution1=new Solution(4321,"Aztecs");

        int a=5, b=6;
        System.out.print("Suma to "+(a+b));
        System.out.println("-----------------------------------");
        Solution solution2=new Solution(1234);
        System.out.println("This serial number is: "+solution2.toString());

        String s="\"C:\\Program Files\\Java\\jdk1.8.0_172\\bin\"";
        String s1="\"C:\\\\Program Files\\\\Java\\\\jdk1.8.0_172\\\\bin\\\"";

        System.out.println("To jest ścieżka Windows: "+s);
        System.out.println("To jest string Java: \\"+s1);

        Osoba osoba = new Osoba();
        System.out.println("Wiek: " + osoba.wiek);
        osoba.dostosujWiek(osoba.wiek);
        System.out.println("Dostosowany wiek: " + osoba.wiek);

        String name="Michael";
        String name1="Michael";

        if(name.length()==name1.length()){
            System.out.println("Imiona są tej samej długości");
        }else{
            System.out.println("Imiona są różnej długości");
        }
        if(name.equals(name1)){
            System.out.println("Imiona są identyczne");
        }else{
            System.out.println("Imiona są różne");
        }

        Jablko jablko=new Jablko();
        jablko.podniesCene(50);
        Jablko.podniesCene(100);
        System.out.println("Koszt jabłek to "+Jablko.cenaJablek);

        int number=1234;
        int numberLength=String.valueOf(number).length();
        System.out.println(numberLength);

    }
}

