public class Main {
    public static void main(String[] args) {

        Cliente lucas = new Cliente();
        lucas.edad = 25;
        lucas.nombre= "lucas";
        lucas.telefono= 1154798659;
        lucas.credito= 100;
        System.out.println(lucas.edad);
        System.out.println(lucas.nombre);
        System.out.println(lucas.telefono);
        System.out.println(lucas.credito);

        Trabajador ivan = new Trabajador();
        ivan.salario = 2000;
        System.out.println(ivan.salario);

    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona {
    int salario;
}

    //Crea una clase Persona con las siguientes variables:
        //La edad
        //El nombre
        //El teléfono
        //Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
        //Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
        //Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.