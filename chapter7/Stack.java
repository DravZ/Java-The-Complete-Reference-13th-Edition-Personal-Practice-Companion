package chapter7;

public class Stack {
    private int [] stck = new int [10];
    private int tos;

    //Initializa top-of-stack
    Stack(){
        tos = -1;
    }

    //Push an item onto the stack
    void push(int item){
        if(tos == 9){
            System.out.println("Stack is full");
        }else{
            stck[++tos] = item;
        }
    }

    int pop(){
        if(tos < 0){
            System.out.println("Stack underflow");
            return 0;
        }else{
            return stck[tos--];
        }
    }
}

