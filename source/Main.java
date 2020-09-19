public class Main {
    public static void main(String[] args) {
        BmiCalculateService service = new BmiCalculateService();
        double height = 1.75; // рост в м
        double weight = 50; // вес в кг

        double bmi = service.calculate(height, weight);
        System.out.println(bmi);
    }
}