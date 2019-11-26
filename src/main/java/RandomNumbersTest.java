public class RandomNumbersTest {
    public static void main (String[] args){
        RandomNumbers random =new RandomNumbers(40);
        System.out.println(random.number);

        RandomNumbers random1=new RandomNumbers(41);
        random1.countRandomNumbers();
        System.out.println(random1.countRandomNumbers());

        RandomNumbers random2=new RandomNumbers(50);
        random2.getMin();
        System.out.println(random2.getMin());

        RandomNumbers random3=new RandomNumbers(51);
        random3.getMax();
        System.out.println(random3.getMax());
    }
}
