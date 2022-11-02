
package riogrande;

public abstract class RioGrande {
	public String id;
	public String nombre;
	public String apellido;
	public String correoElectronico;
	
RioGrande (String id, String nombre, String apellido, String correoElectronico){
	this.id = id;
	this.nombre= nombre;
	this.apellido = apellido;
	this.correoElectronico = correoElectronico;
}
public String getid() {
	return this.id;
}
public String getnombre() {
	return this.nombre;
}
public String getapellido() {
	return this.apellido;
}
public String getcorreoElectronico(){
	return this.correoElectronico;
}
}
