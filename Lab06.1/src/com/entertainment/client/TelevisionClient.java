package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionClient {

    public static void main(String[] args) {
        // try out some Televisions, using the new display property
        Television tv1 = new Television();
        System.out.println(tv1);
        System.out.println();

        Television tv2 = new Television("RCA", 10);
        System.out.println(tv2);
        tv2.setDisplay(Television.DisplayType.CRT);
        System.out.println(tv2);
        System.out.println();

        Television tv3 = new Television("Sony", 50, Television.DisplayType.LED);
        System.out.println(tv3);
        System.out.println();

        // try out "equal" Television instances - display now included in comparison
        Television tvA = new Television("Sony", 50, Television.DisplayType.PLASMA);
        Television tvB = new Television("Sony", 50, Television.DisplayType.PLASMA);
        Television tvC = new Television("Sony", 50, Television.DisplayType.LCD);
        System.out.println("tvA.equals(tvB): " + tvA.equals(tvB));
        System.out.println("tvA.equals(tvC): " + tvA.equals(tvC));
    }
}