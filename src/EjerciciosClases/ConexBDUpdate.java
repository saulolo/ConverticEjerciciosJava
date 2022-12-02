package EjerciciosClases;

import java.sql.*;

import java.util.Properties;

/*@author Saulolo*/

public class ConexBDUpdate {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost/TallerMER";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "pininateo13");
        Connection conn = DriverManager.getConnection(url, props);

        //1. crear conexion

        //2. preparar statement
        PreparedStatement st = conn.prepareStatement("UPDATE profesor set nombre=?, direccion=? WHERE id_profesor=?");
        //3. registro a actualizar
        st.setString(1, "liliana");
        //4. ejecutar el update
        st.executeUpdate();
        System.out.println("registro actualizado correctamente");
        st.close();

    }

}
