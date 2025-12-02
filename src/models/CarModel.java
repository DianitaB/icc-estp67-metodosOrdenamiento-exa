package models;

public class CarModel {
    private CarYear[] carYear;
    private int years;

    public CarYear[] getCarYear() {
        return carYear;
    }

    public void setCarYear(CarYear[] carYear) {
        this.carYear = carYear;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public CarModel(CarYear[] carYear, int years) {
        this.carYear = carYear;
        this.years = years;
    }

}
