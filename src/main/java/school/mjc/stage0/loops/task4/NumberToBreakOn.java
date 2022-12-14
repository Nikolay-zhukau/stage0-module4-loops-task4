package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        for (int i = 1; i <= numberToGoUntil; i++) {
            if (toBreakWith > numberToGoUntil) {
                System.out.println("iterating till the end");
                do {
                    System.out.println(i);
                    i++;
                } while (i <= numberToGoUntil);
                break;
            }
            if(i > toBreakWith){
                continue;
            }
                System.out.println(i);
        }
    }
}
