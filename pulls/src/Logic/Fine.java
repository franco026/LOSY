package Logic;

public class Fine {

    private int userCode;
    private int value;
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Fine(){

    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public int getUserCode() {
        return userCode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
