package com.example.fragment_iii;

import java.io.Serializable;

public class Model implements Serializable {
    private String Name;
    private String Grade;
    private String Percentage;
    private int age;

    public Model(String name, String grade, String percentage, int age) {
        Name = name;
        Grade = grade;
        Percentage = percentage;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public String getGrade() {
        return Grade;
    }

    public String getPercentage() {
        return Percentage;
    }

    public int getAge() {
        return age;
    }
}
