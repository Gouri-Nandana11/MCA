import java.util.*;

class oddeven extends Exception{
    public oddeven( String message){
        super(message);
    }
}


public class oddevenExept {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        try{
            if(num%2==0){
            throw new oddeven("even number not allowed");}
            else{
                System.out.println("odd");
            }
        
        }catch (Exception e){
            System.out.println(e.getMessage());
            
        }
    }
    }
    

