package com.trilha.back.adapters.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.trilha.back.adapters.inbound.dtos.EntryDTO;
import com.trilha.back.adapters.outbound.entities.EntryEntity;

@Configuration
public class ModelMapperConfig {

	@Bean
	public ModelMapper modelMaper() {
		return new ModelMapper();
	}

	public EntryDTO map(EntryEntity entryEntity, Class<EntryDTO> class1) {
		return null;
	}

	public EntryEntity map(EntryDTO entryDTO, Class<EntryEntity> class1) {
		return null;
	}

}
