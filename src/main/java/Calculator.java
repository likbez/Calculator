/**
 * @date 06.02.2016.
 * @author EgloUser
 */
public class Calculator {
    private double result;
    /**
     * Математические махинации.
     * @param first первый вводимый параметр пользователем, первое число в вычислениях.
     * @param second третий вводимый параметр пользователем, второе число в вычислениях.
     * Результат вычислений возвращается через метод getResult().
     */

    /**
    *         Суммируем
    */
    public void addSum(double first, double second){
        this.result = first + second;
    }

    /**
     *        Минусуем
     */
    public void addMinus(double first, double second){
        this.result = first - second;
    }

    /**
     *       Умножение
     */
    public void addMultiply(double first, double second){
        this.result = first * second;
    }

    /**
     *       Деление
     */
    public void addSharing(double first, double second)throws IllegalArgumentException{
        if(second == 0){
            throw new IllegalArgumentException("На ноль делить нельзя!!!!");
        }
        this.result = first / second;
    }

    /**
     *      Возведение в степень
     */
    public void addDegree(double first, double second){
        this.result = Math.pow(first, second);
    }

    /**
     * Через метод передаем результат наружу.
     */
    public double getResult() {
        return this.result;
    }

    /**
     * Очищаем рузультат вычисдения.
     */
    public void cleanResult(){
        this.result = 0;
    }

    /**
     * Меню действий
     * */
    public void actionSelection(double first, double second, char symbol){

        switch (symbol) {
            case '+':
                addSum(first, second);
                System.out.println("Result: " + getResult());
                break;
            case '-':
                addMinus(first, second);
                System.out.println("Result: " + getResult());
                break;
            case '*':
                addMultiply(first, second);
                System.out.println("Result: " + getResult());
                break;
            case '/':
                addSharing(first, second);
                System.out.println("Result: " + getResult());
                break;
            case '^':
                addDegree(first, second);
                System.out.println("Result: " + getResult());
                break;
            default:
                System.out.println("Only + - * / ^ ");
        }
    }
}
