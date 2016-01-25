package business.BO;

import business.model.Tduser;

public interface ITduserBO {
	
	void save(Tduser user);
	
	void update(Tduser user);
	
	void delete(Tduser user);
	
	Tduser findByTrackCode(String User_id);

}
