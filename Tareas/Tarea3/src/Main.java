
public class Main {
    public static void main(String[] args) {
        Persona Lucas = new Persona();

        Lucas.setEdad(25);
        Lucas.setNombre("Lucas");
        Lucas.setTelefono(1154798659);

        int lucasEdad = Lucas.getEdad();
        String lucasNombre = Lucas.getNombre();
        int lucasTelefono = Lucas.getTelefono();

        System.out.println(lucasEdad);
        System.out.println(lucasNombre);
        System.out.println(lucasTelefono);
    }
}

    class Persona {
        private int edad;
        private String nombre;
        private int telefono;
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }
}
//Para practicar la encapsulación:
    //1.Crear clase Persona.
    //2.Crear variables las privadas edad, nombre y telefono de la clase Persona.
    //3.Crear gets y sets de cada propiedad.
    //4.Crear un objeto persona en el main.
    //5.Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.

