public class TextCalculate implements IStringCalculator {
    @Override
    public float Calculate(String input) {

        if (input.contains(" ") == false) {
            throw new ArrayIndexOutOfBoundsException("Введите символы через пробел");
        }
        String[] substr = input.split(" ");
        String one = substr[0];
        String operation = substr[1];
        String two = substr[2];


        float result = 0;
        switch (operation) {
            case "plus":
                result = Integer.parseInt(one) + Integer.parseInt(two);
                break;
            case "minus":
                result = Integer.parseInt(one) - Integer.parseInt(two);
                break;
            case "mult":
                result = Integer.parseInt(one) * Integer.parseInt(two);
                break;
            case "div":
                if (Integer.parseInt(two) == 0) {
                    throw new ArithmeticException("Учи математику, не дели на ноль");
                }
                result = (float) Integer.parseInt(one) / Integer.parseInt(two);
                break;
        }
        return result;

    }
}