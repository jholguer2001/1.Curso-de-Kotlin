public class PersonaJ {

    String nombre;
    int edad;
    int x;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public PersonaJ(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

}
