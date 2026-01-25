package chapter8;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7,  8.37);
        Box plainBox = new Box();

        System.out.println("Volume of weightbox is " + weightBox.volume());
        System.out.println("Weight of weightbox is " + weightBox.weight);
        System.out.println();

        plainBox = weightBox;

        System.out.println("Volume of plainbox is " + plainBox.volume());
        //System.out.println("Weight of plainbox is " + plainBox.weight);
    }
}
