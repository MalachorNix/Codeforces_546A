import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] input = scanner.next().split(" ");
        scanner.close();

        BigDecimal firstBananaCost = BigDecimal.valueOf(Long.parseLong(input[0]));
        BigDecimal dollars = BigDecimal.valueOf(Long.parseLong(input[1]));
        BigDecimal bananas = BigDecimal.valueOf(Long.parseLong(input[2]));

        BigDecimal needToPay = BigDecimal.ZERO;

        for (BigDecimal i = BigDecimal.ONE; i.compareTo(bananas.add(BigDecimal.ONE)) < 0; i = i.add(BigDecimal.ONE)) {
            needToPay = needToPay.add(i.multiply(firstBananaCost));
        }

        if (needToPay.compareTo(dollars) <= 0) {
            System.out.println(0);
        } else {
            System.out.println(needToPay.subtract(dollars));
        }
    }
}
