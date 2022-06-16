public class Main {
    public static void main(String[] args) {
        int fibHigh =Methods.fibHigh(500000);
        int fibLow = Methods.fibLow(500000);
        System.out.println(fibHigh - fibLow);
    }
}
