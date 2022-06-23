/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas.controllers;

import java.sql.ResultSet;
import sistemas.conexionDB.conexion;

/**
 *
 * @author USUARIO
 */
public class ControllerEMPRESAS {

    public void queryIncert(String nit, String razonsocial, String direccion, String correo) {
        conexion objConexion = new conexion();

        String strSentenciaInsert = String.format("INSERT INTO empresas (ID, nit, razonsocial, direccion, correo) "
                + " VALUES (null, '%s', '%s', '%s', '%s')", nit, razonsocial, direccion, correo);
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);

    }

    public ResultSet queryGetData() {
        conexion objConexion = new conexion();
        ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM empresas");

        return resultado;
    }

    public void queryDelete(int ID) {
        conexion objConexion = new conexion();

        String strSentenciaDelete = String.format("DELETE FROM empresas WHERE ID=%d", ID);
        objConexion.ejecutarSentenciaSQL(strSentenciaDelete);
    }

    public void queryUpdate(int ID, String nit, String razonsocial, String direccion, String correo) {
        conexion objConexion = new conexion();

        String strSentenciaInsert = String.format("UPDATE empresas SET nit='%s', razonsocial='%s', direccion='%s', correo='%s'"
                + " WHERE ID=%d", nit, razonsocial, direccion, correo, ID);
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
    }

}
