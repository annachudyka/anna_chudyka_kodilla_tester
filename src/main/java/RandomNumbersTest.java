public class RandomNumbersTest {
    public static void main (String[] args){
        RandomNumbers random =new RandomNumbers(40);
        System.out.println(random.number);

        RandomNumbers random1=new RandomNumbers(41);
        random1.countRandomNumbers();
        System.out.println(random1.countRandomNumbers());
    }
}
