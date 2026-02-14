abstract class Vehicle{
    String Model;
    String Company;

    public Vehicle() {
        this.Company="un";
        this.Model="un";
    }
    abstract void display();

    

}
class Car extends Vehicle{
    int dr;
    String fuel;

    public Car() {
        super();
        this.dr=0;
        this.fuel="un";
        
    }
    void display(){
        System.out.println("Company:"+Company);
        System.out.println("Model:"+Model);
        System.out.println("no of doors:"+dr);
        System.out.println("fuel:"+fuel);
    }
    
}
class Electric extends Car{
    int b;

    public Electric() {
        super();
        this.b=0;
    }
    void display(){
        super.display();
        System.out.println("Battery"+b);

    }
    
}


public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle e=new Electric();
        e.Company="tesla";
        e.fuel="ec";
        e.dr=4;
        e.Model="abc";
        e.b=100;
        e.display();
    }
    
}
