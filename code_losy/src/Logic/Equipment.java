package Logic;

public class Equipment {

    private int equipmentNumber;
    private String equipmentName;
    private int make;
    private String description;
    private int state;
    private String[] encabezado = {"numero_equipo", "nombre_equipo", "marca", "desripcion", "estado"};

    public Equipment(){
    }


    public int getColumnas(){
        return encabezado.length;
    }

    public String getColumName(int colum){
        return encabezado[colum];
    }

    public String getEquipmentname() {
        return equipmentName;
    }

    public int getEquipmentnumber() {
        return equipmentNumber;
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

    public void setEquipmentname(String equipmentname) {
        this.equipmentName = equipmentname;
    }

    public void setEquipmentnumber(int equipmentnumber) {
        this.equipmentNumber = equipmentnumber;
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
