package com.example.agifyapi.model;

public class AgifyResponse {
    private String name;
    private int age;
    private int count;

    public AgifyResponse() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getCount() { return count; }
    public void setCount(int count) { this.count = count; }
}
