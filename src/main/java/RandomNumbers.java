import java.util.Random;

public class RandomNumbers {
    int number;


    public int getNumber() {
        return number;

    }
    public int countRandomNumbers() {

        Random random = new Random();
        int result = 0;
        int sum = 0;
        int a = 5000;
        while (sum < a) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;
        }
        return result;

    }

    public int getMin() {
        Random random = new Random();
        int min = 30;
        int a=5000;
        int sum=0;
        int temp;
        while (sum<a) {
            temp = random.nextInt(31);
            sum=sum+temp;
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

    public int getMax() {
        Random random = new Random();
        int max =0;
        int sum=0;
        int temp1;
        int a=5000;
        while(sum<a) {
            temp1 = random.nextInt(31);
            sum=sum+temp1;
            if (temp1 > max) {
                max = temp1;
            }
        }
        return max;
    }

}


