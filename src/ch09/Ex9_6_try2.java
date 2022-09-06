package ch09;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex9_6_try2 {

    public static void main(String[] args) {
        String[] phoneNumber = {
                "012-3456-7890",
                "099-2456-7980",
                "088-2346-9870",
                "013-3456-7890"
        };

        ArrayList list = new ArrayList();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print(">>");
            String input = s.nextLine().trim();

            if (input.equals("")) {
                continue;
            } else if (input.equalsIgnoreCase("Q")) {
                System.exit(0);
            }

            String regEx = input;
            Pattern pattern = Pattern.compile(regEx);

            for (String tellNo : phoneNumber) {
                String tellNoWithoutDash = tellNo.replaceAll("-", "");
                Matcher matcher = pattern.matcher(tellNoWithoutDash);
                if (matcher.find()) {
                    list.add(tellNo);
                }
            }

            if (list.size() > 0) {
                System.out.println(list);
                list.clear();
            } else {
                System.out.println("일치하는 번호가 없습니다.");
            }
        }


    }


}

