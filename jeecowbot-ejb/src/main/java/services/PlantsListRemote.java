package services;

import javax.ejb.Remote;

@Remote
public interface PlantsListRemote {

	void addPlant(String name,Integer age );
	
}
