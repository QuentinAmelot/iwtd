package business.DAO;

import business.model.Trackday;

public interface ITrackdayDAO {
	
	void save(Trackday trackday);
	
	void update(Trackday trackday);
	
	void delete(Trackday trackday);
	
	Trackday findByTrackCode(String td_id);

}
