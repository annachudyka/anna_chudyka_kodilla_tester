public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap");
        } else if(this.price>600 && this.price<1000){
            System.out.println("This price is good");
        }else{
    System.out.println("This notebook is expensive");
        }
    }
    public void checkWeight(){
        if(this.weight=="600g") {
            System.out.println("This notebook is cheap");
        }else if(this.weight=="1600g"){
            System.out.println("This notebook isn't heavy");
        }else System.out.println("This notebook is very heavy");
    }
    public void yearAndPrice(){
        if(this.price>=1500 && this.year>2006){
            System.out.println("It wasn't easy to get here");
        }else if(this.price>600 && this.price<1000 && this.year>2000){
            System.out.println("BUT I did it");
        }else System.out.println("I'm a hero!");
    }
    }
