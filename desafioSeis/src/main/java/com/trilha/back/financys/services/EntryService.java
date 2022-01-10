package com.trilha.back.financys.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trilha.back.financys.entities.Entry;
import com.trilha.back.financys.dto.EntryDTO;
import com.trilha.back.financys.entities.Category;
import com.trilha.back.financys.repositories.CategoryRepository;
import com.trilha.back.financys.repositories.EntryRepository;

@Service
public class EntryService {

	@Autowired
	private EntryRepository entryRepository;

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	public List<Entry> findAll() {
		return entryRepository.findAll();
	}
	
	public EntryDTO mapDto(Entry entry) {
        EntryDTO entryDTO = modelMapper.map(entry, EntryDTO.class);
        return entryDTO;
    }

    public Entry mapEntity(EntryDTO entryDTO) {
        Entry entry = modelMapper.map(entryDTO, Entry.class);
        return entry;
    }
    
	public Map<Long, List<EntryDTO>> returnListDTO() {
		List<Entry> listEntry = entryRepository.findAll();
		Map<Long, List<EntryDTO>> entryByIdCategory = new HashMap<Long, List<EntryDTO>>();
		EntryDTO entryDTO = new EntryDTO();
		for (Entry entry : listEntry) {
			Long key = entry.getCategoryId();
			entryDTO = mapDto(entry);
			if (entryByIdCategory.get(key) == null) {
				entryByIdCategory.put(key, new ArrayList<EntryDTO>());
			}else {
				entryByIdCategory.get(key).add(entryDTO);
			}
		}
		return entryByIdCategory;
	}

	public boolean validateCategoryById(long id) {
		Optional<Category> category = categoryRepository.findById(id);
		return category.isPresent();
	}

	public Entry save(Entry entry) {
		return entryRepository.save(entry);
	}

	public Optional<Entry> findById(Long id) {
		return entryRepository.findById(id);
	}

	public void delete(Long id) {
		entryRepository.deleteById(id);
	}
}