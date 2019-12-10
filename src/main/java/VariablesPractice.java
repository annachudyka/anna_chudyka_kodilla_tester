public class VariablesPractice{
    String welcome=("Hello world!");

    public String getWelcome(){
        return welcome;

    }
    public void displayWelcome(){
        System.out.println(welcome);//utworzenie metody, która wyświetla -> system.out. Przy wowołaniu tylko obiekt a po kropce metoda
    }

    public double multiply(double a, double b ) {
        return a*b;
    }

    public static int min(int a, int b, int c){
        int m;
        if(a<b&&a<c)
            m=a;
        else if(b<a&&b<c)
            m=b;
        else
            m=c;
        return m;
    }

}


