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
public class MainAlcancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
            Conectar cc=new Conectar();
            cc.conexion();
            
            MainFrame f=new MainFrame();
            f.setVisible(true);
            
    }
    
}
