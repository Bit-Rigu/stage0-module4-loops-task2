package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        System.out.println(1);
        while (i < printToInclusive) {
            int temp = 1;
            int fact = 1;
            while (temp <= i + 1) {
                fact *= temp;
                temp++;
            }
            System.out.println(fact);
            i++;
        }
    }
}
