public class Main {
    public static void main(String[] args) {
        //DEFINITION:
        /*
        -In Java, an interface is an abstract type that contains a collection of methods and constant variables.
        -It is one of the core concepts in Java and is used to achieve abstraction, polymorphism and multiple inheritances.
        -We can implement an interface in a Java class by using the implements keyword.
        */

        //THE PURPOSE AND WHY WE USE INTERFACES:
         /*
       - In the Java programming language, an interface is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.
       - Method bodies exist only for default methods and static methods.
       - Why do we use interface ? It is used to achieve total abstraction.
       - Since java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance .
       - It is also used to achieve loose coupling.
        */
        IWorkable workable = new Worker();
        workable.work();
        IEatable eatable = new Worker();
        eatable.eat();
        IPayable payable = new Worker();
        payable.pay();


    }
}
