package chapter8;

public class TypeInferenceAndInheritance {
    static MyClass getObj(int which){
        switch (which){
            case 0: return new MyClass();
            case 1: return new FirstDerivedClass();
            default:return new SecondDerivedClass();
        }
    }

    public static void main(String[] args) {
        var mc = getObj(0);
        var m2 = getObj(1);
        var m3 = getObj(3);

        mc2.x = 10;
        mc3.y = 10;
    }
}
