package services;


import java.util.HashMap;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class PlantsListFacade
 */
@Stateless
public class PlantsListFacade {
	PlantsList list;
	static HashMap<String, Integer> plants=new HashMap<>();

	public PlantsListFacade()
	{
		list=new PlantsList();
	}
	

	public void doAddPlant(String name, Integer age) {
		
		plants.put(name, age);
		
	}

	
	public void doRemove(String name) {
		// TODO Auto-generated method stub
		
	}
	


}
