package com.pluralsight.conferencedemo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "time_slots")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TimeSlots {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "time_slot_id")
  private Long timeSlotId;
  @Column(name = "time_slot_date")
  private LocalDate timeSlotDate;
  @Column(name = "start_time")
  private LocalTime startTime;
  @Column(name = "end_time")
  private LocalTime endTime;
  @Column(name = "is_keynote_time_slot")
  private boolean isKeynoteTimeSlot;

  public TimeSlots() {
  }

  public Long getTimeSlotId() {
    return timeSlotId;
  }

  public void setTimeSlotId(Long timeSlotId) {
    this.timeSlotId = timeSlotId;
  }

  public LocalDate getTimeSlotDate() {
    return timeSlotDate;
  }

  public void setTimeSlotDate(LocalDate timeSlotDate) {
    this.timeSlotDate = timeSlotDate;
  }

  public LocalTime getStartTime() {
    return startTime;
  }

  public void setStartTime(LocalTime startTime) {
    this.startTime = startTime;
  }

  public LocalTime getEndTime() {
    return endTime;
  }

  public void setEndTime(LocalTime endTime) {
    this.endTime = endTime;
  }

  public boolean isKeynoteTimeSlot() {
    return isKeynoteTimeSlot;
  }

  public void setKeynoteTimeSlot(boolean keynoteTimeSlot) {
    isKeynoteTimeSlot = keynoteTimeSlot;
  }
}
