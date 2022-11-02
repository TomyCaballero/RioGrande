
package riogrande;

public class Maestro extends RioGrande
implements IPerfil{
	
	Maestro(String id, String nombre, String apellido, String correoElectronico){
		super (id, nombre, apellido, correoElectronico);
	}
	
	@Override
	public void imprimirPerfil() {
	System.out.println("ID :" + this.id);
	System.out.println("Nombre :" + this.nombre);
	System.out.println("Apellido :" + this.apellido);
	System.out.println("Correo :" + this.correoElectronico);
	
 }	

}
