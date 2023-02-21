public class assignmentop {
    public static void main(String[] args) {
        int n1 = 55;
        int n2 = 77;

        int r1 = n1 + n2;
        int r2 = n1 - n2;
        int r3 = n1 * n2;
        int r4 = n1 % n2;

        System.out.println("Addition Result: " + r1);
        System.out.println("Subtract Result: " + r2);
        System.out.println("Multiply Result: " + r3);
        System.out.println("Modulus Result: " + r4);

        n1 += 34;
        System.out.println(n1);

        n2 -= 9;
        n1++;
        n1--;

    }

}
