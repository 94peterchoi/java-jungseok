package ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex10_3 {

    static int paycheckCount(Calendar from, Calendar to) {

        if(from==null || to==null) return 0;

        int yearDiff = to.get(Calendar.YEAR) - from.get(Calendar.YEAR);
        int fromMonth = from.get(Calendar.MONTH);
        int toMonth = to.get(Calendar.MONTH);
        int monDiff = toMonth - fromMonth;

        if(to.get(Calendar.DAY_OF_MONTH)==21 && from.get(Calendar.DAY_OF_MONTH)==21 && monDiff == 0) {
            return 1;
        }

        if (yearDiff < 0 || monDiff < 0) {
            return 0;
        }

        /* 처음 내 풀이 */
//        if (from.get(Calendar.DAY_OF_MONTH) <= 21) {
//            monDiff++;
//        }
//
//        if (to.get(Calendar.DAY_OF_MONTH) < 21) {
//            monDiff--;
//        }

        if (from.get(Calendar.DAY_OF_MONTH) < 21 && to.get(Calendar.DAY_OF_MONTH) >= 21) {
            monDiff++;
        }

        if (from.get(Calendar.DAY_OF_MONTH) >= 21 && to.get(Calendar.DAY_OF_MONTH) < 21) {
            monDiff--;
        }


        return monDiff + yearDiff * 12;
    }

    static void printResult(Calendar from, Calendar to) {
        Date fromDate = from.getTime();
        Date toDate = to.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.print(sdf.format(fromDate)+" ~ "
                +sdf.format(toDate)+":");
        System.out.println(paycheckCount(from, to));
    }

    public static void main(String[] args) {
        Calendar fromCal = Calendar.getInstance();
        Calendar toCal = Calendar.getInstance();

        fromCal.set(2020, 0, 1);
        toCal.set(2020, 0, 1);
        printResult(fromCal, toCal);

        fromCal.set(2020,0,21);
        toCal.set(2020,0,21);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 1);
        toCal.set(2020, 2, 1);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 1);
        toCal.set(2020, 2, 23);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 23);
        toCal.set(2020, 2, 21);
        printResult(fromCal, toCal);

        fromCal.set(2021, 0, 22);
        toCal.set(2020, 2, 21);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 10);
        toCal.set(2022, 5, 10);
        printResult(fromCal, toCal);

        fromCal.set(2022, 8, 20);
        toCal.set(2022, 8, 1);
        printResult(fromCal, toCal);



    }


}
