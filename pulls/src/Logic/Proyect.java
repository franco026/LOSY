package Logic;

public class Proyect {

    private int id;
    private String name;
    private String description;
    private int directorCode;
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Proyect() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getDirectorCode() {
        return directorCode;
    }

    public void setDirectorCode(int directorCode) {
        this.directorCode = directorCode;
    }
}
