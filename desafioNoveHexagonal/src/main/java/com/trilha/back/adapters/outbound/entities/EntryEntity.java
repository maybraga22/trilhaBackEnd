package com.trilha.back.adapters.outbound.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data

@Entity
@Table(name = "entry")
public class EntryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank (message = "{name.not.empty}")
	@Length(min =3, max = 45)
	private String name;
	
	@NotBlank(message = "{description.not.empty}")
	@Length(min = 15, max = 150)
	private String description;
	
	@NotNull(message = "{description.not.empty}")
    @Enumerated(value = EnumType.STRING)
    private EnumType type;
		
	@NotBlank(message = "{amount.not.empty}")
	@Min(value = 0)
	private String amount;
	
	@NotBlank(message = "{date.not.empty}")
	private String date;
	
	@NotNull(message = "{paid.not.empty}")
	private boolean paid;
	
	private long categoryId;
	
}