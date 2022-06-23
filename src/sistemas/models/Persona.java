package sistemas.models;

public class Persona {

    private int ID;
    private String nombre;
    private String correo;

    public Persona(int ID, String nombre, String correo) {
        this.ID = ID;
        this.nombre = nombre;
        this.correo = correo;
    }

    public int getID() {
        return this.ID;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("ID=").append(ID);
        sb.append(", nombre=").append(nombre);
        sb.append(", correo=").append(correo);
        sb.append('}');
        return sb.toString();
    }
    
    

}
