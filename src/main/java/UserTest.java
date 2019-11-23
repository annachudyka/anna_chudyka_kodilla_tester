public class UserTest {
    public static void main(String[] args){

        User example=new User();
        int[] years = new int[]{42, 18, 32, 24};
        int i = example.checkSum(years);
        example.checkSum(years);
        System.out.println(example.year);
    }
}
