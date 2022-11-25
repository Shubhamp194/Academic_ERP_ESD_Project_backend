package com.domainmodule.Bean;

import jakarta.persistence.*;

@Entity
@Table(name= "student")
public class Student {
    @Id
    @Column(name ="student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;

    @Column(name="roll_number",nullable = false,unique = true)
    private int roll_number;

    @Column(name="first_name",nullable = false)
    private String first_name;

    @Column(name="last_name")
    private String last_name;

    @Column(name="email",nullable = false,unique = true)
    private String email;

    @Column(name="photograph_path")
    private String photograph_path;

    @Column(name="cgpa",nullable = false,columnDefinition = "float default 0.0")
    private float cgpa;

    @Column(name="total_credits",nullable = false)
    private float total_credits;

    @Column(name="graduation_year")
    private int graduation_year;


    @ManyToOne
    @JoinColumn(name = "domain_id")
    private Domain s_domain_id;

    @Column(name="specialisation")
    private int specialisation;

    @Column(name="placement_id")
    private int placement_id;

    public Student() {
    }

    public Student(int roll_number, String first_name, String last_name, String email, String photograph_path, float cgpa, float total_credits, int graduation_year, Domain domain_id, int specialisation, int placement_id) {
        this.roll_number = roll_number;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.photograph_path = photograph_path;
        this.cgpa = cgpa;
        this.total_credits = total_credits;
        this.graduation_year = graduation_year;
        this.s_domain_id = domain_id;
        this.specialisation = specialisation;
        this.placement_id = placement_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhotograph_path() {
        return photograph_path;
    }

    public void setPhotograph_path(String photograph_path) {
        this.photograph_path = photograph_path;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public float getTotal_credits() {
        return total_credits;
    }

    public void setTotal_credits(float total_credits) {
        this.total_credits = total_credits;
    }

    public int getGraduation_year() {
        return graduation_year;
    }

    public void setGraduation_year(int graduation_year) {
        this.graduation_year = graduation_year;
    }

    public Domain getDomain_id() {
        return s_domain_id;
    }

    public void setDomain_id(Domain domain_id) {
        this.s_domain_id = domain_id;
    }

    public int getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(int specialisation) {
        this.specialisation = specialisation;
    }

    public int getPlacement_id() {
        return placement_id;
    }

    public void setPlacement_id(int placement_id) {
        this.placement_id = placement_id;
    }
}