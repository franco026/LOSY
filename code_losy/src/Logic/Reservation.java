package Logic;

public class Reservation {

    private int userCode;
    private int equipmentNumber;
    private int reservationDay;
    private int reservationMonth;
    private int reservationYear;

    public Reservation(){

    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public int getEquipmentNumber() {
        return equipmentNumber;
    }

    public void setEquipmentNumber(int equipmentNumber) {
        this.equipmentNumber = equipmentNumber;
    }

    public int getReservationDay() {
        return reservationDay;
    }

    public void setReservationDay(int reservationDay) {
        this.reservationDay = reservationDay;
    }

    public int getReservationMonth() {
        return reservationMonth;
    }

    public void setReservationMonth(int reservationMonth) {
        this.reservationMonth = reservationMonth;
    }

    public int getReservationYear() {
        return reservationYear;
    }

    public void setReservationYear(int reservationYear) {
        this.reservationYear = reservationYear;
    }
}
