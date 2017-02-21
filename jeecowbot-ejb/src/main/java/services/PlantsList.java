package services;

import java.util.HashMap;

import javax.ejb.Singleton;

/**
 * Session Bean implementation class PlantsList
 */
@Singleton
public class PlantsList implements PlantsListRemote, PlantsListLocal {

	static HashMap<String, Integer> plants=new HashMap<>();

	@Override
	public void addPlant(String name, Integer age) {
		
		plants.put(name, age);
		
	}

	@Override
	public void remove(String name) {
		plants.remove(name);
		
	}

}
