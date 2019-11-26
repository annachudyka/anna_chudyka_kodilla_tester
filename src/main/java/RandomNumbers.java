import java.util.Random;

public class RandomNumbers {
    int number;

    public RandomNumbers(int number) {
        this.number = number;
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
        int i;
        int temp;
        for (i = 0; i < 31; i++) {
            temp = random.nextInt(31);
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

    public int getMax() {
        Random random = new Random();
        int max = 0;
        int j;
        int temp1;
        for (j = 0; j < 31; j++) {
            temp1 = random.nextInt(31);
            if (temp1 > max) {
                max = temp1;
            }
        }
        return max;
    }

}


