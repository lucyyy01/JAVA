public class UnaryOperator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++); // 10 (post-increment: returns a, then increments)
        System.out.println(a);   // 11

        int b = 20;
        System.out.println(++b); // 21 (pre-increment: increments b, then returns it)
        System.out.println(b);   // 21

        int c = 5;
        System.out.println(c--); // 5 (post-decrement: returns c, then decrements)
        System.out.println(c);   // 4

        int d = 50;
        System.out.println(--d); // 49 (pre-decrement: decrements d, then returns it)
        System.out.println(d);   // 49

        int e=-a; // Unary minus: negates the value of a
        System.out.println(e); // -11
        
    }
}
