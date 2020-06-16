package homework.june13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//7) Create class with 2 static methods with parameters.
//   First will take a String parameter and parse to a Date object, the second will format a Date to a String.
//   Call the both methods in main method.
public class Task7 {

    public static void main(String[] args) {
        String strToConvert = "15/6/2020";
        Date date = stringToDate(strToConvert);
        System.out.println(date);

        Date dateToConvert = new Date();
        String convertedDate = dateToString(dateToConvert);
        System.out.println(convertedDate);
    }

    static Date stringToDate(String strDate) {
        Date date;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("The date must be in 'dd/MM/yyyy' format ");
            date = new Date();
        }
        return date;
    }

    static String dateToString(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(date);
    }
}
