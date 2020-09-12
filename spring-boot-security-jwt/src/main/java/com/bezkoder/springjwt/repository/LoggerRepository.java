package com.bezkoder.springjwt.repository;


import java.util.logging.Logger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface LoggerRepository extends JpaRepository<Logger, Long> {
 
}
