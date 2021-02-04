package item16;

/**
 * 접근자와 변경자(mutator) 메서드를 활용해 데이터를 캡슐화한다.
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}

/**
 * 불변 필드를 노출한 public 클래스
 */
final class Time {
    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_HOUR = 60;

    public final int hour;
    public final int minute;

    public Time(int hour, int minute) {

        this.hour = hour;
        this.minute = minute;
    }
}
