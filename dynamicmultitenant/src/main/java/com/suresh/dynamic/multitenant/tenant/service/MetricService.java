package com.suresh.dynamic.multitenant.tenant.service;

import com.suresh.dynamic.multitenant.dto.Averages;
import com.suresh.dynamic.multitenant.dto.MetricDTO;
import com.suresh.dynamic.multitenant.tenant.entity.Metric;

import java.util.List;


public interface MetricService {

    List<Metric> getMetrics();
    Metric save(MetricDTO metricDTO);

    Averages getAverages();
}
