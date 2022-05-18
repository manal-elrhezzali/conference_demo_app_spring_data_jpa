package com.pluralsight.conferencedemo.models;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.pluralsight.conferencedemo.repositories.TimeSlotsJpaRepository;
import java.time.LocalTime;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TimeSlotsTest {

  @Autowired
  private TimeSlotsJpaRepository jpaRepository;

  @Test
  public void testBefore() throws Exception {
    List<TimeSlots> timeSlots = jpaRepository.findByStartTimeBefore(LocalTime.now());
    assertTrue(timeSlots.size() > 0);
  }
}
