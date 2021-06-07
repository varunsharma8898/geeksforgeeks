package random;

// aka HCF - highest common factor
public class GCD {

    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        GCD gcd = new GCD();

        System.out.println("GCD of 98 and 56 is "  + gcd.gcd(98, 56));
        System.out.println("GCD of 6 and 15 is "  + gcd.gcd(15, 6));
        System.out.println("GCD of 3 and 5 is "  + gcd.gcd(3, 5));
    }
}
