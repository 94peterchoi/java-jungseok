package ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex10_4 {
    public static void main(String[] args) {

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        Calendar today = Calendar.getInstance();
        Calendar myBirth = Calendar.getInstance();

        today.set(2022, 8, 5);
        myBirth.set(1994, 7, 12);

        long diff = today.getTimeInMillis() - myBirth.getTimeInMillis();
        long passedDays = diff / 1000 / (60 * 60 * 24);

        System.out.println(sdf.format(new Date(myBirth.getTimeInMillis())));
        System.out.println(sdf.format(new Date(today.getTimeInMillis())));
        System.out.println(passedDays + "days");

    }
}
