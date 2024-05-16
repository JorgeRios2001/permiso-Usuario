/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexionBD {
    Connection conectar = null;
    String BaseDeDatos = "permisousuarios";
    String Usuario = "root";
    String Contraseña = "";

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+ BaseDeDatos, Usuario, Contraseña);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Sin Conexion" + e, "conexxion",JOptionPane.INFORMATION_MESSAGE);
        }
        return conectar;
    }
    
}