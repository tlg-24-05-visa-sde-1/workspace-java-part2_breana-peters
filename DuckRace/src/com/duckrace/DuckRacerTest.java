package com.duckrace;

import java.util.Collection;

class DuckRacerTest {
    public static void main(String[] args) {
        DuckRacer racer1 = new DuckRacer (1, "Amir");

        racer1.win(Reward.DEBIT_CARD);
        racer1.win(Reward.DEBIT_CARD);
        racer1.win(Reward.PRIZES);
        racer1.win(Reward.DEBIT_CARD);

        System.out.println(racer1); //toString() automatically called

        //get the reward and show them
        Collection<Reward> rewards = racer1.getRewards();
        System.out.println(rewards);


        racer1.win(Reward.PRIZES); //rewards now has 5
        System.out.println(rewards); //reads-thru to rewards so shows 5 now
    }
}
