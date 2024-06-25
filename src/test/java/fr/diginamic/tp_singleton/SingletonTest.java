package fr.diginamic.tp_singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.diginamic.singleton.Singleton;

public class SingletonTest {
	
	@Test
	public void testUrlSingleton() {
		
		Singleton single = Singleton.getInstance();
		
		assertEquals("jdbc:mysql://localhost:3306/mabase", single.getUrl());
	}
	
	@Test
	public void testUserSingleton() {
		
		Singleton single = Singleton.getInstance();
		
		assertEquals("root", single.getUser());
	}
	
	@Test
	public void testPasswordSingleton() {
		
		Singleton single = Singleton.getInstance();
		
		assertEquals("1234", single.getpassword());
	}
}
