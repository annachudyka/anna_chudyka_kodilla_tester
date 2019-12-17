public class Osoba {

    public int wiek=20;

    public void dostosujWiek(int wiek){
        wiek=wiek+20;
        System.out.println("Wiek w dostosujWiek() to "+wiek);
        this.wiek=wiek;
    }
}
