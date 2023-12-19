public class Task3 {

    //5. Даны стороны двух треугольников.
    //   Найти сумму их периметров и сумму их площадей.
    //   (Определить процедуру для расчета периметра и площади треугольника по его сторонам.)

    public static void main(String[] args) {
        int a = 9;
        int b = 4;
        int c = 7;
        int a1 = 5;
        int b1 = 2;
        int c1 = 8;

        int p = perimetr(a, b, c);
        int p1 = perimetr(a1, b1, c1);
        System.out.println("P = " + p);
        System.out.println("P1 = " + p1);

        double s = square(p, a, b, c);
        double s1 = square(p1, a1, b1, c1);
        System.out.println("S = " + square(p, a, b, c));
        System.out.println("S1 = " + square(p1, a1, b1, c1));

        System.out.println("Сумма периметров = " + (p + p1));
        System.out.println("Сумма площадей = " + (s + s1));
    }

    public static int perimetr(int a, int b, int c) {
        return a + b + c;
    }

    public static double square(int p, int a, int b, int c) {
        int pp = p/2;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }
}
