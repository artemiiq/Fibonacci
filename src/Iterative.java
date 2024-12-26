public class Iterative {
    public static long iterativeFibonacci(int n) {
        if (n <= 1) return n;
        long prev1 = 0, prev2 = 1, current = 0;
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return current;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci number at position " + n + " is: " + iterativeFibonacci(n));
    }
}

// Часова складність O(n), Просторова складність O(1)
// UML для ітераційного підходу
// Тип: Activity Diagram.
// Описує послідовний процес обчислення значення чисел Фібоначчі.