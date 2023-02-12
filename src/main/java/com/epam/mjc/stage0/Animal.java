package com.epam.mjc.stage0;

public class Animal {
        private String color;
        private int numberOfPaws;
        private boolean hasFur;

        public Animal(String color, int numberOfPaws, boolean hasFur){
                 this.color = color;
            this.numberOfPaws = numberOfPaws;
            this.hasFur = hasFur;
        }
  
        public String getDescription(String color, int numberOfPaws, boolean hasFur){
            String Fur;
            if(hasFur) Fur ="a";
            else Fur = "no";
            String Pows ="";
            if(numberOfPaws > 1) Pows = "s";
            String ans =  "This animal is mostly " + color + ". It has " + numberOfPaws +
                    " paw"+Pows +" and "+ Fur + " fur.";
                
            return ans;
        }


}
