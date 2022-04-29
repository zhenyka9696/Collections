package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Emperor emperor =new Emperor("emperor");
        ArrayList<Courtier> courtiers=new ArrayList<>();
        courtiers.add(new Courtier("courtier1"));
        courtiers.add(new Courtier("courtier2"));
        courtiers.add(new Courtier("courtier3"));
        Birbal birbal=new Birbal("Birbal");
        System.out.println(emperor.getName());
        emperor.asks(0);

        for(int i=0;i<courtiers.size();i++)
            courtiers.get(i).thinks();
        //Два цикла равны
        for(Courtier courtier:courtiers)
            courtier.thinks();
        courtiers.forEach(Courtier::thinks);
        birbal.enters();
        birbal.asks();
        emperor.asks(0);
        birbal.replies();
        emperor.asks(1);
        birbal.says();

    }
}

    class Person{
            public Person(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            private final String name;
            // Not read, etc...

        }

        class Emperor extends  Person {
            private final LinkedList<String> questions;

            public Emperor(String name) {
                super(name);
                questions = new LinkedList<>();
                questions.add("How many crows are in this city?");
                questions.add("How can you be sure?");
            }

            public void looks() {
                System.out.println(getName() + " glanced at his courtiers");
            }

            public void asks(int number) {
                System.out.println(getName() + " asks: " + questions.get(number));
            }
        }
            class Courtier extends Person {

                public Courtier(String name) {
                    super(name);
                }

                public void thinks() {
                    System.out.println("Head of the " + getName() + " began to hang low");
                }
            }


            class Birbal extends Person {
                public Birbal(String name) {
                    super(name);
                }

                public void enters() {
                    System.out.println(getName() + " enter the courtyard");
                }

                public void asks() {
                    System.out.println(getName() + " asks: " + "May I know the question?");
                }
                public void replies()
                {
                    System.out.println("we are replying");
                }
                public void says() {
System.out.println(getName() + " Make you men count, My lord. If you find more \n" +
"crows it means some have come to visit their relatives here. \n" +
"If you find less number of crows it means some have gone to \n" +
"visit their relatives elsewhere");
                }
            }


