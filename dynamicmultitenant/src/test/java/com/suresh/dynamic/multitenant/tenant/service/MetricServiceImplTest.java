package com.suresh.dynamic.multitenant.tenant.service;

import com.suresh.dynamic.multitenant.dto.MetricDTO;
import com.suresh.dynamic.multitenant.tenant.entity.Metric;
import com.suresh.dynamic.multitenant.tenant.repository.MetricRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.sql.Timestamp;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class MetricServiceImplTest {

    @Autowired
    private MetricServiceImpl metricService;

    @MockBean
    private MetricRepository metricRepository;

    @Test
    public void test_save()
    {
        //setup
        MetricDTO metricDTO= new MetricDTO("sample", 4.5);
        Metric metric = new Metric(metricDTO.getName(), metricDTO.getValue(), Timestamp.from(Instant.now()));
        Mockito.when(metricRepository.save(metric)).thenReturn(metric);
        //act
        Metric response = metricService.save(metricDTO);
        //assert
        assertEquals(response.getName(), metricDTO.getName());
        assertEquals(response.getValue(), metricDTO.getValue());
        assertNotNull(response.getTimeStamp());
    }
}
