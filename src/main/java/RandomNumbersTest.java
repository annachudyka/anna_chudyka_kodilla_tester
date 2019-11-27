public class RandomNumbersTest {
    public static void main (String[] args){
        RandomNumbers random =new RandomNumbers();
        System.out.println(random.getNumber());

        RandomNumbers random1=new RandomNumbers();
        System.out.println(random1.countRandomNumbers());

        RandomNumbers random2=new RandomNumbers();
        System.out.println(random2.getMin());

        RandomNumbers random3=new RandomNumbers();
        System.out.println(random3.getMax());
    }
}
