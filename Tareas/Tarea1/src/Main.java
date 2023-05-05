public class Main {
    public static void main(String[] args) {
       Coche micoche = new Coche();

        micoche.agregarPuerta();
        micoche.agregarPuerta();
        suma(20, 30, 40);
        System.out.println("El numero de puertas es " + micoche.puertas);
    }

    // Primera Parte:
    public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }

    // Segunda Parte:
    static class Coche {
        public int puertas = 4;
        public void agregarPuerta()  {
            this.puertas++;
        }
    }
}

//Primera parte:
//Crear una función con tres parámetros que sean números que se suman entre sí.
//Llamar a la función en el main y darle valores.

//Segunda parte:
//Crear una clase coche.
//Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
//Una función que incremente el número de puertas que tiene el coche.
//Crear un objeto miCoche en el main y añadirle una puerta.
//Mostrar el número de puertas que tiene el objeto.