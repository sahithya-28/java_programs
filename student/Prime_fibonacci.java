package student;

public class Prime_fibonacci {
    public boolean primenum(int n) {
        int c = 0; 
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        return c == 2; 
    }

    public void fib() {
        int a = 0, b = 1, c;
        for (int i = 0; i <= 10000; i++) {
            c = a + b;
            a = b;
            b = c;
            if (primenum(c)) {
                System.out.println(c);
            }
        }
    }

    public static void main(String[] args) {
       
        Prime_fibonacci pf = new Prime_fibonacci();
        
       
        pf.fib();
    }
}
