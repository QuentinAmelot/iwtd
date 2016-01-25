package business.DAO;

import business.model.Track;

public interface ITrackDAO {
	
	void save(Track track);
	
	void update(Track track);
	
	void delete(Track track);
	
	Track findByTrackCode(String trackID);

}
