
public class Disco extends Exito {
	private int id;
	private String nombre;
	private String genero;
	private int año;
	private int numero_cancion;
	
	public Disco(int id, String nombre, String genero, int numero_cancion, int año, String nombre_cancion,String autor) {
		super(nombre_cancion,autor);
		this.id = id;
		this.nombre=nombre;
		this.genero=genero;
		this.numero_cancion=numero_cancion;
		this.año=año;
	}
	   
   public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setGenero(String gen){
    	this.genero=gen;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setNombre(String nom){
    	this.nombre=nom;
    }
    
   public String getNombre(){
       return nombre;
    }
    
    public void setNumero_Cancion(int num_can){
    	this.numero_cancion=num_can;
    }
    
    public int getNumero_Cancion(){
        return numero_cancion;
    }

    public void setAño(int año){
    	this.año=año;
    }
    
    public int getAño(){
        return año;
    }
    
	public String mostrarDiscoAgregado() {
		return "\n ----------Disco agregado----------:"+"\n"+
		"Id: " + getId()+"\n"+
	    "Nombre: "+getNombre()+"\n"+
	    "Genero: "+getGenero()+"\n"+
	    "Numero de canciones: "+getNumero_Cancion()+"\n"+
	    "Año de lanzamiento: "+getAño()+"\n"+
		"Su exito es: "+nombre_cancion+"\n"+
		"Su autor es: "+autor+"\n";
	}
}
