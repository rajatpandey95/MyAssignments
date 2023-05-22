package intermediate_oops_assignment;

// Test 1 : Throws error as abstract method in non-abstract class
//class Abstract1{
//    public abstract test1();
//}

abstract class Abstract2 {
}

// Test 3
abstract class Abstract3 {
    abstract void display();
}
// As we do not Override the display method of Abstract3 it gives Error
// class Test extends Abstract3{
//
// }

// Test 4 : abstract class cannot be private
// private abstract class Abstract4{
//
// }

// Test 5 : abstract class cannot be final
// final abstract class Abstract5{
//
// }

// Test 6 : You can declare a class abstract without having any abstract method
abstract class Abstract6 {
    public void display() {
        System.out.println("Hello World");
    }
}

public class question4 {
    public static void main(String[] args) {

        // Test 2 : Cannot instantiate a Abstract class
        // Abstract2 obj = new Abstract2();
    }
}
