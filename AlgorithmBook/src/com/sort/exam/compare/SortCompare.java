package com.sort.exam.compare;

import edu.princeton.cs.algs4.*;


/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: SortCompare .java
 * @Create : 2019-02-23-17:58
 * @Description :
 */
public class SortCompare {

    public static double time(String alg,Double[] a){
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion")){
            Insertion.sort(a);
        }
        if (alg.equals("Selection")){
            Selection.sort(a);
        }
        if (alg.equals("Shell")){
            Shell.sort(a);
        }
        if (alg.equals("MergeUntil")){
            Merge.sort(a);
        }
        if (alg.equals("Quick")){
            Quick.sort(a);
        }
        if (alg.equals("Heap")){
            Heap.sort(a);
        }
        return timer.elapsedTime();
    }
    public static double timeRandomInput(String alg,int N, int T){
        //使用 算法alg 将T个长度为N的数组排序
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t=0; t < T;t++){
            for (int i=0; i < N; i++){
                a[i] = StdRandom.uniform();
            }
            total += time(alg,a);
        }
        return total;
    }

    public static void main(String[] args) {
        String alg1 = args[0];
        String alg2 = args[1];
        int N = Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);
        //1
        double t1 = timeRandomInput(alg1,N,T);
        //2
        double t2 = timeRandomInput(alg2, N, T);

        System.out.printf("For %d random Doubles \n  %s is", N,alg1);
        System.out.printf("%.1f times faster than  %s\n", t2/t1,alg2);

    }
}
