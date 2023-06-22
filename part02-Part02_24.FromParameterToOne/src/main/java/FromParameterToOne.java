

public class FromParameterToOne {

    public static void main(String[] args) {

        printFromNumberToOne(6);
    }
    public static void printFromNumberToOne(int num){
        int i = num;
        while(i > 0) {
            System.out.println(i);
            i--;
        }
    }
}
