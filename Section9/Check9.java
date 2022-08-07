public class Check9 {
    public static void main(String[] args) {
        try (SampleResource9 resource9 = new SampleResource9();) {
            throw new Exception();
        } catch (Exception e) {
            for (Throwable t : e.getSuppressed()) {
                System.out.println(t);
            }
        } finally {
            System.out.println("finally");
        }
    }
}

class SampleResource9 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Sample");
        throw new RuntimeException();
    }
}