package com.suresh.dynamic.multitenant.tenant.repository;

import com.suresh.dynamic.multitenant.tenant.entity.Metric;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;


@Repository
public interface MetricRepository extends JpaRepository<Metric, Integer> {

    @Query("SELECT SUM(m.value)/COUNT(m.value) FROM Metric AS m WHERE m.timestamp > ?1")
    Double findAverageAfter(Timestamp timestamp);
}
