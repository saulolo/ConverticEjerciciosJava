package EjerciciosClases;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

/*@author Saulolo*/
public class ConexBDSelect {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost/TallerMER";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "pininateo13");
        Connection conn = DriverManager.getConnection(url, props);

        String foovalue = "UNION LIBRE";
        PreparedStatement st = conn.prepareStatement("SELECT * FROM estado_civil WHERE descripcion = ?");
        st.setString(1, foovalue);
        ResultSet rs = st.executeQuery();
        ArrayList<estado_civil> estado = new ArrayList();
        while (rs.next()) {
            System.out.print("Column 2 returned ");
            System.out.println(rs.getString(1));
            
            estado_civil miEstadoCivil = new estado_civil(rs.getInt(1), rs.getString(2));
            
            
            
            estado.add(miEstadoCivil);
            
            
            
        }
          for (int i = 0; i < estado.size(); i++) {
                  System.out.println(estado);
            
        }
        
      
      
        rs.close();
        st.close();
        
        

    }

}
