package chapters.chapter10.Exercises10.Exercise10_13;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(double x, double y) {
        boolean xValid = x > (this.x - width / 2) && x < (this.x + width / 2);//right x  or left x
        boolean yValid = y > (this.y - height / 2) && y < (this.y + height / 2);//top y or bottom y
        return xValid && yValid;
    }

    public boolean contains(MyRectangle2D r) {
        double[][] corners = getCorners(r);
        for (int i = 0; i < corners.length; i++) {
            if (!contains(corners[i][0], corners[i][1])) {
                return false;
            }

        }
        return true;

    }

    private static double[][] getCorners(MyRectangle2D r) {
        double[][] corner = new double[4][2];
        corner[0][0] = r.getX() - r.getWidth() / 2;
        corner[0][1] = r.getY() + r.getHeight() / 2;

        corner[1][0] = r.getX() - r.getWidth() / 2;
        corner[1][1] = r.getY() - r.getHeight() / 2;

        corner[2][0] = r.getX() + r.getWidth() / 2;
        corner[2][1] = r.getY() - r.getHeight() / 2;

        corner[3][0] = r.getX() + r.getWidth() / 2;
        corner[3][1] = r.getY() + r.getHeight() / 2;

        return corner;
    }

    public boolean overlaps(MyRectangle2D r) {
        if ((getY() + (getHeight() / 2) < r.getY() - (r.getHeight() / 2)) ||
                (getY() - (getHeight() / 2) > r.getY() + (r.getHeight() / 2)) ||
                (getX() + (getWidth() / 2) < r.getX() - (r.getWidth() / 2)) ||
                (getX() - (getWidth() / 2)) > r.getX() + (r.getWidth() / 2)) {
            return false;
        }
        return true;

    }
}


