package com.eergun;


import com.eergun.entity.User;
import com.eergun.repository.UserRepository;
import com.eergun.service.PcService;
import com.eergun.utility.DemoData;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		PcService pcService = new PcService();
		pcService.pcsAndComponentsByUserId(1L);
		System.out.println("***********");
		pcService.pcNamesByUserId(2L);
		System.out.println("***********");
		pcService.printAll();
		
		Map<String, Integer> map = new HashMap<>();
		
	}
}