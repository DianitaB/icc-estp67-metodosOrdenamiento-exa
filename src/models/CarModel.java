package models;

public class CarModel {
    private String Cars;
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


    public String getCars() {
        return Cars;
    }


    public void setCars(String cars) {
        Cars = cars;
    }


    public CarModel(String cars, CarYear[] carYear) {
        Cars = cars;
        this.carYear = carYear;
    }
    


   
    


}
