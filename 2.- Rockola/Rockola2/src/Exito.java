public class Exito {

	protected String nombre_cancion;
	protected String autor;
	
	public Exito(String nombre_cancion, String autor) {
		this.nombre_cancion=nombre_cancion;
		this.autor=autor;
	}
	
    public String getNombre_Cancion(){
        return nombre_cancion;
    }
	
    public String getAutor(){
        return autor;
    }
	
}
