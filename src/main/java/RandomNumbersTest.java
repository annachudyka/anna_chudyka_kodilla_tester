public class RandomNumbersTest {
    public static void main (String[] args){
        RandomNumbers random =new RandomNumbers();
        System.out.println(random.getNumber());

        RandomNumbers random1=new RandomNumbers();
        random1.countRandomNumbers();
        System.out.println(random1.countRandomNumbers());

        RandomNumbers random2=new RandomNumbers();
        random2.getMin();
        System.out.println(random2.getMin());

        RandomNumbers random3=new RandomNumbers();
        random3.getMax();
        System.out.println(random3.getMax());
    }
}
