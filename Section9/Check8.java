public class Check8 {
    public static void main(String[] args) {
        try (SampleResource5 resource5 = new SampleResource5();) {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }   
}