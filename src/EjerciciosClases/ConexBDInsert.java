package EjerciciosClases;

import com.sun.jdi.connect.spi.Connection;
import java.util.Properties;
import java.sql.*;

/*@author Saulolo*/
public class ConexBDInsert {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost/TallerMER";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "pininateo13");
        java.sql.Connection conn = DriverManager.getConnection(url, props);

        //2. preparar statement
        PreparedStatement st = conn.prepareStatement("INSERT INTO estado_civil (descripcion) VALUES ?)");
        //3. registro a ingresar

        st.setString(1, "CASADO");
        //4. ejecutar el update
        st.executeUpdate();
        System.out.println("registro ingresado correctamente");

        st.close();

    }

}
