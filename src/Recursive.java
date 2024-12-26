public class Recursive {
    public static int recursiveFibonacci(int n) {
        if (n <= 1) return n;
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println("Fibonacci number at position " + n + " is: " + recursiveFibonacci(n));
    }
}

// Часова складність O(2^n), Просторова складність O(n)
// UML для рекурсивного підходу
// Тип: Class Diagram або Sequence Diagram.
// Демонструє рекурсивні виклики методу.
