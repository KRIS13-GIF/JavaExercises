package Day1.Ex2;
class Operators1 {
    public static void main(String[] args) {
        int a = 34;
        int b = 21;

        int c = a++ + ++b;
        System.out.println("sum = " + c);

        int d = --a + --b + c--;
        System.out.println("sum = " + d);
        int e = a + +b + +c + d--;
        System.out.println("sum = " + c);
        int f = -a + b-- + -c - d++;
        int sum = a + b + c + d + e + f;
        System.out.println("sum = " + sum);
    }
}
