package sistemas.models;

public class Empresa {

    protected int ID;
    protected String razonsocial, nit, direccion, correo;

    public Empresa(int ID, String razonsocial, String nit, String direccion, String correo) {
        this.ID = ID;
        this.razonsocial = razonsocial;
        this.nit = nit;
        this.direccion = direccion;
        this.correo = correo;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRazonsocial() {
        return this.razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getNit() {
        return this.nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa{");
        sb.append("ID=").append(ID);
        sb.append(", razonsocial=").append(razonsocial);
        sb.append(", nit=").append(nit);
        sb.append(", direccion=").append(direccion);
        sb.append(", correo=").append(correo);
        sb.append('}');
        return sb.toString();
    }

}
