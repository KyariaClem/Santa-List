package com.faithone.santa_list.models;

import java.util.Objects;

public class elf {
    // set up field for eld model

    private static int nextId = 1;
    private final int id;
    private String name;
    private String color;
    private int age;
    private String personality;

    public elf(int id, String name, String color, int age, String personality) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.personality = personality;
        nextId++;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    @Override
    public String toString() {
        return "elf{" +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", personality='" + personality + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof elf elf)) return false;
        return getId() == elf.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
