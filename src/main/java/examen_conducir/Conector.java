/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_conducir;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;


/**
 *
 * @author mcabe
 */
public class Conector {
    public static String url;
    public static String conectar() {
        Properties properties = new Properties();
        try { 
            properties.load(Files.newInputStream(Path.of("Properties.properties"))); 
            url = properties.getProperty("url");
        }catch (NullPointerException ex) { 
            System.err.println ("NullPointerException");
        }catch (FileNotFoundException ex) {
            System.err.println (" El fichero no encontrado.");
        }catch (IOException ex) {
            System.err.println (" No se permite esta operacion.");
        }
        return url;
    }     
}
