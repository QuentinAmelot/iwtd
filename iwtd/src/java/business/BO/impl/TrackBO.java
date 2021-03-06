/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.BO.impl;

import business.BO.ITrackBO;
import business.DAO.ITrackDAO;
import business.model.Track;

/**
 *
 * @author Quentin
 */
public class TrackBO implements ITrackBO {

    ITrackDAO itrackdao;
    public void setITrackDAO(ITrackDAO itrackdao) {
        this.itrackdao = itrackdao;
    }

    @Override
    public void save(Track track) {
        itrackdao.save(track);
    }

    @Override
    public void update(Track track) {
        itrackdao.update(track);
    }

    @Override
    public void delete(Track track) {
        itrackdao.delete(track);
    }

    @Override
    public Track findByTrackCode(String trackID) {
        return itrackdao.findByTrackCode(trackID);
    }

}
