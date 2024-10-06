package com.eventostec.api.repositories;

import com.eventostec.api.domain.events.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
    @Query("SELECT e FROM Event e WHERE e.date >= :currentDate")
    Page<Event> findUpcomingEvents(
            @Param("currentDate") Date currentDate,
            Pageable pageable
    );
}
