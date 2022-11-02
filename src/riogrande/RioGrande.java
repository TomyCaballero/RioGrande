/* R5. Proyecto final del paradigma orientado a objetos*/
/*Datos de identificación*/
/* Nombre completo: Pedro Pablo Torres Pérez */
/* Matrícula: 21011187 */
/* Fecha de elaboración: 23/03/2022 */
/* Nombre del Módulo: Programación orientada a objetos v1 */
/* Nombre del Asesor: Claudia Patricia Rojano Hernández */ 
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
