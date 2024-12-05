package com.faithone.santa_list.models;

import java.util.Objects;

public class letter {
    private static int nextId = 1;
    private final int id;

    private String firstName;
    private String lastName;

    private String goodnessLevel;

    private String christmasWishes;

    private String Signature;

    public letter(int id, String firstName, String lastName, String goodnessLevel, String christmasWishes, String signature) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.goodnessLevel = goodnessLevel;
        this.christmasWishes = christmasWishes;
        this.Signature = signature;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        letter.nextId = nextId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGoodnessLevel() {
        return goodnessLevel;
    }

    public void setGoodnessLevel(String goodnessLevel) {
        this.goodnessLevel = goodnessLevel;
    }

    public String getChristmasWishes() {
        return christmasWishes;
    }

    public void setChristmasWishes(String christmasWishes) {
        this.christmasWishes = christmasWishes;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }

    @Override
    public String toString() {
        return "letter{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", goodnessLevel='" + goodnessLevel + '\'' +
                ", christmasWishes='" + christmasWishes + '\'' +
                ", Signature='" + Signature + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof letter letter)) return false;
        return getId() == letter.getId() && Objects.equals(getFirstName(), letter.getFirstName()) && Objects.equals(getLastName(), letter.getLastName()) && Objects.equals(getGoodnessLevel(), letter.getGoodnessLevel()) && Objects.equals(getChristmasWishes(), letter.getChristmasWishes()) && Objects.equals(getSignature(), letter.getSignature());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getGoodnessLevel(), getChristmasWishes(), getSignature());
    }
}
