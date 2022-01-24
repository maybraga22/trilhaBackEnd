package com.trilha.back.financys.testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.trilha.back.financys.controller.EntryController;
import com.trilha.back.financys.entities.Entry;
import com.trilha.back.financys.exceptions.EntryNotFoundException;
import com.trilha.back.financys.exceptions.ObjectNotFoundException;
import com.trilha.back.financys.repositories.EntryRepository;
import com.trilha.back.financys.service.EntryService;

@ExtendWith(MockitoExtension.class)
public class TrilhaBackTestes {
	
	private MockMvc mockMvc;
	
	@Mock
	private EntryService entryService;
	
	@InjectMocks
	private EntryController entryController;
	
	@Mock
	private EntryRepository entryRepository;
	
    @BeforeEach
    public void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(entryController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setViewResolvers((s, locale) -> new MappingJackson2JsonView())
                .build();
    }
    
    @Test
    public void verificaValoresFiltradosStatusOK() throws Exception{
        Entry lancamentos = new Entry();
        lancamentos.setDate(lancamentos.getDate());
        lancamentos.setAmount(lancamentos.getAmount());
        lancamentos.setPaid(lancamentos.isPaid());

        when(entryService.getEntryDependency(lancamentos.getDate(),
                lancamentos.getAmount(), lancamentos.isPaid())).thenReturn(Collections.singletonList(lancamentos));

        mockMvc.perform(MockMvcRequestBuilders.get("/lancamentos")
                		.contentType(MediaType.APPLICATION_JSON))
        				.andExpect(status().isOk());
    }
	

	@Test
	public void TestEntryService() throws EntryNotFoundException, ObjectNotFoundException{
		List<Entry> entries = new ArrayList<Entry>();
		Entry entry = new Entry();
		entry.setDate("01/01/2021");
		entry.setAmount("600.00");
		entry.setPaid(true);
		entries.add(entry);
		
		when (entryRepository.findAll()).thenReturn(entries);
		
		Assertions.assertFalse(entryService.findAll().isEmpty());
		Assertions.assertEquals(1, entryService.getEntryDependency("01/01/2021", "600.00", true).size());
	
	} 
	

}
