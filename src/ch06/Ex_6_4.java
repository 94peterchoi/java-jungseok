package ch06;

public class Ex_6_4 {
    static double getDistance(int x, int y, int x1, int y1) {
        int xDiff = x - x1;
        int yDiff = y - y1;

        int squared = xDiff * xDiff + yDiff * yDiff;
        double sqrt = Math.sqrt(squared);

        return sqrt;
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1,1,2,2));

    }
}

// 클래스 변수 : width, height

// 인스턴스 변수 : kind, num

// 지역변수: k, n
