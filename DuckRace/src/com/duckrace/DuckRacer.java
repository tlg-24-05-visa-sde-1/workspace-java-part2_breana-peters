package com.duckrace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class DuckRacer {
    //properties fields, instance variables
    private final int id;
    private String name;
    private int wins;
    private  final Collection<Reward> rewards = new ArrayList<>();

    public DuckRacer(int id, String name){
        this.id = id;
       setName(name);

    }

    // business or action methods
    public void win(Reward reward){
        rewards.add(reward);
    }


    //accessor methods

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return rewards.size();
    }


    //Note: return a read-only view if the rewards collection (client cant modify it!)
    public Collection<Reward> getRewards() {
        return Collections.unmodifiableCollection(rewards);
    }
    @Override
    public String toString(){
        return String.format("%s: id=%s, name =%s, wins=%s, rewards=%s" ,
                getClass() .getSimpleName(), getId(),getName(), getWins(),getRewards());
    }



}
