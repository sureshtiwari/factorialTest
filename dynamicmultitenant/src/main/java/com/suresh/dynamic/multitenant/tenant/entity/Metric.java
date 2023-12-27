package com.suresh.dynamic.multitenant.tenant.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
@Table(name = "tbl_metric")
public class Metric implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "value",nullable = false)
    private Double value;
    @Column(name = "timestamp",nullable = false)
    @CreationTimestamp
    private Timestamp timestamp;

    public Metric() {
    }

    public Metric(@Size(max = 50) String name, Double value, Timestamp timestamp) {
        this.name = name;
        this.value = value;
        this.timestamp = timestamp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Metric setName(String name) {
        this.name = name;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Timestamp getTimeStamp() {
        return timestamp;
    }

    public void setTimeStamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
