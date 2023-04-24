public class Persona {

 int id;
 int edad;
    String NombreCompleto;
    int prioridad;
    int amigos;
public Persona(int id, String NombreCompleto, int prioridad, int amigos,int edad){

    this.id = id;
    this.NombreCompleto = NombreCompleto;
    this.prioridad = prioridad;
    this.amigos = amigos;
    this.edad = edad;
}
//metods
public int getId() {
    return this.id;
}

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return this.NombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.NombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getAmigos() {
        return this.amigos;
    }

    public void setAmigos(int amigos) {
        this.amigos = amigos;
    }

}
