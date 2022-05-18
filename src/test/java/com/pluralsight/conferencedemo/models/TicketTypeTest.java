package com.pluralsight.conferencedemo.models;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.pluralsight.conferencedemo.repositories.TicketTypeJpaRepository;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TicketTypeTest {

  @Autowired
  private TicketTypeJpaRepository jpaRepository;

  @Test
  public void testJpaTrue() throws Exception {
    List<TicketType> ticketTypes = jpaRepository.findByIncludesWorkshopTrue();
    assertTrue(ticketTypes.size() > 0);
  }
}
