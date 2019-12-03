import java.sql.SQLOutput;

public class FirstClassPractice {
    public static void main(String[] args) {

        NotebookPractice notebook = new NotebookPractice(600, 1000, 2004);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();
        notebook.displayPrice();//metodę wywołujemy poprzez odniesienie do obiektu, po kropce nazwa metody (bez systemout)
        System.out.println(notebook.getWeight1());
        //wywołanie metody która zwraca(return)
        //można też wywołać return poprzez utworzenie kolejnej zmiennej int, na przykład:
        int notebookWeight = notebook.getWeight1();
        System.out.println(notebookWeight);

        NotebookPractice heavyNotebook = new NotebookPractice(2000, 1500, 2010);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        NotebookPractice oldNotebook = new NotebookPractice(1200, 500, 2018);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();

        String yes = ("Niesamowite! Jeden jest większe niż dwa!");
        String no = ("Wszystko po staremu, jeden jest mniejsze niż dwa");
        if (1 > 2) {
            System.out.println(yes);
        } else {
            System.out.println(no);
        }

        String right = ("This notebook is cheap");
        String wrong = ("This notebook is expensive");

        if (notebook.price < 900) {
            System.out.println(right);
        } else {
            System.out.println(wrong);
        }
        int yourAge = 10;
        String correct = "You are a kid";
        String correct1 = "You are a teenager";
        String incorrect = "You are an adult";
        if (yourAge <= 10) {
            System.out.println(correct);
        } else if (yourAge > 10 && yourAge < 18) {
            System.out.println(correct1);
        } else {
            System.out.println(incorrect);
        }
    }
}
