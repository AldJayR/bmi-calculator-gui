package bmicalculator.jbmicalc;

public enum BMICategory {
    UNDERWEIGHT,
    NORMAL,
    OVERWEIGHT,
    OBESE;

    public static BMICategory getCategory(double bmi) {
        if (bmi < 18.5) {
            return UNDERWEIGHT;
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return NORMAL;
        } else if (bmi >= 25 && bmi < 29.9) {
            return OVERWEIGHT;
        } else {
            return OBESE;
        }
    }
}
