/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package demo;

import business.security.AuthenticationService;

/**
 *
 * @author matgr
 */
public class Main {

    public static void main(String[] args) {
        //pruebaCorrecta();
        //pruebaIncorrecta();
        new gui.FormSignin().setVisible(true);
    }

    public static void pruebaCorrecta() {
         AuthenticationService a = new AuthenticationService();
        long verif = a.signin("admin","#123456$");
        if(verif>0){
            System.out.println("Credenciales correctas");
        }
        else{
            System.out.println("Credenciales Incorrectas");
        }
    }
    public static void pruebaIncorrecta() {
        AuthenticationService a = new AuthenticationService();      
        long verif = a.signin("administrador","#123456$");
        if(verif>0){
            System.out.println("Credenciales correctas");
        }
        else{
            System.out.println("Credenciales Incorrectas");
        }
    }
}
