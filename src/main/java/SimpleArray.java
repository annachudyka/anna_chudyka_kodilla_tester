public class SimpleArray {
    public static void main(String[] args){
        String[] names=new String[5];
        names[0]="Julia";
        names[1]="Chris";
        names[2]="Ana";
        names[3]="George";
        names[4]="Jacob";

        String name=names[3];
        System.out.println(name);

        for(int i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }

        int numberOfElements=names.length;
        if(numberOfElements==5){
            System.out.println("My array has 5 elements");
        }else{
            System.out.println("My array doesn't have 5 elements");
        }
    }
}
