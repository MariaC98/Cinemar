import java.sql.SQLException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws SQLException {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("<<<<Cinemar>>>>");
		System.out.println("Ingrese una opcion: ");
		System.out.println("1 - Ingresar\n2 - Registrarse");
		int opcion=teclado.nextInt();
		
		if(opcion==1) {
			System.out.println("Ingrese email: ");
			String email = teclado.next();
			
			System.out.println("Ingrese contraseña: ");
			String contra = teclado.next();
			
			Login login = new Login(email,contra);
			Usuario user = login.ingresar();
			
			if(user != null) {
				InicioUsuario ini = new InicioUsuario(user);
				ini.visibilizar();
			}
			else {
				System.out.println("Ingreso no exitoso!!");
			}	
		}
		else {
			System.out.println("Registro");
			Registro registro1 = new Registro();
			registro1.validaDatos();
		}
		
		
		
		//flujo del programa
		
		//1 - Tener un menu de si es admin o usuario normal
		
		//2 - para usuario normal mostrar otro menu con dos opciones (logearse o registrarse)
		
		//3 - una vez logeado, instanciamos un usuario y mostramos el menu
		
		 

	}

}
