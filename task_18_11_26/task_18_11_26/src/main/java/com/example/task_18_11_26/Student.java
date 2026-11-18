package com.example.task_18_11_26;

import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

@Entity
@Table (name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Column(name = "e-post")
    private String ePost;
    private Integer number;

    public Student(){

    }
    public Student(String ePost, String name, Integer number){
        this.ePost = ePost;
        this.name = name;
        this.number = number;
    }
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Student group;

    public Student getGroup() {
        return group;
    }

    public void setGroup(Student group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getePost() {
        return ePost;
    }

    public Integer getNumber() {
        return number;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setePost(String ePost) {
        this.ePost = ePost;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
