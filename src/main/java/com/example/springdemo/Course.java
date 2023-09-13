package com.example.springdemo;

public class Course {

    public long id ;
    public String course;
    public String instute;
    public Course(long id, String course , String instute) {
        this.id = id;
        this.course = course;
        this.instute = instute;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getInstute() {
        return instute;
    }

    public void setInstute(String instute) {
        this.instute = instute;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", course='" + course + '\'' +
                ", instute='" + instute + '\'' +
                '}';
    }
}
