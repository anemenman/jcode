package jcode.ch_05_multithreading.q_37_fork_join_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinFramework_01 {
    public static void main(String[] args) {
        ListSummer summer = new ListSummer(new ArrayList<Integer>() {{
            add(5);
        }});
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(summer);

        int result = summer.join();

        System.out.println("result = " + result);//5
    }
}

class ListSummer extends RecursiveTask<Integer> {
    private final List<Integer> listToSum;

    ListSummer(List<Integer> listToSum) {
        this.listToSum = listToSum;
    }

    @Override
    protected Integer compute() {
        if (listToSum.isEmpty()) {
            System.out.println("Found empty list, sum is 0");
            return 0;
        }

        int middleIndex = listToSum.size() / 2;
        System.out.println("List " + listToSum + " middle Index " + middleIndex);

        List<Integer> leftSublist = listToSum.subList(0, middleIndex);
        List<Integer> rightSublist = listToSum.subList(middleIndex + 1, listToSum.size());

        ListSummer leftSummer = new ListSummer(leftSublist);
        ListSummer rightSummer = new ListSummer(rightSublist);

        leftSummer.fork();
        rightSummer.fork();

        Integer leftSum = leftSummer.join();
        Integer rightSum = rightSummer.join();
        int total = leftSum + listToSum.get(middleIndex) + rightSum;
        System.out.println("Left sum is " + leftSum + ", right sum is " + rightSum + ", total is " + total);

        return total;
    }
}
