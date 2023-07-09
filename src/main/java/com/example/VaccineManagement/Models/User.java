package com.example.VaccineManagement.Models;

import com.example.VaccineManagement.Enums.Gender;
import jakarta.persistence.*;

@Entity
@Table(name = "usersA")
public class User {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int userId;

      @Column(name = "user_name")
      private String name;

      private int age;

      @Column(unique = true)
      private String emailId;

      private Gender gender;
      private String mobileNo;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


    @Enumerated(value = EnumType.STRING)
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
