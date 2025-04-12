public class Main {
    public static void main(String[] args) {
        int a = 4;
        System.out.println("his is a test for the nubmer"+a);
        int b = cube(a);
        int c = square(a);
        System.out.println("The cube of " + a + " is: " + b);
        System.out.println("The square of " + a + " is: " + c);
    }
    public static int square(int x) {
        return x*x;
    }
    public static int  cube(int x){
        return x * square(x);
    }
}