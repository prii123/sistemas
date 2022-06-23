package sistemas.controllers;

import java.sql.ResultSet;
import sistemas.conexionDB.conexion;

public class ContorllerModuloVENTAS {

    private int ID, IDEMPRESA;
    private String nit, razonsocial, numerofactura, numerofacturaelectronica, fecha, numerorecibo;
    private double neto, iva, rtfuente, rtiva;

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIDEMPRESA() {
        return this.IDEMPRESA;
    }

    public void setIDEMPRESA(int IDEMPRESA) {
        this.IDEMPRESA = IDEMPRESA;
    }

    public String getNit() {
        return this.nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazonsocial() {
        return this.razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getNumerofactura() {
        return this.numerofactura;
    }

    public void setNumerofactura(String numerofactura) {
        this.numerofactura = numerofactura;
    }

    public String getNumerofacturaelectronica() {
        return this.numerofacturaelectronica;
    }

    public void setNumerofacturaelectronica(String numerofacturaelectronica) {
        this.numerofacturaelectronica = numerofacturaelectronica;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumerorecibo() {
        return this.numerorecibo;
    }

    public void setNumerorecibo(String numerorecibo) {
        this.numerorecibo = numerorecibo;
    }

    public double getNeto() {
        return this.neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    public double getIva() {
        return this.iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getRtfuente() {
        return this.rtfuente;
    }

    public void setRtfuente(double rtfuente) {
        this.rtfuente = rtfuente;
    }

    public double getRtiva() {
        return this.rtiva;
    }

    public void setRtiva(double rtiva) {
        this.rtiva = rtiva;
    }

    // INICIO QUERYS VENTAS
    public ResultSet queryGetData() {
        conexion objConexion = new conexion();
        ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM ModuloVentasVentas");

        return resultado;
    }

    public void queryIncertVentas() {
        conexion objConexion = new conexion();

        String strSentenciaInsert = String.format("INSERT INTO ModuloVentasVentas (ID, nit, razonsocial, numerofactura, numerofacturaelectronica, fecha, neto, iva,rtfuente, rtiva, IDEMPRESA ) "
                + " VALUES (null, '" + this.nit + "', '" + this.razonsocial + "', '" + this.numerofactura + "', '" + this.numerofacturaelectronica + "', '" + this.fecha + "', '" + this.neto + "', '" + this.iva + "', '" + this.rtfuente + "', '" + this.rtiva + "', '" + this.IDEMPRESA + "')");
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);

    }

    public void queryUpdatetVentas() {
        conexion objConexion = new conexion();

        String strSentenciaInsert = String.format("UPDATE ModuloVentasVentas SET nit='" + this.nit + "', razonsocial='" + this.razonsocial + "', numerofactura='" + this.numerofactura + "', "
                + "numerofacturaelectronica='" + this.numerofacturaelectronica + "', neto='" + this.neto + "', iva='" + this.iva + "' WHERE ID='" + this.ID + "'");
                
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);

    }

    public void queryDeleteVentas() {
        conexion objConexion = new conexion();

        String strSentenciaDelete = String.format("DELETE FROM ModuloVentasVentas WHERE ID='" + this.ID + "'");
        objConexion.ejecutarSentenciaSQL(strSentenciaDelete);
    }

    // FIN QUERYS VENTAS
    // INICIO QUERYS RECIBOS DE CAJA
    public ResultSet queryGetRecibos() {
        conexion objConexion = new conexion();
        ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM ModuloVentasRecibo");

        return resultado;
    }

    public void queryIncertRecibos() {
        conexion objConexion = new conexion();

        String strSentenciaInsert = String.format("INSERT INTO ModuloVentasRecibo (ID, nit, razonsocial, numerorecibo, fecha, neto, IDEMPRESA ) "
                + " VALUES (null, '" + this.nit + "', '" + this.razonsocial + "', '" + this.numerorecibo + "', '" + this.fecha + "', '" + this.neto + "', '" + this.IDEMPRESA + "')");
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);

    }

    public void queryUpdatetRecibos() {
        conexion objConexion = new conexion();

        String strSentenciaInsert = String.format("UPDATE ModuloVentasVentas SET nit='" + this.nit + "', razonsocial='" + this.razonsocial + "', numerofactura='" + this.numerofactura + "', "
                + "numerofacturaelectronica='" + this.numerofacturaelectronica + "', neto='" + this.neto + "', iva='" + this.iva + "', "
                + "IDEMPRESA='" + this.IDEMPRESA + "' WHERE ID='" + this.ID + "' ");
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);

    }

    public void queryDeleteRecibos() {
        conexion objConexion = new conexion();

        String strSentenciaDelete = String.format("DELETE FROM ModuloVentasVentas WHERE ID='" + this.ID + "'");
        objConexion.ejecutarSentenciaSQL(strSentenciaDelete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContorllerModuloVENTAS{");
        sb.append("ID=").append(ID);
        sb.append(", IDEMPRESA=").append(IDEMPRESA);
        sb.append(", nit=").append(nit);
        sb.append(", razonsocial=").append(razonsocial);
        sb.append(", numerofactura=").append(numerofactura);
        sb.append(", numerofacturaelectronica=").append(numerofacturaelectronica);
        sb.append(", fecha=").append(fecha);
        sb.append(", numerorecibo=").append(numerorecibo);
        sb.append(", neto=").append(neto);
        sb.append(", iva=").append(iva);
        sb.append(", rtfuente=").append(rtfuente);
        sb.append(", rtiva=").append(rtiva);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    

}
