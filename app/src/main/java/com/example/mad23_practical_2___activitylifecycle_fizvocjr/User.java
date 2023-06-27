package com.example.mad23_practical_2___activitylifecycle_fizvocjr;

public class User {
    String Name;
    String Description;
    int Id;
    boolean Followed;

    public User(){

    }

    public User(String name, String description, int ID, boolean followed){
        Name = name;
        Description = description;
        Id = ID;
        Followed = followed;
    }
}
