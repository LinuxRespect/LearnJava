import java8Interface.InterfaceWithoutModificator;

public class MainClass implements InterfaceWithoutModificator {

        public static void main(String[] args) {
                MainClass mainClass = new MainClass();
                mainClass.createDefaultMethod();
                mainClass.methodAbstractSimple();
                InterfaceWithoutModificator.createSimpleStatic();
                double c = PI*2;
                System.out.println(c);
            //    width = 5;// не можем изменять поля , так как они final
                System.out.println(width+3);



        }

        @Override
        public void methodAbstractSimple() {
                System.out.println("Simple method invoke from Main Class");

        }

        @Override
        public void method2() {

        }

        //        @Override
//        public String createDefaultMethod() {
//                return InterfaceWithoutModificator.super.createDefaultMethod();
//        }
}
