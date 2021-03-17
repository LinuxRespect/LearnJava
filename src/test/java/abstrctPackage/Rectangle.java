package abstrctPackage;

public class Rectangle extends Figure{
    private int side1 = 1;
    private int side2 = 1;
    public Rectangle(int side1, int side2) {
        super(side1, side2);
    }
    @Override
    public void countArea() {
        System.out.print(side1 * side2 + ", ");
        System.out.print(super.side1 * super.side2);
    }
}
