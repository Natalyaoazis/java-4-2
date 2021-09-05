public class BmiService {
    public double calculate(double weight, double height) {
        double bmi = weight / (height * height / 100 / 100);
              return (double) bmi;
    }
}






