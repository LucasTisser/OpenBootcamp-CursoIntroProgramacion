
public class Main {
    public static void main(String[] args) {

        // Ejercicio 1
        int numeroIf = 2;
        if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else if (numeroIf == 0) {
            System.out.println("El numero es 0");
        }

        // Ejercicio 2
        int numeroWhile = -2;
        while(numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Numero While es : " + numeroWhile);
        }

        // Ejercicio 3
        int numeroDoWhile = 3;
        do {
            numeroDoWhile++;
            System.out.println("Numero Do While es : " + numeroDoWhile);
        } while(numeroDoWhile < 3);

        // Ejercicio 4
        for(int numeroFor = 0;numeroFor <= 3;numeroFor++ ) {
            System.out.println("Numero For tiene un valor de : " + numeroFor);
        }

        // Ejercicio 5
        var estacion = "asd";
        switch (estacion) {
            case "Verano":
                System.out.println("La estacion es verano.");
                break;
            case "Otoño":
                System.out.println("La estacion es otoño.");
                break;
            case "Invierno":
                System.out.println("La estacion es invierno.");
                break;
            case "Primavera":
                System.out.println("La estacion es primavera.");
                break;
            default:
                System.out.println("No se a ingresado alguna estacion correcta");
                break;
        }
    }
}


// En este ejercicio practicarás las estructuras de control, para ello deberás crear:
//1. Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
//Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
//2. Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
//Incrementar el valor de la variable en uno cada vez que se ejecute.
//Mostrarlo por pantalla cada vez que se ejecute.
//3. Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
//4. Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
//5. Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.