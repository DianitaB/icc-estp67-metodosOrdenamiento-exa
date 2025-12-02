package models; 
public class Brand {

    private String brandName;
    private CarModel[] models;

    
    public Brand(String brandName, CarModel[] models) {
        this.brandName = brandName;
        this.models = models;
    }

    public CarModel[] getModels() {
        return models;
    }

    public int getTotalValidYears() {
        int total = 0;
        if (models == null) return 0;
        for (CarModel model : models) {
            if (model == null) continue;
            CarYear[] years = model.getCarYear();
            if (years == null) continue;
            for (CarYear y : years) {
                if (y != null && y.isValid()) total++;
            }
        }
        return total;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setModels(CarModel[] models) {
        this.models = models;
    }
}
