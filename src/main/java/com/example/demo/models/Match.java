package com.example.demo.models;

public class Match {
    Long studentId;
    Long id;
    String gender;

    public Match(Long studentId, Long id, String gender) {
        this.studentId = studentId;
        this.id = id;
        this.gender = gender;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Match{" +
                "studentId=" + studentId +
                ", id=" + id +
                ", gender='" + gender + '\'' +
                '}';
    }
}

