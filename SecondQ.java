public class SecondQ {
    public static void main(String[] args) {
        System.out.println(new SecondQ().run());
    }
    public String run() {
        int sum = 0;
        int x = 1;  // current Fib
        int y = 2;  // next Fib
        while (x <= 4000000) {
            if (x % 2 == 0)
                sum += x;
            int z = x + y;
            x = y;
            y = z;
        }
        return Integer.toString(sum);
    }
}

