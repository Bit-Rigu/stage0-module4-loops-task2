package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int i = 0;
            int res = 1;
            if (power == 0) {
                System.out.println(1);
            } else {
                System.out.println(1);
                while (i < power) {
                    res = 2 * res;
                    System.out.println(res);
                    i++;
                }
            }
        }

    }
}
