package Logic;

public class Equipment {
    int numeroEquipo;
    private String equipmentName;
    private int make;
    private String description;
    private int state;
    private String[] encabezado = {"numero_equipo", "nombre_equipo", "marca", "desripcion", "estado"};

    public Equipment() {
    }
    
    public Equipment(int numeroEquipo, String nombreEquipo, int marca, String descripcion, int estado) {
        	super();
                this.numeroEquipo = numeroEquipo;
		this.equipmentName = nombreEquipo;
		this.make = marca;
		this.description = descripcion;
		this.state = estado;
    }

    public int getColumnas() {
        return encabezado.length;
    }
    
    public int getNumeroEquipo() {
        return numeroEquipo;
    }

    public String getColumName(int colum) {
        return encabezado[colum];
    }

    public String getEquipmentname() {
        return equipmentName;
    }

    public String getDescription() {
        return description;
    }

    public int getMake() {
        return make;
    }

    public int getState() {
        return state;
    }
    
    public String[] getEncabezado(){
        return encabezado;
    }

    public void setEquipmentname(String equipmentname) {
        this.equipmentName = equipmentname;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMake(int make) {
        this.make = make;
    }

    public void setState(int state) {
        this.state = state;
    }

}
