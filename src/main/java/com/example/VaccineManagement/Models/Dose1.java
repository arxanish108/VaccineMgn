package com.example.VaccineManagement.Models;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "dose1")
public class Dose1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String doseid;

    @CreationTimestamp
    private Date vaccinationDate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoseid() {
        return doseid;
    }

    public void setDoseid(String doseid) {
        this.doseid = doseid;
    }

    public Date getVaccinationDate() {
        return vaccinationDate;
    }

    public void setVaccinationDate(Date vaccinationDate) {
        this.vaccinationDate = vaccinationDate;
    }


}
