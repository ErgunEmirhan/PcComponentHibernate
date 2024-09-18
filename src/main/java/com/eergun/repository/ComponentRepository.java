package com.eergun.repository;

import com.eergun.entity.Component;

public class ComponentRepository extends RepositoryManager<Component, Long> {
	
	public ComponentRepository() {
		super(Component.class);
	}
}