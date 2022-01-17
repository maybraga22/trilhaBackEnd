package com.trilha.back.infrastructure;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trilha.back.domain.Entry;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long>{
	List<Entry> findByPaid(Boolean paid);
}
