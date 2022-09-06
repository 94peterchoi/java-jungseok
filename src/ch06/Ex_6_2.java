package ch06;

public class Ex_6_2 {
    public static void main(String[] args) {
        Student2 s = new Student2("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);

    }
}


class Student2 {
    private String name;
    private int ban;
    private int no;
    private int kor;
    private int eng;
    private int math;


    public Student2 (String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String info() {
        int sum = this.kor + this.eng + this.math;
        float avg = (float) sum / 3 ;
        float avg2 = (int)((kor+eng+math) / 3f * 10 + 0.5f);


        return this.name + "," + this.ban + "," + this.no + "," + this.kor + "," + this.eng + "," + this.math + "," + sum + "," + avg2;
    }

}