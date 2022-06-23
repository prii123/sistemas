package sistemas.models;

import java.util.Date;

public class VentasFacturacion extends Empresa {

    private String numerodactura, numerofacturaelectronica;
    private Date fecha;
    private Double neto, iva;

    public VentasFacturacion(int ID, String nit, String razonsocial, String direccion, String correo, String numerodactura, String numerofacturaelectronica, Date fecha, Double neto, Double iva) {
        super(ID, razonsocial, nit, direccion, correo);
        this.numerodactura = numerodactura;
        this.numerofacturaelectronica = numerofacturaelectronica;
        this.fecha = fecha;
        this.neto = neto;
        this.iva = iva;
    }

    @Override
    public int getID() {
        return super.getID();
    }

    @Override
    public String getRazonsocial() {
        return super.getRazonsocial();
    }

    @Override
    public String getNit() {
        return super.getNit();
    }

    @Override
    public String getDireccion() {
        return super.getDireccion();
    }

    @Override
    public String getCorreo() {
        return super.getCorreo();
    }

    public String getNumerodactura() {
        return this.numerodactura;
    }

    public void setNumerodactura(String numerodactura) {
        this.numerodactura = numerodactura;
    }

    public String getNumerofacturaelectronica() {
        return this.numerofacturaelectronica;
    }

    public void setNumerofacturaelectronica(String numerofacturaelectronica) {
        this.numerofacturaelectronica = numerofacturaelectronica;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getNeto() {
        return this.neto;
    }

    public void setNeto(Double neto) {
        this.neto = neto;
    }

    public Double getIva() {
        return this.iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
         sb.append(super.toString());
        sb.append("  --------  ");
        sb.append("VentasFacturacion{");
        sb.append("numerodactura=").append(numerodactura);
        sb.append(", numerofacturaelectronica=").append(numerofacturaelectronica);
        sb.append(", fecha=").append(fecha);
        sb.append(", neto=").append(neto);
        sb.append(", iva=").append(iva);
        sb.append('}');
        return sb.toString();
    }
    
    

}
