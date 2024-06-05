package com.entertainment;

import java.util.Objects;

public class Television {
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



//@Override
//     public boolean equals(Object obj){
//         boolean result = false;
//
//
//         //check the obj is really referring to a Television object then we proceed
//    // if (obj instanceofTelevision){ //IS A Check
//         if(this.getClass() == obj.getClass() { // Are we the exact same type?
//             //downcast 'obj' to more specific refrence type Television for getName(), getAge()
//             Television other = (Television) obj;
//
//             // do the checks: business equality is defined as brand, volume
//    result = Objects.equals(this.getBrand(), other.getBrand()) && // null safe check
//            this.getVolume() == other.getVolume(); // primitives cant be
//
//         }
//         // check that obj is really referring to a Television object
//         return result;
//
//     }

     @Override
     public String toString(){
         return String.format("%s: brand=%s , volume=%s, currentChannel =%s",
                 getClass().getSimpleName(), getBrand(), getVolume(),getCurrentChannel());
     }

 }
