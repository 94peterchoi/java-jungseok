package ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex10_1 {
    public static void main(String[] args) {
        // TODO: 실패한 풀이

        Calendar cal = Calendar.getInstance();
        int year = 2020;

        String pattern = "yyyy-MM-dd은 2번째 일요일입니다.";
        DateFormat df = new SimpleDateFormat(pattern);

        for (int month=0; month<11; month++) {
            cal.set(year, month, 1);
            int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE);

            for (int date=1; date<=lastDayOfMonth; date++) {
                cal.set(year, month, date);
                if (cal.get(Calendar.WEEK_OF_MONTH) == 2 && cal.get(Calendar.DAY_OF_WEEK) == 1) {
                    Date d = new Date(cal.getTimeInMillis());
                    System.out.println(df.format(d));
                }
            }
        }


    }
}
