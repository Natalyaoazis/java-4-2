public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate(54, 174);
               System.out.printf("%.2f",index);
    }
}