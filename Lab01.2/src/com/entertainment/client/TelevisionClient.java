package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class TelevisionClient {
     public static void main(String[] args) {
     /*    Television tv1 = new Television();
         Television tv2 = new Television("RCS" ,10);

         System.out.println(tv1); //toString () automatically called
         System.out.println(tv2);

         tv2.changeChannel(9);
         System.out.println(tv2);
         System.out.println();

      */

         //  This part of the application to examine == and the equals () method

         Television tvA = new Television("Sony" , 50);
         Television tvB = new Television("Sony" , 50);
         Television tvC = new Television("Sony" , 52);
         Television tvD = new Television("Sony" , 12);



         System.out.println(tvA.hashCode());//54
         System.out.println(tvB.hashCode());//54

         System.out.println("tvA == tvB: " + (tvA == tvB)); //false of course
         System.out.println("tvA.equals(tvB) : " + tvA.equals(tvB)); // true now
         System.out.println();

         Set<Television> tvs = new TreeSet<>();
         tvs.add(tvA);
         tvs.add(tvB);
         tvs.add(tvC);
         tvs.add(tvD);

         System.out.println("The side of the Set is : " + tvs.size()); // should be 1
         System.out.println();
         for (Television tv: tvs){
             System.out.println(tv);
         }

     }
}
