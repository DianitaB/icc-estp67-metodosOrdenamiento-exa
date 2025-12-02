package models;

public class CarYear {
    private int año;
    private boolean isValid;

    public CarYear(int año, boolean isValid) {
        this.año = año;
        this.isValid = isValid;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "CarYear [año=" + año + ", isValid=" + isValid + "]";
    }

}
