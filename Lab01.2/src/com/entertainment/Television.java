package com.entertainment;

import java.util.Objects;



// Note: To be "consistent with equals you must use the same sort key(s) as you are using in your equals and hash code methods
//Natural order is defind by the brand (String) and then by volume
//brand is our "sort key"
public class Television implements Comparable<Television> {
     //Instance Variables
     private String brand;
     private int volume;


     //Television HAS a Tuner( for all things related to channel changing)
     private final Tuner tuner = new Tuner();

     //constructors

     public Television(){
         super();
     }

     public Television(String brand, int volume) {
         super ();
        setBrand(brand);
        setVolume(volume);
     }

     //business / action methods
     public int getCurrentChannel(){
         return tuner.getChannel();
     }

     public void changeChannel (int channel){
         tuner.setChannel(channel); //delegate to contained Tuner object
     }


     //Accessor Method

     public String getBrand() {
         return brand;
     }

     public void setBrand(String brand) {
         this.brand = brand;
     }

     public int getVolume() {
         return volume;
     }

     public void setVolume(int volume) {
         this.volume = volume;

     }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Television other = (Television) obj;
        return getVolume() == other.getVolume() &&
                Objects.equals(this.getBrand(), other.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getVolume());
    }

    //     @Override
//     public int hashCode(){
//
//         // this is a scientically correct hash function ie minimizes the probability of hash collisions
//
//         return Objects.hash(getBrand() , getVolume());
//
//         // this is a poor hash function because it easily yields "hash collisions"
//         // a hash collision
//        // return getBrand().length() + getVolume();//
//     }





    //'size' (double) is our sort key
    @Override
    public int compareTo(Television other){
         int result = this.getBrand().compareTo(other.getBrand());

         if (result == 0){ // tied on brand, so break the tie based on volume
             result = Integer.compare(this.getVolume(), other.getVolume());
         }
         return result;
    }



    @Override
     public String toString(){
         return String.format("%s: brand=%s , volume=%s, currentChannel =%s",
                 getClass().getSimpleName(), getBrand(), getVolume(),getCurrentChannel());
     }

 }
