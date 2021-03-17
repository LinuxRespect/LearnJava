package constructor;

public class Construct {
    // не принимает любых модификаторов доступа
    protected int wheelCount;
    private String model;
    public Construct(String model) {
        this.model = model;
        this.wheelCount = 4;
    }
    public String getlnfo() {
        System.out.println("Model: " + model + " wheels:" + wheelCount);
        return "Model: " + model + " wheels:" + wheelCount;
    }

    public static void main(String[] args) {
        ChildConstruct childConstruct = new ChildConstruct("10");
        childConstruct.getlnfo();
        Construct construct =new ChildConstruct("20");
        construct.getlnfo();
        Construct orgConstruct = new Construct("40");
        orgConstruct.getlnfo();
    }

}
