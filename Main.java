public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = service.calculate(54, 174);
                System.out.println(index);
    }
}