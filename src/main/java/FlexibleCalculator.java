public class FlexibleCalculator implements IStringCalculator {
    @Override
    public float Calculate(String input) {
        try {
            if (input.contains("+") || input.contains("-") || input.contains("*") || input.contains("/")) {
                SymbolCalculate symbol = new SymbolCalculate();
                return symbol.Calculate(input);
            } else {
                TextCalculate text = new TextCalculate();
                return text.Calculate(input);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Введите символы через пробел");
        }

        return 0;
    }
}
