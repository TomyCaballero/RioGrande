
package riogrande;


public class Test {
	
	public static void main (String[] args){
		Maestro maestro = new Maestro ("1234", "Marco", "Valencia", "marcovalencia@riogrande.com");
		maestro.imprimirPerfil();
	
		
		Alumno alumno = new Alumno ("9876", "Amanda", "Martinez", "amandamartinez@riogrande.com");
		alumno.imprimirPerfil();
		alumno.mostrarCalificaciones();
		alumno.guardarCalificaciones();
	
		
		Tutor tutor = new Tutor ("5432", "Fernando", "Castillo", "fernandocastillo@riogrande.com");
		tutor.imprimirPerfil();
		tutor.mostrarCalificaciones();
	}


}
