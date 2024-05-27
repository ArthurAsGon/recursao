public class Main {
    public static void main(String[] args) {
        Exercicios ex = new Exercicios();

        try {
            System.out.println(ex.ex1(7));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
