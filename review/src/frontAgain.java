public class frontAgain {
    public static void main(String[] args) {
        System.out.println(greenTicket(4, 4, 4));
    }

    public int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        } else return 0;

    }

}