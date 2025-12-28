package chapter6;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        System.out.println("Volume is " + mybox1.volume(0));
        System.out.println("Volume is " + mybox2.volume(0));
    }
}
