/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_conducir;

/**
 *
 * @author mcabe
 */
import static examen_conducir.Conector.url;
import static examen_conducir.Conector.conectar;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mcabe
 */
public class Recolector {

    public static ArrayList <Preguntas> mDataF = new ArrayList();
    public static ArrayList <Preguntas> mDataD = new ArrayList();
    
    public static void RellenarArrayListF(){
        mDataF.clear();
        conectar();
        String Consulta = "select * from preguntasF";
        try(var preguntas = DriverManager.getConnection(url);
            var Datos = preguntas.prepareStatement (Consulta)){
                try (var eject = Datos.executeQuery()) {
                    while (eject.next()) {
                        int id = (eject.getInt(1));
                        String pregunta =(eject.getString(2));
                        String respuesta =(eject.getString(3));
                        String respuestaF1 =(eject.getString(4));
                        String respuestaF2 =(eject.getString(5));
                        mDataF.add(new Preguntas (id,pregunta,respuesta,respuestaF1,respuestaF2));
                    }   
                }catch (SQLException ex) {
                    System.err.println("Error en la ejecucuión de la consulta");
                    System.err.println(ex.toString());   
                }  
        }catch(SQLException ex){
            System.err.println("Error al establecer la consulta");
            System.err.println(ex.toString());
        }
    }
    
    public static void RellenarArrayListD(){
        mDataD.clear();
        conectar();
        String Consulta = "select * from preguntasD";
        try(var preguntas = DriverManager.getConnection(url);
            var Datos = preguntas.prepareStatement (Consulta)){
                try (var eject = Datos.executeQuery()) {
                    while (eject.next()) {
                        int id = (eject.getInt(1));
                        String pregunta =(eject.getString(2));
                        String respuesta =(eject.getString(3));
                        String respuestaF1 =(eject.getString(4));
                        String respuestaF2 =(eject.getString(5));
                        mDataF.add(new Preguntas (id,pregunta,respuesta,respuestaF1,respuestaF2));
                    }   
                }catch (SQLException ex) {
                    System.err.println("Error en la ejecucuión de la consulta");
                    System.err.println(ex.toString());   
                }  
        }catch(SQLException ex){
            System.err.println("Error al establecer la consulta");
            System.err.println(ex.toString());
        }
    }
}

