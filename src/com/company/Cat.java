package com.company;

public class Cat {
    String name;
    String breed;
    int age;
    int weight;



    public Cat(String name, String breed, int age, int weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }



        public boolean equals(Object obj) {
            if (obj instanceof Cat) {
                Cat cat = (Cat) obj;
                return this.weight.equals(cat.weight) && this.age == cat.age;
            }
        return false;

        }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    }
