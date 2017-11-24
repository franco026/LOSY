package Logic;

public class Member {
    private String name;
    private String lastName;
    private int code;
    private String email;
    private String position;
    private String proyect;
    private int document;
    private int phone;
    private String password;
    private String answer;

    public Member(){}


    public void setName (String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setCode(int code){
        this.code=code;
    }

    public int getCode(){
        return code;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setProyect(String proyect) {
        this.proyect = proyect;
    }

    public String getProyect() {
        return proyect;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public int getDocument() {
        return document;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

}
