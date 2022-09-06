package ch10;

import java.util.*;
import java.text.*;
class Exercise10_3_Correct {
    static int paycheckCount(Calendar from, Calendar to) {
// 1. from to null 0 . 또는 가 이면 을 반환한다
        if(from==null || to==null) return 0;
// 2. from to 21 1 . 와 가 같고 날짜가 일이면 을 반환한다
        if(from.equals(to) && from.get(Calendar.DAY_OF_MONTH)==21) {
            return 1;
        }
        int fromYear = from.get(Calendar.YEAR);
        int fromMon = from.get(Calendar.MONTH);
        int fromDay = from.get(Calendar.DAY_OF_MONTH);
        int toYear = to.get(Calendar.YEAR);
        int toMon = to.get(Calendar.MONTH);
        int toDay = to.get(Calendar.DAY_OF_MONTH);
// 3. to from monDiff . 와 이 몇 개월 차이인지 계산해서 변수 에 담는다
        int monDiff = (toYear * 12 + toMon) - (fromYear * 12 + fromMon);
// 4. monDiff 0 . 가 음수이면 을 반환한다
        if(monDiff < 0) return 0;
// 5. from (DAY_OF_MONTH) 21 만일 의 일 이 일이거나 이전이고
// to (DAY_OF_MONTH) 21 monDiff 1 . 의 일 이 일이거나 이후이면 의 값을 증가시킨다
        if(fromDay <= 21 && toDay >= 21)
            monDiff++;
// 6. from (DAY_OF_MONTH) 21 만일 의 일 이 일 이후고
// to (DAY_OF_MONTH) 21 monDiff 1 . 의 일 이 일 이전이면 의 값을 감소시킨다
        if(fromDay > 21 && toDay < 21)
            monDiff--;
        return monDiff;
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
        fromCal.set(2020,0,1);
        toCal.set(2020,0,1);
        printResult(fromCal, toCal);
        fromCal.set(2020,0,21);
        toCal.set(2020,0,21);
        printResult(fromCal, toCal);
        fromCal.set(2020,0,1);
        toCal.set(2020,2,1);
        printResult(fromCal, toCal);
        fromCal.set(2020,0,1);
        toCal.set(2020,2,23);
        printResult(fromCal, toCal);
        fromCal.set(2020,0,23);
        toCal.set(2020,2,21);
        printResult(fromCal, toCal);
        fromCal.set(2021,0,22);
        toCal.set(2020,2,21);
        printResult(fromCal, toCal);
        fromCal.set(2020, 0, 10);
        toCal.set(2022, 5, 10);
        printResult(fromCal, toCal);

    }
}
