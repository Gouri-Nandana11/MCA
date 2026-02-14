import java.util.*;
 interface Areap {
    int Area();
    int Per();
}
class Circle implements Areap{
    private int radius;
    Circle(int radius){
        this.radius=radius;
    }
    public int Area(){
        return 3*radius*radius;
    }
    public int Per(){
        return 2*3*radius;
    }
}
class Rec implements Areap{
    private int l;
    private  int b;

     Rec(int l,int b) {
        this.l=l;
        this.b=b;
    }
    public int Area(){
        return l*b;
    }
    public int Per(){
        return 2*l*b;
    }
    
}
public class CircleRect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("...Shape Calculator...");
            System.out.println("1 Cicle,2 rect 3 exit");
            System.out.println("Enter your Choice");
            choice=sc.nextInt();
            if(choice==1){
                System.out.println("enter the radius");
                int r=sc.nextInt();
                Circle c=new Circle(r);
                System.out.println("Area:"+c.Area());
                System.out.println("Perimeter:"+c.Per());
            }
           else if(choice==2){
                System.out.println("enter the l");
                int l=sc.nextInt();
                 System.out.println("enter the b");
                int b=sc.nextInt();
                Rec e=new Rec(l,b);
                System.out.println("Area:"+e.Area());
                System.out.println("Perimeter:"+e.Per());
            }
            else if(choice==3){
                break;
            }

        }

    }
}