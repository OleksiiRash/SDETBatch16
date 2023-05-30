package class25.homework.Task1;

public abstract class Insurance {

    private String insuranceName;

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public abstract double getQuote();

    public abstract void cancelInsurance();
}

class Car extends Insurance {

    private String brand;
    private String model;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double getQuote() {
        double quote = 80;
        return quote;
    }

    @Override
    public void cancelInsurance() {
        System.out.println(getInsuranceName() + " Car insurance for " + this.brand + " " + this.model + " cancel successfully");
    }
}

class Pet extends Insurance {

    private String petType;

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    @Override
    public double getQuote() {
        double quote = 90;
        return quote;
    }

    @Override
    public void cancelInsurance() {
        System.out.println(getInsuranceName() + " Pet insurance for " + this.petType + " cancel successfully");
    }
}

class Health extends Insurance {

    @Override
    public double getQuote() {
        double quote = 70;
        return quote;
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Health insurance cancel successfully");
    }
}


