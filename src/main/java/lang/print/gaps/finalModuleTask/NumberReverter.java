package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int third = (number % 10) * 100;
        number /= 10;
        int second = (number % 10) * 10;
        number /= 10;
        int first = (number % 10);
        System.out.println(third + second + first);
    }
}
