import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	
	Connection conn=null;
	Statement stmt =null;
	
	public Conexion() {
		
		final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
		final String DB_URL="jdbc:mysql://localhost:3306/cinemar";
		final String USER="root";
		final String PASS="password";

		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Conectando a la bdd..");
			conn=DriverManager.getConnection(DB_URL,USER,PASS);

         }catch(Exception e) {
        	 System.out.println("ERROR DE CONEXION");
		}
		
	}
	
	public ResultSet devuelveConsulta(String sql) throws SQLException {
		
		System.out.println("Creando Consulta");
		stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		
		return rs;
	}
	
	public void realizaConsulta(String sql) throws SQLException {
		
		System.out.println("Creando Consulta");
		stmt=conn.createStatement();
		stmt.executeUpdate(sql);	
	}
}
