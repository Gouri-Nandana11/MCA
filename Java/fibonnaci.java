import java.util.Scanner;
public class fibonnaci {
    static int fib(int n){
        if(n==0)
            return 0;
        if (n==1)
        return 1;
         return fib(n-1) + fib(n-2);
        
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a num:");
int n=sc.nextInt();

System.out.println("fib num:"+fib(n));
        
    }
}
