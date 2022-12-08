public class Main {
    public static void main(String[] args){
        System.out.println(suma(10,20,30));
        Auto miAuto = new Auto();
        miAuto.sumarPuerta();
        System.out.println(miAuto.puertas);
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}
class Auto{
    public int puertas = 0;

    public void sumarPuerta(){
        this.puertas++;
    }
}


