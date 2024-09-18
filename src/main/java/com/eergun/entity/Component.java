package com.eergun.entity;

import com.eergun.utility.ComponentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "tblcomponent")
public class Component {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ad;
	@Enumerated(EnumType.STRING)
	private ComponentType tur;
	@Column(name = "pcid")
	private Long pcId;
}