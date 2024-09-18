package com.eergun.service;

import com.eergun.entity.Component;
import com.eergun.repository.ComponentRepository;

import java.util.List;

public class ComponentService {
	ComponentRepository componentRepository = new ComponentRepository();
	
	public List<Component> componentsByPcId(Long id){
		return componentRepository.findByFieldNameAndValue("pcId", id);
	}
}