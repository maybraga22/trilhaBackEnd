package com.trilha.back.financys.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trilha.back.financys.entities.Entry;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long>{
	List<Entry> findByPaid(Boolean paid);
}
