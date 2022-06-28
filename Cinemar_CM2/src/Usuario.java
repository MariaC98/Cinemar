
public class Usuario {
	
	private int id_user;
	private String nombre;
	private String apellido;
	private String email;
	private String password;
	private int tipo;
	private boolean tieneTraj;
	
	public Usuario(int id_user, String nombre, String apellido, String email, String password, int tipo,
			boolean tieneTraj) {

		this.id_user = id_user;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.tipo = tipo;
		this.tieneTraj = tieneTraj;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public boolean isTieneTraj() {
		return tieneTraj;
	}

	public void setTieneTraj(boolean tieneTraj) {
		this.tieneTraj = tieneTraj;
	}
	
}
