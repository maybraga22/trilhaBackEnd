package com.trilha.back.adapters.outbound.repositories;

import java.util.List;

import com.trilha.back.adapters.outbound.entities.EntryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryRepository extends JpaRepository<EntryEntity, Long>{
	List<EntryEntity> findByPaid(Boolean paid);
}
