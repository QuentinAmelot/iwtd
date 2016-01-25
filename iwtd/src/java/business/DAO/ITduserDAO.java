package business.DAO;

import business.model.Tduser;

public interface ITduserDAO {
	
	void save(Tduser tduser);
	
	void update(Tduser tduser);
	
	void delete(Tduser tduser);
	
	Tduser findByTrackCode(String user_id);

}
