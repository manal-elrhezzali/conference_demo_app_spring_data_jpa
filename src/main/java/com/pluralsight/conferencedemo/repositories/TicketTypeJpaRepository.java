package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.TicketType;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketTypeJpaRepository extends JpaRepository<TicketType, String> {
  //we don't have to pass a parameter because it's just going to check if the boolean column is true or not
  List<TicketType> findByIncludesWorkshopTrue();
}
