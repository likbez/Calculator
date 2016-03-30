
/**
 * @date 06.02.2016.
 * @author EgloUser
 **/
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InteractRunner {
    public static void main(String[] args) throws IOException {

        double answer = 0;
        boolean boo = true;
        double firstDouble;
        double secondDouble;

        Pattern regularNumber = Pattern.compile("[0-9 + \\.]+");
        Scanner reader = new Scanner(System.in);
        Calculator calc = new Calculator();

        String exit = "no";
            while (!exit.equals("yes")) {
                /**
                 * При true дает возможность полльзователю ввести значение для переменной first.
                 * При false переменной first присуждается значение переменной answer
                 * Переменная boo получает свое знаечние ниже по коду, изначально является true.
                 * */
            try {
                    if (boo) {
                        System.out.println("Enter first arg: ");
                        String firstString = reader.next();
                        // Проверка на правильность ввода
                        Matcher matherOneArg = regularNumber.matcher(firstString);
                        while (!matherOneArg.matches()){
                            System.out.println("[Only number] Enter first arg: ");
                            firstString = reader.next();
                            matherOneArg = regularNumber.matcher(firstString);
                        }
                        firstDouble = Double.valueOf(firstString);
                    } else {
                        firstDouble = answer;
                        boo = true;
                    }

                        //Выбор символа
                    System.out.println("Enter symbol arg: +, -, *, /, ^ ");
                    String symbol = reader.next();

                        //Проверка на правильность ввода
                while(!symbol.equals("+") && !symbol.equals("-") &&
                        !symbol.equals("*") && !symbol.equals("/") && !symbol.equals("^")){

                        System.out.println("(Only symbol)Enter symbol arg: +, -, *, /, ^ ");
                        symbol = reader.next();
                    }

                        System.out.println("Enter second arg: ");
                        String secondString = reader.next();
                // Проверка на правильность ввода
                Matcher matherTwoArg = regularNumber.matcher(secondString);
                while (!matherTwoArg.matches()){
                    System.out.println("[Only number] Enter second arg: ");
                    secondString = reader.next();
                    matherTwoArg = regularNumber.matcher(secondString);
                }
                        secondDouble = Double.valueOf(reader.next());

                // Весь механизм
                calc.actionSelection(firstDouble, secondDouble, symbol.charAt(0));

                        /**
                         * Дает возможность использовать ответ из прошлых вычислений в будущем.
                         * При отказе вызывается метод обнуления ответа, при согласии ответ сохраняется
                         * в переменную answer. Переменная boo становится false, что в будущем даст
                         * возможность переменной first получить знаение переменной answer/
                         * */
                System.out.println("Save answer: yes/no");
                String cont = reader.next();

                //Проверка правильности ввода
                        while (!cont.equalsIgnoreCase("yes") && !cont.equalsIgnoreCase("no")){
                            System.out.println("(Only)Save answer: yes/no");
                            cont = reader.next();
                            }
                                if (cont.equals("no")) {
                                    calc.cleanResult();
                                } else {
                                answer = calc.getResult();
                                boo = false;
                        }
                             /**
                             * Выбираем хотим ли мы дальше работать в программе или же завершить ее.
                             * */
                                System.out.println("Exit: yes/no");
                                exit = reader.next();
                            //Блок проверка на правильность вода
                        while (!exit.equalsIgnoreCase("yes") && !exit.equalsIgnoreCase("no")){
                            System.out.println("(Only)Save answer: yes/no");
                            exit = reader.next();
                        }
            }catch (NumberFormatException e){
                System.out.println("Only number!");
                 }
            }
        }
}

