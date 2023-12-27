package com.suresh.dynamic.multitenant.tenant.service;

import com.suresh.dynamic.multitenant.dto.Averages;
import com.suresh.dynamic.multitenant.dto.MetricDTO;
import com.suresh.dynamic.multitenant.tenant.entity.Metric;
import com.suresh.dynamic.multitenant.tenant.repository.MetricRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Random;

@Service
public class MetricServiceImpl implements MetricService {

    @Autowired
    MetricRepository metricRepository;

    @Override
    public List<Metric> getMetrics() {
        return metricRepository.findAll();
    }

    @Override
    public Metric save(MetricDTO metricDTO) {
        Metric metric = new Metric();
        try {

            metric.setName(metricDTO.getName());
            metric.setValue(metricDTO.getValue());
            metric.setTimeStamp(Timestamp.from(Instant.now()));
            metricRepository.save(metric);
        }
        catch (Exception e)
        {
           System.out.println(e.getMessage());
           throw e;
        }
        return metric;
    }

    @Override
    public Averages getAverages() {
        return new Averages(
                metricRepository.findAverageAfter(new Timestamp(System.currentTimeMillis()-60000)),
                metricRepository.findAverageAfter(new Timestamp(System.currentTimeMillis()-3600000)),
                metricRepository.findAverageAfter(new Timestamp(System.currentTimeMillis()-8640000000L))
        );
    }
}
