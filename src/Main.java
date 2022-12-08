public class Main {
    public static void main(String[] args){
        System.out.println(suma(10,20,30));
        Car myCar = new Car();
        myCar.plusDoor();
        System.out.println(myCar.doors);
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}
class Car{
    public int doors = 0;

    public void plusDoor(){
        this.doors++;
    }
}


