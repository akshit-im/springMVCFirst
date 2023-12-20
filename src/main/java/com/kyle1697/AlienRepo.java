package com.kyle1697;

import com.kyle1697.Model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Queue;

public interface AlienRepo extends JpaRepository<Alien, Integer> {
   // List<Alien> findByAname(String aname);  // Query DSL Domain specific language

    @Query("from alien where aname = :name")  // @Param  will be used for placeHolder for aname -> name
    List<Alien> find(@Param("name") String aname);
}
