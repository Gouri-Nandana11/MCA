import java.util.Scanner;
public class Multiplication
{
   
    int table(int n){
        int num=1;
        for(int i=1;i<=10;i++){
          num= n*i;
         
             System.out.println(i+"x"+n+ "="  +num);

        }
        return num;
        
    }


public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");

int n=sc.nextInt();
Multiplication obj=new Multiplication();
//  int res=
 obj.table(n);
//  System.out.println("the res:"+res);



}}