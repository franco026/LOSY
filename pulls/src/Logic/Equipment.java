package Logic;

public class Equipment {
    int numeroEquipo;
    private String equipmentName;

    public int getNumeroEquipo() {
        return numeroEquipo;
    }

    public void setNumeroEquipo(int numeroEquipo) {
        this.numeroEquipo = numeroEquipo;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public int getMake() {
        return make;
    }

    public void setMake(int make) {
        this.make = make;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateequipment() {
        return stateequipment;
    }

    public void setStateequipment(String stateequipment) {
        this.stateequipment = stateequipment;
    }
    private int make;
    private String description;
    private String state;
    private String stateequipment;

 
    private String[] encabezado = {"numero_equipo", "nombre_equipo", "marca", "desripcion", "estado"};

    public Equipment() {
    }
    
    public Equipment(int numeroEquipo, String nombreEquipo, int marca, String descripcion, String estado) {
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
    

}
