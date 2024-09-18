package com.eergun.repository;

import com.eergun.entity.Pc;

public class PcRepository extends RepositoryManager<Pc, Long>{
	
	public PcRepository() {
		super(Pc.class);
	}
}