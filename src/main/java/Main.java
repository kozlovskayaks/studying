import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Введите первое число: ");
//        int a = scanner.nextInt();
//
//        System.out.println("Выберите тип операции: '+' - сложение, '-' - вычитание, '*'- умножение, '/' - деление");
//        String type = scanner.next();
//
//        System.out.println("Введите второе число: ");
//        int b = scanner.nextInt();
//
//        Calculator calculator = new Calculator();
//        calculator.result(type, a, b);

        System.out.println("Ведите первое число, операцию и второе число через пробел: ");
        String input = scanner.nextLine();

          FlexibleCalculator text = new FlexibleCalculator();
          System.out.println(text.Calculate(input));


//
    }
}



