public class Calculator {
    double res;
    int number1;
    int number2;
    String operation;


    /**
     * Функция суммирования
     * @param number1 - первое число
     * @param number2 - второе число
     * @return - возвращает сумму
     */
    public int add(int number1, int number2) {
        return (int) storeInformation(number1,number2, "+",number1+number2);
    };

    public int substract(int number1, int number2) {
        return (int) storeInformation(number1,number2, "-",number1-number2);
    };

    public int mult(int number1, int number2) {
        return (int) storeInformation(number1,number2, "*",number1*number2);
    };

    public double div(int number1, int number2) {
        if (number2 == 0) {
           throw new ArithmeticException("Учи математику, не дели на ноль");
        }
        return storeInformation(number1,number2, "/",number1/number2);
    };

    public void result(String type, int number1, int number2) {
        switch (type) {
            case "+":
                System.out.println("Результат " + add(number1, number2));
                break;
            case "-":
                System.out.println("Результат " + substract(number1, number2));
                break;
            case "*":
                System.out.println("Результат " + mult(number1, number2));
                break;
            case "/":
                try {
                    System.out.println("Результат " + div(number1,number2));
                } catch (ArithmeticException e ) {
                    System.out.println("Учи математику, не дели на ноль");
                }
                break;
        }
    }

    public double storeInformation(int number1, int number2, String operation, double res){

        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;
        this.res = res;
        return res;

    }

    @Override
    public String toString() {
        return number1+" "+operation+" "+number2+"="+res;

    }
}


