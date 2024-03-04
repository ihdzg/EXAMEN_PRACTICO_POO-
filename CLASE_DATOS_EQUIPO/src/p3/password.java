/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3;

/**
 *
 * @author ihdzg
 */
public class password {
    private String usuario;
    private String contrasenia;

    
    public void Password() {
        usuario = "admin";
        contrasenia = "admin123";
    }
   

    public String verificarAcceso(String usuario, String contrasenia) {
        if(usuario.equals(usuario) && contrasenia.equals(contrasenia)){
        return "True";
        } else
            return "False";
    }

    
}
