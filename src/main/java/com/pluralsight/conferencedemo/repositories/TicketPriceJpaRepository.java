package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.TicketPrice;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TicketPriceJpaRepository extends JpaRepository<TicketPrice, Long> {
  //this is not a query DSL method so Spring data doesn't know what to do with it => use
  // query annotation
  //the string needs to be set to whatever JPQL we want
  @Query("select tp from TicketPrice tp where tp.basePrice  < ?1 " +
      "and tp.ticketType.includesWorkshop = true")
  List<TicketPrice> getTicketsUnderPriceWithWorkshops(BigDecimal maxPrice);

  //Named Queries
  List<TicketPrice> namedFindTicketsByPricingCategoryName(@Param("name") String name);


}
