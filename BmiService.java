public class BmiService {
    public String calculate(double weight, double height) {
        double bmi = weight / (height * height / 100 / 100);
        int indexBodyMass = (int) bmi;
        if (bmi >= 16.5 && bmi <= 18.49) {
            return (indexBodyMass + " Недостаточная (дефицит) масса тела");
        } if (bmi < 16.5) {
            return (indexBodyMass +  " дефицит массы тела");
        } if (bmi>=18.5 && bmi<=24.99) {
           return (indexBodyMass + " Норма");
        } if (bmi>=25 && bmi<=29.99) {
            return (indexBodyMass + " Избыточная масса тела (предожирение)");
        } if (bmi>=30 && bmi<=34.99) {
            return (indexBodyMass + " Ожирение первой степени");
        } if (bmi>=35 && bmi<=39.99) {
            return (indexBodyMass + " Ожирение второй степени");
        } if (bmi>=40) {
            return (indexBodyMass + " Ожирение третьей степени (морбидное)");
        }
        else
        return null;
          }
}






