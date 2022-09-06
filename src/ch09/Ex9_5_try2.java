package ch09;

public class Ex9_5_try2 {

    public static String delChar(String src, String delCh) {

        StringBuffer sb = new StringBuffer();

        for (int i=0; i<src.length(); i++) {
            char c = src.charAt(i);
            int index = delCh.indexOf(c);
            if (index != -1) {
                continue;
            }
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
        System.out.println("두번째 => " + delChar("(1 2 3 4\t5)", " \t"));
    }

}
