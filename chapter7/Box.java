package chapter7;

public class Box{
    double width;
    double height;
    double depth;

    Box(double height, double width, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box(){
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    Box(double len){
        width = height = depth = len;
    }

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    double volume(){
        return width * height * depth;
    }

    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
