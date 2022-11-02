
package riogrande;

public class Alumno extends RioGrande
implements IPerfil, ICalificaciones{
	
	Alumno(String id, String nombre, String apellido, String correoElectronico){
		super (id, nombre, apellido, correoElectronico);
	}
	
	@Override
	public void imprimirPerfil() {
	  System.out.println("ID :" + this.id);
	  System.out.println("Nombre :" + this.nombre);
	  System.out.println("Apellido :" + this.apellido);
	  System.out.println("Correo :" + this.correoElectronico);
	}
	
	@Override
	public String mostrarCalificaciones(){
		System.out.println();
		return "Su caificacion es =" + 10;
	}
	
	@Override
	public String guardarCalificaciones(){
		System.out.println();
		return "Se guardara la calificacion =" + 10;
		
	}
}
