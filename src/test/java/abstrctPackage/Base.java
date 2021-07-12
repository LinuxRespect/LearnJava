package abstrctPackage;
//абстрактные классы не могут быть final
// не cоздаются обьекты абстрактных классов, кроме тех случаев когда реализуются его абстрактные методы
public  abstract class Base implements BaseInterface {

    abstract public void process();
    public abstract void process2();
    /* так методы абстрактные нельзя определять
    public abstract void process3(){

    }*/
    public static void main(String[] args) {
        Base base = new Child();
        base.draw();
        Base base1 = new Base() {
            @Override
            public void draw() {

            }

            @Override
            public void process() {

            }

            @Override
            public void process2() {

            }
        };
    }
}
