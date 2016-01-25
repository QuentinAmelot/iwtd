package business.BO;

import business.model.Trackday;

public interface ITrackdayBO {
	
	void save(Trackday trackday);
	
	void update(Trackday trackday);
	
	void delete(Trackday trackday);
	
	Trackday findByTrackCode(String trackday_id);

}
