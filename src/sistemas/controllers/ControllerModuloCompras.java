/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas.controllers;

import sistemas.conexionDB.conexion;

/**
 *
 * @author USUARIO
 */
public class ControllerModuloCompras {
    
        public void queryIncertComprasCxP(
          String nit, 
          String razonsocial, 
          String numerorecibo,
          String fecha, 
          double base, 
          double iva, 
          double retefuente, 
          double reteiva, 
          int IDEMPRESA
       ){
        conexion objConexion = new conexion();
                
        String strSentenciaInsert = String.format("INSERT INTO ModuloComprasCausaciones (ID, nit, razonsocial, documento, fecha, base, iva, retencionfuente, retencioniva, IDEMPRESA ) "
                + " VALUES (null, '"+nit+"', '"+razonsocial+"', '"+numerorecibo+"', '"+fecha+"', '"+base+"', '"+iva+"', '"+retefuente+"', '"+reteiva+"', '"+IDEMPRESA+"')");
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        
    }
          
        public void queryIncertComprasPagosDirectos(
          String nit, 
          String razonsocial, 
          String documento,
          String concepto,
          double base, 
          double iva,
          int IDEMPRESA
       ){
        conexion objConexion = new conexion();
                
        String strSentenciaInsert = String.format("INSERT INTO ModuloComprasPagosDirectos (ID, nit, razonsocial, documento, concepto, base, iva, IDEMPRESA ) "
                + " VALUES (null, '"+nit+"', '"+razonsocial+"', '"+documento+"', '"+concepto+"', '"+base+"', '"+iva+"', '"+IDEMPRESA+"')");
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        
    }
}
