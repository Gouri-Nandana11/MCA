class squareDemo{
    int area(int s){
        return s*s;

    }
    int area(int l,int b){
        return l*b;
    }
    double area(double r){
        return 3.14 *r *r;
    }

public static void main(String []args){
    squareDemo d= new squareDemo();
    int sa=d.area(5);
    int ra=d.area(3,4);
    int ca=d.area(3);
    System.out.println("area of sq="+ sa);
    System.out.println("area of sq="+ ra);
    System.out.println("area of sq="+ ca);

}}
