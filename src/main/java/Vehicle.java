import java.time.LocalDate;

public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;

    }
    @Override
    public double getValue() {
        LocalDate today = LocalDate.now();
        double currentYear = today.getYear();
        double depreciation = 0;
        double age = currentYear - year;
        double negativeValue = 0;


        double finalValue = 0;

        if (age <= 3 && age >= 0) {
            depreciation = .03 * age;
        } else if (age <= 6) {
            depreciation = .06 * age;
        } else if (age <= 10) {
            depreciation = .08 * age;
        }
        negativeValue = getOriginalCost() * (depreciation * age);
        finalValue = getOriginalCost() - negativeValue;
        if (age > 10) {
            finalValue -= 1000;
        }
        if (!this.makeModel.contains("Honda") && !this.makeModel.contains("Toyota")) {
            if (this.getOdometer() >= 100000) {
                finalValue *= .75;
            }
        }

        return finalValue;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

}
