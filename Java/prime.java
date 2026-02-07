import java.util.Scanner;

class prime {

    static boolean isPrime(int a) {
        if (a <= 1)
            return false;

        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n))
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");
    }
}