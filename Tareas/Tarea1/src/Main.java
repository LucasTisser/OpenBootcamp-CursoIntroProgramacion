public class Main {
    public static void main(String[] args) {

       Coche micoche = new Coche();

        micoche.agregarPuerta();
        micoche.agregarPuerta();
        suma(20, 30, 40);
        System.out.println("El numero de puertas es " + micoche.puertas);
    }
    public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
    static class Coche {
        public int puertas = 4;
        public void agregarPuerta()  {
            this.puertas++;
        }
    }
}