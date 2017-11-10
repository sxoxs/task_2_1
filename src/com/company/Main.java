package com.company;

public class Main {

    public static void main(String[] args) {
        Owl[] owlArray = new Owl[4];

        for (int i = 0; i < owlArray.length; i++) {
            owlArray[i] = new Owl();
        }

        owlArray[0].setName("Фил");
        owlArray[0].setAge("3");
        owlArray[0].setBreed("Сипуха");

        owlArray[1].setName("Керби");
        owlArray[1].setAge("2");
        owlArray[1].setBreed("Кроличий сыч");

        owlArray[2].setName("");
        owlArray[2].setAge("4");
        owlArray[2].setBreed("Западноамериканская совка");

        owlArray[3].setName("Сива");
        owlArray[3].setAge("1");
        owlArray[3].setBreed("Северный воробьиный сыч");

        System.out.println(owlArray[0].toString());
        owlArray[0].sleep();
        System.out.println(owlArray[1].toString());
        owlArray[1].sleep();
        System.out.println(owlArray[2].toString());
        owlArray[2].hunts();
        System.out.println(owlArray[3].toString());
        owlArray[3].devoursPrey();
    }
}
