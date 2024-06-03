public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Testando ex1 (é negativo):");
            System.out.println(Exercicios.ex1(5));   // false
            System.out.println(Exercicios.ex1(-5));  // true

            System.out.println("\nTestando ex2 (soma):");
            System.out.println(Exercicios.ex2(5, 3));  // 8
            System.out.println(Exercicios.ex2(5, -3)); // 2

            System.out.println("\nTestando ex3 (subtração):");
            System.out.println(Exercicios.ex3(5, 3));  // 2
            System.out.println(Exercicios.ex3(5, -3)); // 8

            System.out.println("\nTestando ex4 (módulo):");
            System.out.println(Exercicios.ex4(5));  // 5
            System.out.println(Exercicios.ex4(-5)); // 5

            System.out.println("\nTestando ex5 (multiplicação):");
            System.out.println(Exercicios.ex5(5, 3));  // 15
            System.out.println(Exercicios.ex5(-5, -3)); // -15

            System.out.println("\nTestando ex6 (exponenciação):");
            System.out.println(Exercicios.ex6(2, 3));  // 8
            System.out.println(Exercicios.ex6(2, -3)); // 0

            System.out.println("\nTestando ex7 (divisão inteira):");
            System.out.println(Exercicios.ex7(10, 2));  // 5
            System.out.println(Exercicios.ex7(1, 7));   // 0
            System.out.println(Exercicios.ex7(10, -2)); // -5
            System.out.println(Exercicios.ex7(-10, 2)); // -5
            System.out.println(Exercicios.ex7(-10, -2));// 5

            System.out.println("\nTestando ex8 (resto)");
            System.out.println(Exercicios.ex8(10,2));

            System.out.println("\nTestando ex9 (x1 < x2):");
            System.out.println(Exercicios.ex9(5, 3));  // false
            System.out.println(Exercicios.ex9(3, 5));  // true

            System.out.println("\nTestando ex10 (x1 == x2):");
            System.out.println(Exercicios.ex10(5, 5));  // true
            System.out.println(Exercicios.ex10(5, 3));  // false

            System.out.println("\nTestando ex11 (x1 != x2):");
            System.out.println(Exercicios.ex11(5, 5));  // false
            System.out.println(Exercicios.ex11(5, 3));  // true

            System.out.println("\nTestando ex12 (x1 >= x2):");
            System.out.println(Exercicios.ex12(5, 3));  // true
            System.out.println(Exercicios.ex12(3, 5));  // false

            System.out.println("\nTestando ex13 (x1 != x2):");
            System.out.println(Exercicios.ex13(5, 5));  // false
            System.out.println(Exercicios.ex13(5, 3));  // true

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
