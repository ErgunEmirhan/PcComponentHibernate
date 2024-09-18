package com.eergun.utility;

import com.eergun.entity.Component;
import com.eergun.entity.Pc;
import com.eergun.entity.User;
import com.eergun.repository.ComponentRepository;
import com.eergun.repository.PcRepository;
import com.eergun.repository.UserRepository;

public class DemoData {
	UserRepository userRepository;
	PcRepository pcRepository;
	ComponentRepository componentRepository;
	
	public DemoData() {
		userRepository = new UserRepository();
		pcRepository = new PcRepository();
		componentRepository = new ComponentRepository();
	}
	
	public void createdemoData(){
		createUsers();
		createPcs();
		createComponents();
	}
	
	private void createComponents() { // ? tane component
		componentRepository.save(Component.builder().ad("Intel Core i9").tur(ComponentType.CPU).pcId(1L).build());
		componentRepository.save(Component.builder().ad("MSI RTX 4080 TI").tur(ComponentType.GPU).pcId(1L).build());
		componentRepository.save(Component.builder().ad("MSI H110").tur(ComponentType.MAINBOARD).pcId(2L).build());
		componentRepository.save(Component.builder().ad("WD").tur(ComponentType.HARDDISK).pcId(2L).build());
		componentRepository.save(Component.builder().ad("LOGITECH G PRO X TKL").tur(ComponentType.KEYBOARD).pcId(3L).build());
		componentRepository.save(Component.builder().ad("LOGITECH G PRO SUPERLIGHT").tur(ComponentType.MOUSE).pcId(3L).build());
		componentRepository.save(Component.builder().ad("HYPERX QUADCAST").tur(ComponentType.MICROPHONE).pcId(3L).build());
	}
	
	private void createPcs() { // 3 tane pc
		pcRepository.save(Pc.builder().userId(1L).ad("Monster").build());
		pcRepository.save(Pc.builder().userId(1L).ad("Msi").build());
		pcRepository.save(Pc.builder().userId(2L).ad("Mac").build());
	}
	
	private void createUsers() { // 3 tane user, birinin 2 pc'si, birinin 1 pc'si, diğerinin hiç pc'si olsun
		userRepository.save(User.builder().ad("Yağız").sifre("asdqwe123").soyad("Çelik").build());
		userRepository.save(User.builder().ad("Aleyna").sifre("asdqwe123").soyad("Yamanoğlu").build());
		userRepository.save(User.builder().ad("Ali").sifre("asdqwe123").soyad("Veli").build());
	}
}