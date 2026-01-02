package chapter7;

public class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        System.out.println("Volume of mybox1 is " + mybox1.volume());
        System.out.println("Volume of mybox2 is " + mybox2.volume());
        System.out.println("Volume of mybox3 is " + mycube.volume());
    }
}
