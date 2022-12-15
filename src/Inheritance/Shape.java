package Inheritance;

public class Shape extends Rectangle{
    public static void main(String[] args) {
        System.out.println("This is shape program: ");

        Rectangle.Rectangle();

        Triangle myTriangle = new Triangle();
        myTriangle.PrintTriangle();
        Circle myCircle = new Circle();
        myCircle.PrintCircle();
    }

}
// Class shape :-
// 1.use method to print "THIS is shape program"
//2. THis is rectangle :- method should be static
//3. This is circle :- method should non static/instance method
//4. This is triangle :- non static/instance

//Class Rectangle :- Call the method from class shape which prints that is rectangle
//Class Circle : Call the method from class shape which prints that is circle
//Class Triangle :  Call the method from class shape which prints that is Triangle