public class Errors extends Exception {

    public Errors (int Error) {
        super("    ");
        switch (Error) {
            case   1:
            System.err.println("Неправильный математический знак возможные знаки: * умножение ,/ деленье , + прибавление , - вычитание");
                break;
            case  2:
                System.err.println("Одна из переменных не цифра");
                break;
            case  3:
                System.err.println("Одновременно введены  арабские и римские цифры . Также это могут быть и другие не корректные знаки ");
                break;
            case  4:
                System.err.println("Результатом работы калькулятора с римскими числами могут быть только положительные числа,");
                break;
            case  5:
                System.err.println("Арабские. Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
                break;
            case  6:
                System.err.println("Римские. Калькулятор должен принимать на вход числа от I до X включительно, не более.");



        }

    }

}
