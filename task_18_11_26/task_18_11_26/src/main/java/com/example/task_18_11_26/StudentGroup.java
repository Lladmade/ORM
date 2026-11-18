package com.example.task_18_11_26;


import jakarta.persistence.*;
import org.hibernate.annotations.RowId;

@Entity
@Table (name = "student_group")
public class StudentGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;


    public StudentGroup(){

    }

    public StudentGroup(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
