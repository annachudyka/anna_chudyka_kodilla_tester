public class NotebookPractice {
    int weight;
    int price;
    int year;
    int weight1=600;

    public NotebookPractice(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    String ok = ("This notebook is very cheap");
    String ok1 = ("This price is good");
    String notOk = ("This notebook is expensive");

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println(ok);
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println(ok1);
        } else {
            System.out.println(notOk);
        }
    }

    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println("This notebook is light");
        } else if (this.price >= 600 && this.price <= 2000) {
            System.out.println("This notebook is not so heavy");
        } else {
            System.out.println("This notebook is very heavy");
        }
    }

    String i = "Oh my God!";
    String j = "OMG";
    String k = "Don't kidding me!";

    public void checkYearAndPrice() {
        if ((this.price>600 && this.price <=1000) && this.year<=2004) {
            System.out.println(i);
        } else if (this.price>=1500 && (this.year>2010 && this.year<2017)){
            System.out.println(j);
        } else {
            System.out.println(k);
        }
    }
    public void displayPrice(){//metoda wyświetlenia ceny. Musi być w klasie, gdzie stworzono atrybut klasy czyli price
        System.out.println(this.price);
    }
    public int getWeight1(){//metoda już nie wyświetli a zwróci typ int. Trzeba ją wywołać po kropce przy obiekcie poprzez system.out
        return this.weight1;
    }
}
