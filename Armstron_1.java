public class Armstron_1 {
    public static void main(String[] args) {
        int digit1, digit2, digit3, temp, result;
        for (int n = 100; n <= 999; n++) {
            temp = n;


            digit1 = temp % 10;
            temp = temp / 10;

            digit2 = temp % 10;
            temp = temp / 10;

            digit3 = temp % 10;

            result = (digit1 * digit1 * digit1) + (digit2 * digit2 * digit2) + (digit3 * digit3 * digit3);
            //System.out.println(result);
            if (n == result) {
                System.out.println(result + " arm Strong number");
            }
        }
    }
}