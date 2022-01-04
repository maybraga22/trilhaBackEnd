package com.trilha.back.financys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trilha.back.financys.entities.Entry;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {

}
