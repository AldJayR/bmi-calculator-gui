package bmicalculator.jbmicalc;

public class BMI {

    private double weight;
    private double height;

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI() {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than zero.");
        }

        return this.weight / (this.height * this.height);
    }

    public String getBMICategory() {
        double BMIValue = this.calculateBMI();

        return BMICategory.getCategory(BMIValue).toString();
    }
}
