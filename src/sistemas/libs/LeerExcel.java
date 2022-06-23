package sistemas.libs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import sistemas.controllers.ContorllerModuloVENTAS;
import sistemas.controllers.ControllerModuloCompras;


public class LeerExcel {

    public void incertarVentas(File path, int empresaAuditada) {
        try {

            FileInputStream f = new FileInputStream(path);
            XSSFWorkbook libro = new XSSFWorkbook(f);

            //seleccionamos la primera hoja
            XSSFSheet hoja = libro.getSheetAt(0);

            //Cogemos todas las filas de esa hoja
            Iterator<Row> filas = hoja.iterator();
            Iterator<Cell> celdas;

            Row fila;
            Cell celda;

            //recorremos las filas
            while (filas.hasNext()) {

                //Cogemos la siguiente fila
                fila = filas.next();

                //Cogemos todas las celdas de esa fila
                celdas = fila.cellIterator();

                // intentamos extraer la informacion de cada fila e incertrla en la base de datos
                try {
                    // tomamos el valor del NIT para  quitarle los caracteres que no sirven y dejarlo como un numero
                    String valorNit = this.remplazarCaracteres(fila.getCell(0).toString());
                    // si el valor del nit no es nulo entonces procede a llamar el query e ingresar la informacion
                    if (valorNit != null) {
                        //System.out.println("valor " + this.remplazarCaracteres(fila.getCell(11).toString()));

                        ContorllerModuloVENTAS query = new ContorllerModuloVENTAS();
                        query.setRazonsocial(fila.getCell(1).toString());
                        query.setNit(valorNit);
                        query.setNumerofactura(fila.getCell(3).toString());
                        query.setNumerofacturaelectronica(fila.getCell(4).toString());
                        query.setFecha(fila.getCell(6).toString());
                        query.setNeto(Double.parseDouble(this.remplazarCaracteres(fila.getCell(11).toString())));
                        query.setIva(Double.parseDouble(this.remplazarCaracteres(fila.getCell(13).toString())));
                        query.setIDEMPRESA(empresaAuditada);

                        query.queryIncertVentas();

                    }

                } catch (Exception e) {
                    System.out.println("Error ---" + e);
                }

            }

            //cerramos el libro
            f.close();
            libro.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public void incertarRecibo(File path, int empresaAuditada) {
        try {

            FileInputStream f = new FileInputStream(path);
            XSSFWorkbook libro = new XSSFWorkbook(f);

            //seleccionamos la primera hoja
            XSSFSheet hoja = libro.getSheetAt(0);

            //Cogemos todas las filas de esa hoja
            Iterator<Row> filas = hoja.iterator();
            Iterator<Cell> celdas;

            Row fila;
            Cell celda;

            //recorremos las filas
            while (filas.hasNext()) {

                //Cogemos la siguiente fila
                fila = filas.next();

                //Cogemos todas las celdas de esa fila
                celdas = fila.cellIterator();

                // intentamos extraer la informacion de cada fila e incertrla en la base de datos
                try {
                    // tomamos el valor del NIT para  quitarle los caracteres que no sirven y dejarlo como un numero
                    String valorNit = this.remplazarCaracteres(fila.getCell(0).toString());
                    // si el valor del nit no es nulo entonces procede a llamar el query e ingresar la informacion
                    if (valorNit != null) {
                        System.out.println("--" + fila.getCell(0) + " -- " + fila.getCell(1) + " -- " + fila.getCell(2) + " -- " + fila.getCell(4) + " -- " + fila.getCell(5));

                        ContorllerModuloVENTAS query = new ContorllerModuloVENTAS();

                        query.setRazonsocial(fila.getCell(1).toString());
                        query.setNit(valorNit);
                        query.setNumerorecibo(fila.getCell(2).toString());
                        query.setFecha(fila.getCell(5).toString());
                        query.setNeto(Double.parseDouble(this.remplazarCaracteres(fila.getCell(6).toString())));
                        query.setIDEMPRESA(empresaAuditada);

                        query.queryIncertRecibos();

                    }
                } catch (Exception e) {
                    System.out.println("Error ---" + e);
                }

            }

            //cerramos el libro
            f.close();
            libro.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void incertarComprasCxP(File path, int empresaAuditada) {
        try {

            FileInputStream f = new FileInputStream(path);
            XSSFWorkbook libro = new XSSFWorkbook(f);

            //seleccionamos la primera hoja
            XSSFSheet hoja = libro.getSheetAt(0);

            //Cogemos todas las filas de esa hoja
            Iterator<Row> filas = hoja.iterator();
            Iterator<Cell> celdas;

            Row fila;
            Cell celda;

            //recorremos las filas
            while (filas.hasNext()) {

                //Cogemos la siguiente fila
                fila = filas.next();

                //Cogemos todas las celdas de esa fila
                celdas = fila.cellIterator();

                // intentamos extraer la informacion de cada fila e incertrla en la base de datos
                try {
                    // tomamos el valor del NIT para  quitarle los caracteres que no sirven y dejarlo como un numero
                    String valorNit = this.remplazarCaracteres(fila.getCell(0).toString());
                    // si el valor del nit no es nulo entonces procede a llamar el query e ingresar la informacion
                    if (valorNit != null) {
                        //System.out.println("--" + fila.getCell(0) + " -- " + fila.getCell(1) +" -- " + fila.getCell(2) +" -- " + fila.getCell(4)+" -- " + fila.getCell(5));

                        ControllerModuloCompras query = new ControllerModuloCompras();
                        query.queryIncertComprasCxP(
                                valorNit,
                                fila.getCell(1).toString(),
                                fila.getCell(3).toString(),
                                fila.getCell(6).toString(),
                                Double.parseDouble(this.remplazarCaracteres(fila.getCell(11).toString())),
                                Double.parseDouble(this.remplazarCaracteres(fila.getCell(13).toString())),
                                Double.parseDouble(this.remplazarCaracteres(fila.getCell(14).toString())),
                                Double.parseDouble(this.remplazarCaracteres(fila.getCell(15).toString())),
                                empresaAuditada
                        );

                    }
                } catch (Exception e) {
                    System.out.println("Error ---" + e);
                }

            }

            //cerramos el libro
            f.close();
            libro.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void incertarComprasPagosDirectos(File path, int empresaAuditada) {
        try {

            FileInputStream f = new FileInputStream(path);
            XSSFWorkbook libro = new XSSFWorkbook(f);

            //seleccionamos la primera hoja
            XSSFSheet hoja = libro.getSheetAt(0);

            //Cogemos todas las filas de esa hoja
            Iterator<Row> filas = hoja.iterator();
            Iterator<Cell> celdas;

            Row fila;
            Cell celda;

            //recorremos las filas
            while (filas.hasNext()) {

                //Cogemos la siguiente fila
                fila = filas.next();

                //Cogemos todas las celdas de esa fila
                celdas = fila.cellIterator();

                // intentamos extraer la informacion de cada fila e incertrla en la base de datos
                try {
                    // tomamos el valor del NIT para  quitarle los caracteres que no sirven y dejarlo como un numero
                    String valorNit = this.remplazarCaracteres(fila.getCell(0).toString());
                    // si el valor del nit no es nulo entonces procede a llamar el query e ingresar la informacion
                    if (valorNit != null) {
                        //System.out.println("--" + fila.getCell(0) + " -- " + fila.getCell(1) +" -- " + fila.getCell(2) +" -- " + fila.getCell(4)+" -- " + fila.getCell(5));

                        ControllerModuloCompras query = new ControllerModuloCompras();
                        query.queryIncertComprasPagosDirectos(
                                valorNit,
                                fila.getCell(1).toString(),
                                fila.getCell(2).toString(),
                                fila.getCell(3).toString(),
                                Double.parseDouble(this.remplazarCaracteres(fila.getCell(6).toString())),
                                Double.parseDouble(this.remplazarCaracteres(fila.getCell(9).toString())),
                                empresaAuditada
                        );

                    }
                } catch (Exception e) {
                    System.out.println("Error ---" + e);
                }

            }

            //cerramos el libro
            f.close();
            libro.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String remplazarCaracteres(String palabra) {
        String MyString = palabra;
        MyString = MyString.replace(".", "");
        MyString = MyString.replace(",", "");
        MyString = MyString.replace("C", "");
        MyString = MyString.replace("N", "");
        MyString = MyString.replace("I", "");
        MyString = MyString.replace("T", "");
        MyString = MyString.replace(" ", "");

        return MyString;
    }
}
