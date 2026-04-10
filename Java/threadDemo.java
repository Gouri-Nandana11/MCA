
class thraed1 extends Thread{
    public void run(){
        try{
        for(int i=0;i<=10;i++){
            System.out.println(i*i);
            Thread.sleep(500);
        }}catch(InterruptedException e){
            System.out.println(e);  
    }}

}
class thread2 extends Thread{
    public void run(){
        try{
        for(int i=0;i<=10;i++){
            System.out.println(i*i*i);
           Thread.sleep(700);
        }}catch(InterruptedException e){
            System.out.println(e);  
    }}
}


public class threadDemo {
    public static void main(String[] args){
        thraed1 t1 =new thraed1();
        thread2 t2 =new thread2();
        t1.start(); 
        t2.start();

    }
    
}
