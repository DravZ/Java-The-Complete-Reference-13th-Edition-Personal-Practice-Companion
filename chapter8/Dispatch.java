package chapter8;

public class Dispatch {
    public static void main(String[] args) {
        A4 a = new A4();
        B4 b = new B4();
        C4 c = new C4();

        A4 r;

        r = a;
        r.callMe();

        r = b;
        r.callMe();

        r = c;
        r.callMe();
    }
}
