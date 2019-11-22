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

            LeapYear firstYear=new LeapYear(2019);
            String firstYearYear=firstYear.checkIfYearIsLeap();
            System.out.println(firstYearYear);

            LeapYear secondYear=new LeapYear(2000);
            String secondYearYear=secondYear.checkIfYearIsLeap();
            System.out.println(secondYearYear);

            LeapYear thirdYear=new LeapYear(2012);
            String thirdYearYear=thirdYear.checkIfYearIsLeap();
            System.out.println(thirdYearYear);

        }
    }
