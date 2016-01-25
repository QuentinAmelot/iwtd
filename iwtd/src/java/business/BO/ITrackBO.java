package business.BO;

import business.model.Track;

public interface ITrackBO {
	
	void save(Track track);
	
	void update(Track track);
	
	void delete(Track track);
	
	Track findByTrackCode(String trackID);

}
