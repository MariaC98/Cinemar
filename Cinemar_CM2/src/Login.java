import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
	
	private String email;
	private String pass;
	
	public Login(String email, String pass) {
		this.email = email;
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public Usuario ingresar() throws SQLException {
		
		Usuario user = null; //solo lo declare
		Conexion conexion = new Conexion();
		
		String consulta = "select * from usuario where email_usuario="+"'"+this.email+"'"+
				" and contrasenia_usuario ="+"'"+this.pass+"'";
		ResultSet rs = conexion.devuelveConsulta(consulta);
		
		while(rs.next()) {
			System.out.println("Ingreso exitoso!");
			
			int id_user = rs.getInt("id_usuario");
			String nombre = rs.getString("nombre_usuario");
			String apellido = rs.getString("apellido_usuario"); //el nombre del parametro debe coincir con el nombre de la columna
			String email = rs.getString("email_usuario");
			String pass = rs.getString("contrasenia_usuario");
			int tipo = rs.getInt("id_tipo_usuario");
			boolean tieneTraj = rs.getBoolean("tiene_tarj_usuario");
			user = new Usuario(id_user,nombre,apellido,email,pass,tipo,tieneTraj);
		}
		
		return user;
		
	}

}
