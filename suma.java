
public class suma {
    public static void main(String[] args) {
        System.out.println("Key a number: ");
        long number = 12300002333L;

        int count = 0;
        do {
            number = number / 10;
            count++;
        } while (number > 0 || number < 0);

        System.out.println("Number of digits is: " + count);
    }
}
