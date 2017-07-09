package admvisitantes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionDB {
    
    private static String db = "proyecto_final";
    private static String user = "root";
    private static String pass = "";
    private static String url = "jdbc:mysql://localhost/" + db;
    private static Connection conexion;

    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, pass);
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage()+" No se ha podido realizar la conección a la base de datos");
        }finally{
            return conexion;
        }
    }
}
