public class OsobaTest {
    public static void main(String[] args) {

        Osoba osoba=new Osoba();
        System.out.println("Wiek: "+ osoba.wiek);
        osoba.dostosujWiek(osoba.wiek);
        System.out.println("Dostosowany wiek: "+osoba.wiek);
    }
}
