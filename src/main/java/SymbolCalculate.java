public class SymbolCalculate implements IStringCalculator {

    @Override
    public float Calculate(String input) {

        if (input.contains(" ") == false){
            throw new ArrayIndexOutOfBoundsException("Введите символы через пробел");
        }
//        try {
//            String[] substr = input.split(" ");
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Введите символы через пробел");
//        };

        String[] substr = input.split(" ");
            String one = substr[0];
            String two = substr[2];
            String operation = substr[1];


            float result = 0;
            switch (operation) {
                case "+":
                    result = Integer.parseInt(one) + Integer.parseInt(two);
                    break;
                case "-":
                    result = Integer.parseInt(one) - Integer.parseInt(two);
                    break;
                case "*":
                    result = Integer.parseInt(one) * Integer.parseInt(two);
                    break;
                case "/":
                    if (Integer.parseInt(two) == 0) {
                        throw new ArithmeticException("Учи математику, не дели на ноль");
                    }
                    result = (float) Integer.parseInt(one) / Integer.parseInt(two);
                    break;
            }
            return result;


    }

}
