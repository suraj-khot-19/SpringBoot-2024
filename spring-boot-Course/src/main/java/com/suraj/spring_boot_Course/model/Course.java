package com.suraj.spring_boot_Course.model;


public class Course {
    //fields
    private int id;
    private String name;
    private String author;

    //constructor with fields
    public Course(int id,String name, String author) {
        this.name = name;
        this.author = author;
        this.id = id;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //to string constructor
    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
