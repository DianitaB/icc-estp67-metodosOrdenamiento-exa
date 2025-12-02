package models;

public class Brand {
    private CarModel[] models;
    private String nombre;

    public CarModel[] getModels() {
        return models;
    }

    public void setModels(CarModel[] models) {
        this.models = models;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalValidYears() {
        int total = 0;
        if (models == null)
            return 0;

        for (CarModel model : models) {
            if (model == null || model.getYears() == null)
                continue;

            for (CarYear year : model.getYears()) {
                if (year != null && year.isValid()) {
                    total++;
                }
            }
        }
        return total;
    }

}