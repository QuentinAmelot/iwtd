/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.BO.impl;

import business.BO.ITrackdayBO;
import business.DAO.ITrackdayDAO;
import business.model.Trackday;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Quentin
 */
public class TrackdayBO implements ITrackdayBO {
    ITrackdayDAO itrackdaydao;
        public void setITrackdayDAO(ITrackdayDAO itrackdaydao) {
        this.itrackdaydao = itrackdaydao;
    }
    @Override
    public void save(Trackday trackday) {
        itrackdaydao.save(trackday);
    }

    @Override
    public void update(Trackday trackday) {
        itrackdaydao.update(trackday);
    }

    @Override
    public void delete(Trackday trackday) {
        itrackdaydao.delete(trackday);
    }

    @Override
    public Trackday findByTrackCode(String trackday_id) {
        return itrackdaydao.findByTrackCode(trackday_id);
    }
    
    @Override
    public List<Trackday> findByRequest(Date from, Date to) {
        return itrackdaydao.findByRequest(from, to);
    }
    
}
