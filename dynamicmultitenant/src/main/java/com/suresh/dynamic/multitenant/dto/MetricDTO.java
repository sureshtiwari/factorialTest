package com.suresh.dynamic.multitenant.dto;

public class MetricDTO {
    private String name;
    private Double value;

    public MetricDTO(String name, Double value)
    {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Double getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
