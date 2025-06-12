package week7.Interfaces.LambdaExercises;

public class Main {
    public static void main(String[] args) {
        NumericOperations nm = (a,b) -> a * b;
        System.out.println(nm.operate(5,6));

        NumericOperations nm1 = (a,b) -> a + b;
        System.out.println(nm1.operate(2,2));

        NumericOperations nm2 = (a, b) -> a > b  ? a : b;
        System.out.println(nm2.operate(10,15));

        StringFormatter sf = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
        System.out.println(sf.format("Linda ", "Orozco"));
    }
}
