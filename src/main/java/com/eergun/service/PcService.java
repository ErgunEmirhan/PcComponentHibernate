package com.eergun.service;

import com.eergun.entity.Component;
import com.eergun.entity.Pc;
import com.eergun.entity.User;
import com.eergun.repository.PcRepository;

import java.util.List;

public class PcService {
	PcRepository pcRepository = new PcRepository();
	UserService userService = new UserService();
	ComponentService componentService = new ComponentService();
	
	// user id al, pc dön
	public void pcNamesByUserId(Long userId) {
		List<Pc> pcs = pcRepository.findByFieldNameAndValue("userId", userId);
		User user = userService.findById(userId);
		System.out.println(user.getAd());
		pcs.forEach(pc -> {
			System.out.println(pc.getAd());
		});
	}
	
	public void pcsAndComponentsByUserId(Long userId) {
		List<Pc> pcs = pcRepository.findByFieldNameAndValue("userId", userId);
		User user = userService.findById(userId);
		System.out.println(user.getAd());
		pcs.forEach(pc -> {
			System.out.println(pc.getAd());
			List<Component> components = componentService.componentsByPcId(pc.getId());
			components.forEach(component -> {
				System.out.println(component.getAd());
			});
		});
		
	}
	
	public void printAll(){
		List<User> users = userService.userRepository.findAll();
		users.forEach(user ->
				pcsAndComponentsByUserId(user.getId()));
	}
	
}