package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student2 {
    String name;
    int ban;
    int no;

    int kor;
    int eng;
    int math;

    public Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int)((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", no=" + no +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", getTotal()=" + getTotal() +
                ", getAverage()=" + getAverage() +
                '}';
    }
}

class BanNoAscending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        // 반과 번호로 오름차순 (반이 같은 경우 번호를 비교해서 정렬)
//        if (!(o1 instanceof Student2) || !(o2 instanceof Student2)) {
//            return -1;
//        }
//        Student2 firstStudent = (Student2) o1;
//        Student2 secondStudent = (Student2) o2;
//
//        if (firstStudent.ban > secondStudent.ban) {
//            return 1;
//        }
//
//        if (firstStudent.ban == secondStudent.ban) {
//            return checkBan(firstStudent, secondStudent);
//        }
//
//        return -1;

        if (!(o1 instanceof Student2) || !(o2 instanceof Student2)) {
            return -1;
        }
        Student2 firstStudent = (Student2) o1;
        Student2 secondStudent = (Student2) o2;

        int banDifference = firstStudent.ban - secondStudent.ban;

        if (banDifference == 0) {
            return firstStudent.no - secondStudent.no;
        }

        return banDifference;
    }

    private int checkBan(Student2 firstStudent, Student2 secondStudent) {
        if (firstStudent.no > secondStudent.no) {
            return 1;
        }
        if (firstStudent.no == secondStudent.no) {
            return 0;
        }
        return -1;
    }


}

public class Ex11_4 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student2("홍길동", 2, 1, 70, 900, 70));
        list.add(new Student2("남궁성", 2, 2, 60, 100, 80));
        list.add(new Student2("김자바", 1, 3, 100, 100, 100));
        list.add(new Student2("이자바", 1, 1, 90, 70, 80));
        list.add(new Student2("안자바", 1, 2, 80, 80, 90));


        Collections.sort(list, new BanNoAscending());
        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
