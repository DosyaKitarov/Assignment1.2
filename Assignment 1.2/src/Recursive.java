public class Recursive {

    public static void printNumbers(int a, int b){
        if (a==b)
        {
            System.out.println(a);
            return;
        }
        else if(a<b){
            System.out.print(a+" ");
            printNumbers(a+1,b);
        }
        else {
            System.out.print(a + " ");
            printNumbers(a - 1, b);
        }
    }
}
