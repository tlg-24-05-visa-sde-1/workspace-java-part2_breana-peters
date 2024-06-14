package com.crisp;

//natural order is defined by size a (double)
// size is called the "sort key"

 class Radish implements Comparable <Radish> {
     private String color;
     private double size;
     private double tailLength;
     private int guysOnTop;

     //ToDo: generate accessor methods for these
     //write toString()
     //write a 4 arg constructor that takes them all in and delegate to the setters
     public Radish (String color, double size, double tailLength, int guysOnTop){
         setColor (color);
         setSize (size);
         setTailLength(tailLength);
         setGuysOnTop(guysOnTop);

     }

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }

     public double getSize() {
         return size;
     }

     public void setSize(double size) {
         this.size = size;
     }

     public double getTailLength() {
         return tailLength = tailLength;
     }

     public void setTailLength(double tailLength) {
         this.tailLength = tailLength;
     }


     public void setGuysOnTop(int guysOnTop) {
         this.guysOnTop = guysOnTop;}

     }

// size (double) is our sort key

     @Override
     public  String toString(){
     return String.format(" %s: color=%s , size=%s, tailLength=%s, guysonTop=%s" ),
         getClass().getSimpleName(), getColor(), getSize(), getTailLength(),getGuysonTop());
     }
