package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Session;
import com.pluralsight.conferencedemo.models.TimeSlots;
import java.time.LocalTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeSlotsJpaRepository extends JpaRepository<TimeSlots, Long> {
  List<TimeSlots> findByStartTimeBefore(LocalTime startTime);
}
