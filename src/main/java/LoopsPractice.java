import java.util.Random;

public class LoopsPractice {
    public int countNumbers(int[] numbersOne) {
        int result = 0;
        int i;
        for (i = 0; i < numbersOne.length; i++) {
            result = result + numbersOne[i];
        }
        return result;
    }

    public int getCountOfRandomNumber(int max){
        Random random=new Random();

        int result=0;
        int sum=0;
        while(sum<max){
            int temp=random.nextInt(10);
            sum=sum+temp;
            result=result+1;
        }
        return result;
    }


}






