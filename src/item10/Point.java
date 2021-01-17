package item10;

import java.awt.*;

/**
 * 추이성 : 첫 번쨰 객체와 두 번쨰 객체가 같고, 두 번쨰 객체와 세번쨰 객체가 같다면, 첫 번쨰 객체와 세 번쨰 객체도 같아야 한다는 뜻이다.
 */
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Point)) return false;
//        Point point = (Point) o;
//        return point.x == x && point.y == y;
//    }

    // 잘못된 코드 - 리스코프 치환 원칙
    @Override
    public boolean equals(Object o) {
        if(o == null || o.getClass() != getClass()) return false;
        Point p = (Point) o;
        return p.x == x && p.y == y;
    }

    public static void main(String[] args) {
        Point p = new Point(1,2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
        System.out.println(p.equals(cp)); // true
        System.out.println(cp.equals(p)); // false
    }
}

class ColorPoint extends Point {
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    // 잘못된 코드 - 대칭성 위배
    /*
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint)) return false;
        return super.equals(o) && ((ColorPoint) o).color == color;
    }
    */

    // 잘못된 코드 - 대칭성은 지켜주지만, 추이성 위배
    /*
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) return false;

        // o가 일반 Point면 색상을 무시하고 비교한다.
        if (!(o instanceof ColorPoint)) return o.equals(this);

        // o가 ColorPoint면 생상까지 비교한다.
        return super.equals(o) && ((ColorPoint) o).color == color;
    }
     */
}
