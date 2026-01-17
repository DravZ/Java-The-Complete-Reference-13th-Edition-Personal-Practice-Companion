package chapter7;

public class TestStacvk2 {
    public static void main(String[] args) {
        StackImp mystack1 = new StackImp(5);
        StackImp mystack2 = new StackImp(8);
        for (int i = 0; i < 5; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            mystack2.push(i);
        }

        System.out.println("Stack is mystack1: ");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack is mystack2: ");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}
