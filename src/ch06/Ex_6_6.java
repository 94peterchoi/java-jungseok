package ch06;

public class Ex_6_6 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);

        System.out.println(p.getDistance(2,2));
    }
}

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x, int y) {

        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }


}


// 6-7. weapon, armor
// 6-8. 1, 3, 4
// 6-9. 다 맞는데..?

// 6-10. 3, 4
// 6-11. 2,3,4
// 6-12. 3,4,5
// 6-13. 2
// 6-14. 1,5
// 6-15. 2,6
// 6-16. ABC123456