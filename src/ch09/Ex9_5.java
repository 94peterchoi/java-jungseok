package ch09;

public class Ex9_5 {

    public static String delChar(String src, String delCh) {

        for (int i=0; i<delCh.length(); i++) {
            char c = delCh.charAt(i);
            while(true) {
                StringBuffer processedString = new StringBuffer();
                int index = src.indexOf(c);
                if (index == -1) {
                    break;
                }
                processedString.append(src.substring(0, index));
                processedString.append(src.substring(index + 1));

                src = processedString.toString();
            }
        }

        return src;
    }

    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
        System.out.println("두번째 => " + delChar("(1 2 3 4\t5)", " \t"));
    }
}
