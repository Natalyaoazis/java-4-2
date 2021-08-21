public class BmiService {
    public int calculate(double weight, double height) {
        double bmi = weight / (height * height / 100 / 100);
        int indexBodyMass = (int) bmi;
        if (bmi >= 16.5 && bmi <= 18.49) {
            return indexBodyMass;
        } if (bmi < 16.5) {
            return indexBodyMass;
        } if (bmi>=18.5 && bmi<=24.99) {
           return indexBodyMass;
        } if (bmi>=25 && bmi<=29.99) {
            return indexBodyMass;
        } if (bmi>=30 && bmi<=34.99) {
            return indexBodyMass;
        } if (bmi>=35 && bmi<=39.99) {
            return indexBodyMass;
        } if (bmi>=40) {
            return indexBodyMass;
        }
        else
        return indexBodyMass;
          }
}






