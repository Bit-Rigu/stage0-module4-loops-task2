package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        boolean flag = false;
        while(i <= printToInclusive) {
            int temp = 2;
            while(temp < i) {
                flag = i % temp == 0;
                if(flag) break;
                temp++;
            }
            if (flag) {
                flag=false;
            } else {
                System.out.println(i);
            }
            i++;
        }
    }
}
