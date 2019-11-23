public class FirstClass{
    public static void main(String[] args){
            Notebook notebook=new Notebook(600,1000,2004);
            System.out.println(notebook.weight+""+notebook.price+notebook.year);
            notebook.checkPrice();
            notebook.checkWeight();
            notebook.checkYearAndPrice();

            Notebook heavyNotebook=new Notebook(2000,1500,2010);
            System.out.println(heavyNotebook.weight+""+heavyNotebook.price+heavyNotebook.year);
            heavyNotebook.checkPrice();
            heavyNotebook.checkWeight();
            heavyNotebook.checkYearAndPrice();

            Notebook oldNotebook=new Notebook(1600,500,1999);
            System.out.println(oldNotebook.weight+""+oldNotebook.price+oldNotebook.year);
            oldNotebook.checkPrice();
            oldNotebook.checkWeight();
            oldNotebook.checkYearAndPrice();

            LeapYear example=new LeapYear(2019);
            String exampleYear=example.checkIfYearIsLeap();
            System.out.println(exampleYear);

            Loops object=new Loops();
            int[]numbers=new int[]{12,3,45,7};
            object.sumNumbers(numbers);
            System.out.println(object.sumNumbers(numbers));



        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        }


    }
