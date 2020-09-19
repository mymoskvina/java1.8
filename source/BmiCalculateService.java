public class BmiCalculateService {
    public double calculate(double height, double weight) {
        double bmi = weight / (height * height);
        return bmi;
    }
}

