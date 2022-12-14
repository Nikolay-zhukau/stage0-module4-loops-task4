package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

        for (int i = 0; i < Math.abs(lastInRow); i++){
            int sumAfterSkip = 0;
            int sumSkip = 0;
            if (lastInRow < 0) {
                System.out.println("last number in row is negative");
                break;
            }
            if (lastInRow < numberToSkip) {
                System.out.println("number to skip is bugger then the last");
                break;
            }
            do {
                sumSkip = sumSkip + i;
                i++;
            }while (i <= numberToSkip);
            System.out.println("skipped sum is " + sumSkip);
            if (numberToSkip == lastInRow){
                System.out.println("counted sum is " + sumAfterSkip);
                break;
            }
            do {
                sumAfterSkip += i;
                i++;
            }while (i > numberToSkip && i <= lastInRow);
             System.out.println("counted sum is " + sumAfterSkip);

        }

    }
}
