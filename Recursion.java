public class Recursion {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("GCD of 24 and 36: " + gcd(24, 36));  
    }
}
