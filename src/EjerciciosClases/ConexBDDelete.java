package EjerciciosClases;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/*@author Saulolo*/

public class ConexBDDelete {
    
    public static void main(String[] args) throws SQLException {
        
        String url = "jdbc:postgresql://localhost/TallerMER";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "pininateo13");
        java.sql.Connection conn = DriverManager.getConnection(url, props);
        
        

        
    }
    
    

}
