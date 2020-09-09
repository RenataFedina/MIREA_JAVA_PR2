package com.company;

public class Dog {
    private String breed, color;
    private int age;

    public Dog(String breed, String color, int age) //конструктор
    {
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public String getBreed()
    {
        return breed;
    }
    public void  setBreed(String breed)
    {
        this.breed = breed;
    }

    public String getColor()
    {
        return color;
    }
    public void  setColor(String color)
    {
        this.color = color;
    }

    public int getAge()
    {
        return age;
    }
    public void  setAge(int age)
    {
        this.age = age;
    }

    public int humanage()
    {
        return age * 7;
    }

    public String toString()
    {
        return "Dog{"
                + "breed='" + breed + '\''
                + ", color=" + color
                + ", age=" + age
                + '}';

    }



}