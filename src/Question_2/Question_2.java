package Question_2;

@FunctionalInterface
interface Add {
    int add(int a, int b);
}

@FunctionalInterface
interface Substract {
    int substract(int a, int b);
}

@FunctionalInterface
interface Multiply {
    int multiply(int a, int b);
}

public class Question_2 {

    // Using (instance) Method reference create and apply add and subtract method and
    // using (Static) Method reference create and apply multiplication method for the functional interface created

    public static void main(String[] args) {


        //Add numbers using Method reference
        Add addInterface = new MethodReference()::add;
        System.out.println(addInterface.add(2, 4));

        //Substract numbers using method reference
        Substract substractInterface = new MethodReference()::substract;
        System.out.println(substractInterface.substract(5, 2));

        //Multiply numbers using static reference
        Multiply multiplyInterface = MethodReference::multiply;
        System.out.println(multiplyInterface.multiply(2, 4));


    }
}
