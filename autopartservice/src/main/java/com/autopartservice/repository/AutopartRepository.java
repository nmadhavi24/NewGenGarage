package com.autopartservice.repository;


import com.autopartservice.model.Autopart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutopartRepository extends JpaRepository<Autopart, Long> {

}