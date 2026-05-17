import java.util.*;
abstract class shape{
abstract int area();
abstract int perimetr();
}

class rectangle extends  shape{
int l,b;
rectangle(int l,int b){
this.l=l;
this.b=b;
}
int area(){
return l*b;
}
int perimetr(){
return 2*l*b;
}}
class circle extends  shape{
int r;
circle(int r){
this.r=r;
}
int area(){
return 314*r*r;
}
int perimetr(){
return 2*314*r;
}

}
class  MainExam1{
public static void main (String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("enter the limit");
int n=sc.nextInt();
shape s []=new shape[4];
for(int i=0;i<=n;i++){
    s[0]=new rectangle(10,20);
    s[1]=new circle(4);
    s[2]=new rectangle(2,5);
    s[3]=new circle(2);

}
for (int i = 0; i< s.length; i++) {
    
            System.out.println("Area = " + s[i].area());

            System.out.println("Perimeter = " + s[i].perimetr());

            System.out.println();
        }
    
}

}
