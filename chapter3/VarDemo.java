package chapter3;

public class VarDemo {
    public static void main(String[] args) {
        //Use type inference to determine the type of the variable
        var avg = 10.0;
        System.out.println("Value of avg: " + avg);

        //Now var is not a predefined identifier.
        //It is simply a user-defined variable name
        int var = 1;
        System.out.println("Value of var: " + var);

        var k = -var;
        System.out.println("Value of k: " + k);
    }
}
