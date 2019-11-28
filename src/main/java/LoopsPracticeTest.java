public class LoopsPracticeTest {
    public static void main(String[] args){
        int value=1;
        while(value<15){
            System.out.println(value);
            value=value+1;
        }
        String case2="Exercise 2";
        System.out.println(case2);
        int i;
        for(i=0;i<15;i++){
            System.out.println(i+2);
        }
        for(i=0;i<11;i++){
            System.out.println(i);
        }
        String[]personNames=new String[]{"Zygfryd","Gwidon","Florentyna"};
        for(i=0;i<personNames.length;i++){
            System.out.println(personNames[i]);
        }
        for( i=personNames.length-1;i>=0;i--){
            System.out.println(personNames[i]);
        }
        LoopsPractice object=new LoopsPractice();
        int[] numbersOne=new int[]{15,3,156,19,33};
        object.countNumbers(numbersOne);
        int numbersTwo=object.countNumbers(numbersOne);
        System.out.println(numbersTwo);

        int j= 0;
        while(j<=10){
            System.out.println("Game over" + j);
            j++;
        }
        for(int k=0;k<=10;k++){
            System.out.println("Game over"+k);
        }
    }
}
