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
public class Preguntas {
    int id;
    String pregunta;
    String respuesta;
    String respuestaF1;
    String respuestaF2;
    public Preguntas(int id,String pregunta, String respuesta, String respuestaF1, String respuestaF2) {
        this.id = id;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.respuestaF1 = respuestaF1;
        this.respuestaF2 = respuestaF2;
    }

    public int getId() {
        return id;
    }
    public String getPregunta() {
        return pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }
    
    public String getRespuestaF1() {
        return respuestaF1;
    }
        
    public String getRespuestaF2() {
        return respuestaF2;
    }
}
