package com.company;

/**
 * Created by Денис on 09/11/17.
 */
public class Owl {
    private String name;
    private String age;
    private String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void hunts() {
        System.out.println("Сова охотится");
    }

    public void devoursPrey() {
        System.out.println("Сова пожирает добычу");
    }

    public void sleep() {
        System.out.println("Сова спит");
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Сова");
        sb.append(" ").append(name);
        sb.append(" возрастом ").append(age);
        sb.append(" и породой \"").append(breed);
        sb.append('\"');
        return sb.toString();
    }
}

