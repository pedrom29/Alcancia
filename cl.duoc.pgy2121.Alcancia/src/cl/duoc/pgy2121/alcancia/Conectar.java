/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.alcancia;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Pedro
 */
public class Conectar {

    public Connection conexion() {
        Connection conexion = null;
        try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexion = DriverManager.getConnection("jdbc:mysql://localhost/Alcancia", "root", "9591");

            System.out.println("Conexion exitosa" + conexion.toString());

        } catch (Exception ex) {
            System.out.println("Error de conexion: " + ex);
        }
        return conexion;
    }

}
