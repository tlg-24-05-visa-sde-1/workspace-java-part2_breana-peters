package com.crisp;

import java.util.List;

class RadishSortTest {
    public static void main(String[] args) {
        List <Radish> radishes = newArrayList<>();
        radishes.add(new Radish ("red", 1.5, 2.5,5));
        radishes.add(new Radish ("black", 1.0,0.0,0));
        radishes.add(new Radish ("red", 2.7, 5.5, 0));
        radishes.add(new Radish("pink", 0.9, 0.0,6));

        //Original List
        dump(radishes);
    }

    //sort by natural order (passing null means natural order)
    radishes.sort(null);

    private static void dump(List<Radish> radishes) {
        for (Radish radish :radishes){
            System.out.println(radish); //toString() automatically called
        }
    }


}
