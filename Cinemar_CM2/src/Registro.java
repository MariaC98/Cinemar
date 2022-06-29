import java.sql.SQLException;
import java.util.Scanner;

public class Registro {
	
	private String nombre;
	private String apellido;
	private String email;
	private String password;
	private int tipo;
	private boolean tieneTarj;
	
	public Registro() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		this.nombre = teclado.next();
		
		System.out.println("Ingrese apellido: ");
		this.apellido= teclado.next();
		
		System.out.println("Ingrese email: ");
		this.email= teclado.next();
		
		System.out.println("Ingrese password: ");
		this.password= teclado.next();
		
		this.tipo=1;
		this.tieneTarj= false;

	}
	
	public void validaDatos() throws SQLException {
	
	if(this.nombre!=""&&this.apellido!=""&&
	   this.email!=""&&this.password!="") { //podriamos buscar si el email esta en la bdd
		
		String sql = "insert into usuario values(null,"+"'"+this.nombre+"',"+
		"'"+this.apellido+"',"+"'"+this.email+"',"+"'"+this.password+"',"+"1,false);";
		
		Conexion conexion = new Conexion();
		conexion.realizaConsulta(sql);
		System.out.println("Usuario cargado");
	}
	
	else {
		System.out.println("DATOS MAL INGRESADOS");
	}
	
}}
