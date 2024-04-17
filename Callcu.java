import java.beans.Expression;
import java.io.IOException;
import java.util.Scanner;

class Callcu   {
     static String input;
     static String out;
     String vales1="";
     String vales2="";
    String znac=null;

     void vhodScren() throws Exception  {
         for(int clear = 0; clear < 100; clear++)
         {
             System.out.println("\b") ;
         }
         Scanner scan = new Scanner(System.in);
         System.out.println("Введите любое математические выражение из двух переменных и целых чисел от 1 до 10: ");
         System.out.print("Между  математическим знаком пробелы. Римские с Арабскими цифры в месте не вносить:  ");
         Main.calc(scan.nextLine());
         argument();
     }

    void argument()throws Exception  {
        String[] data =Callcu.input.split(" ");
        if (data.length !=3) {
            System.err.println("Неправильно введено, нет пробелов между знаком и переменными");
            System.err.println("Введи с пробелами . Пример: a * b, a / b, a + b, a - b");
            vhodScren();

        }
         vales1= data[0];
         vales2= data[2];
            if  (prizZnac (data[1])) {
             znac= data[1];}

    }

    boolean prizZnac (String input) throws Exception {//  ПРОВЕРКА  Выражение  a=b+c,  на предмет математических знаков и сохраняем знак
        String[] znacd = {"*", "/", "+", "-"};
        Boolean z= false;

        for (int i= 0; i<znacd.length; i++) {
            if (input.equals(znacd[i]) ) {    //только с одним  математ знак.
                z=true;
            }
        }
        //if (!z) {
                //new Errors(1);   // ошибка, нет знака.

            //  }

        return z;
    }





    boolean arabRid(String username) {
        Boolean prizRim= false;


        isdigit razl = new isdigit();
        if  (razl.isDigit(username)) {
        String[] orgum = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

            for (int i = 0; i < orgum.length; i++) {
                if (Integer.parseInt(username) == Integer.parseInt(orgum[i])) {
                    prizRim = true;

                }
            }

        }

        return prizRim;
    }


       String rashet (String znac, String v_ras1, String v_ras2) {  //Получаем две переменных и знак(порядковый номер в массиве знаков) делаем расчет

        int sum_m = 0;
        switch (znac) {
            case "*":
                sum_m = Integer.parseInt(v_ras1) * Integer.parseInt(v_ras2);
                break;
            case "/":
                sum_m =Integer.parseInt(v_ras1) / Integer.parseInt(v_ras2);
                break;
            case "+":
                sum_m =Integer.parseInt(v_ras1) + Integer.parseInt(v_ras2);
                break;
            case "-":
                sum_m = Integer.parseInt(v_ras1) - Integer.parseInt(v_ras2);
                break;
            default:

        }
        //String sum = String.valueOf(sum_m);

        return String.valueOf(sum_m);
    }


}
