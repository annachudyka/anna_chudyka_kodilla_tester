public class Kot {

    private String imie="bezimienny kot";
    private String imieInazwisko;

    public void setImie(String imie){

        this.imie=imie;
    }
    public void setImie(String imie, String nazwisko){
        String imieInazwisko=imie+" "+nazwisko;
        this.imieInazwisko=imieInazwisko;
    }

    private static int licznikKotow=0;

    public static void setLicznikKotow(int licznikKotow){

        Kot.licznikKotow=licznikKotow;
    }

    public static void main(String[] args) {

        Kot kot=new Kot();
        kot.setImie("Simba");
        System.out.println(kot.imie);
    }
}
