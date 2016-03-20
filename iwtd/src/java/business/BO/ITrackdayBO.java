package business.BO;

import business.model.Trackday;
import java.util.Date;
import java.util.List;

public interface ITrackdayBO {
	
	void save(Trackday trackday);
	
	void update(Trackday trackday);
	
	void delete(Trackday trackday);
	
	Trackday findByTrackCode(String trackday_id);
        List<Trackday> findByRequest(Date from, Date to);

}
