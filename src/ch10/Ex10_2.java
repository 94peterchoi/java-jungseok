package ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex10_2 {
    public static void main(String[] args) {

        String[] day_of_week = {"일", "월", "화", "수", "목", "금", "토"};
        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};

        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()) {
            try {
                String stringDate = scanner.nextLine();
                Date parsedDate = df.parse(stringDate);
                Calendar cal = Calendar.getInstance();
                cal.setTime(parsedDate);

                System.out.println("입력한 날짜는 " + day_of_week[parsedDate.getDay()]);
                System.out.println("입력한 날짜는 " + DAY_OF_WEEK[cal.get(Calendar.DAY_OF_WEEK)]);
                System.out.println(new SimpleDateFormat("입력한 날짜는 E요일").format(parsedDate));

                break;
            } catch (Exception e) {
                System.out.println("날짜를 yyyy/mm/dd의 형태로 입력해주세요.");
                e.printStackTrace();
            }
        }





    }
}
