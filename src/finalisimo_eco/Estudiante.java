package finalisimo_eco;

public class Estudiante {
	
	private String uid;
	private String nombre;
	private String pass;
	private String correo;
	
	public Estudiante() {
		
	}
	
	public Estudiante(String uid, String nombre, String pass, String correo) {
		super();
		this.uid = uid;
		this.nombre = nombre;
		this.pass = pass;
		this.correo = correo;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}
