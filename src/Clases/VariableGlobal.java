/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VariableGlobal {

    public ConexionMySQL conexionMySQL;
    private Fichero fichero;
    private String host, puerto, usuario, contra;

    public VariableGlobal() {
       
        host = "localhost";
        puerto = "3310";
        usuario = "root";
        contra = "hacker.net";
       
       
        
        fichero = new Fichero();
        
        this.conexionMySQL = new ConexionMySQL(host, puerto, fichero.obterBase(), usuario, contra);
    }

    public VariableGlobal(String base) {
        
        host = "localhost";
        puerto = "3310";
        usuario = "root";
        contra = "hacker.net";
        
        fichero = new Fichero();


        
        this.conexionMySQL = new ConexionMySQL(host, puerto, base, usuario, contra);
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContra() {
        return contra;
    }
}
