import java.util.Random;

public class RandomNumbers {
    int number;

    public RandomNumbers(int number) {
        this.number = number;
    }

    public int countRandomNumbers(){

        Random random=new Random();
        int result=0;
        int sum=0;
        int a=5000;
        while(sum<a){
            int temp=random.nextInt(31);
            sum=sum+temp;
            result++;
        }
        return result;

        }
    public void calculate(){
        int max=getMax(countRandomNumbers());
        int min=MinMax.getMin(countRandomNumbers());

    }

    }

