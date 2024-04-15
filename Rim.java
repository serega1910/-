public class Rim {         //  Можно было через массив двойной, но про "Энам"  был урок.

       String enamRidb(String username)  {    // Вносим Римские  цифры получаем Арабские
              try {
                Rims ar = Rims.valueOf(username);
                  String v_ras =Integer.toString(ar.ordinal());
                     return v_ras;
                     } catch (Exception e) {
                  return null;
              }



      }


    String enamRidc(String username) {    ///// Вносим Арабские получаем арабские Римские.
        Rims allapples1[] = Rims.values();
        String value="";
        for (int a = 0; a < allapples1.length; a++) {

            if (a == Integer.valueOf(username))

            {
                value = allapples1[a].toString();

            }
        }
        return value;
    }








}