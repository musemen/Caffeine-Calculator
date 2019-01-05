package com.musamohannad.ablm;


import android.text.Editable;

import java.util.ArrayList;

public class User {
        String name;
        int age;
        Editable height;
        Editable weight;
        ArrayList<String> coffees;

        public User(String name, int age, Editable height, Editable weight, ArrayList<String>coffees){
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.coffees=coffees;
        }

        public String getname(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public Editable getHeight(){
            return height;
        }
        public Editable getWeight(){
            return weight;
        }
        public ArrayList getcoffees(){
            return coffees;
         }

        public void addcoffee(String c){
            coffees.add(c);
         }
         public double setWeight( ){
            return 0.0;
        }
        public double setHeight() {
            return 0.0;
        }

    }

