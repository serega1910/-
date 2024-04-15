import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;


public class Main  {




    public static String calc (String input) {
        Callcu.input=input;
        return Callcu.out;
    }


    public static void main(String[] args) throws Errors {
        Callcu element = new Callcu();
        element.vhodScren();
        element.argument();
        element.prizZnac();



        if (element.arabRid(element.vales1) && element.arabRid(element.vales2)) {
            Callcu.out=element.rashet(element.znac, element.vales1,element.vales2);}
           else if ((element.arabRid(element.vales1) || element.arabRid(element.vales2))) {

             if ((Integer.parseInt (element.vales1)<1 || Integer.parseInt(element.vales1)>10 ) || (Integer.parseInt (element.vales2)<1 || Integer.parseInt(element.vales2)>10 )) {
                 new Errors(5);}
             else{
                 new Errors(3);}



          }
            else  {
               Rim rim  = new Rim();
               if   (rim.enamRidb(element.vales1)!=null &&  rim.enamRidb(element.vales2)!=null) {
                   if ((Integer.parseInt (rim.enamRidb(element.vales1))>0 && Integer.parseInt(rim.enamRidb(element.vales1))<=10 ) && (Integer.parseInt (rim.enamRidb(element.vales2))>0 && Integer.parseInt(rim.enamRidb(element.vales2))<=10 )) {
                       String rimOut = element.rashet(element.znac, rim.enamRidb(element.vales1), rim.enamRidb(element.vales2));


                       if (Integer.parseInt(rimOut) > 0) {       // Если меньше 0 то исключение
                           Callcu.out = rim.enamRidc(rimOut);
                       } else throw new Errors(4);
                   }
                    else throw new Errors(6);






               }
            }




        System.out.println("О Т В Е Т: "+Main.calc(Callcu.input)) ;
    }













}
