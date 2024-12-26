import java.util.Map;
import java.util.HashMap;

public class Dynamic {
    private static Map<Integer, Long> memo = new HashMap<>();

    public static long dpFibonacci(int n) {
        if (n <= 1) return n;
        if(memo.containsKey(n)) return memo.get(n);
        long result= dpFibonacci(n - 1) + dpFibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci number at position " + n + " is: " + dpFibonacci(n));
    }
}

// Часова складність O(n), Просторова складність O(n)
// UML для динамічного програмування
// Тип: Sequence Diagram або Class Diagram.
// Відображає використання кешу (мемоїзації) для уникнення повторних обчислень