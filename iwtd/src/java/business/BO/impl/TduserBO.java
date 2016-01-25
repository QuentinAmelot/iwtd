/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.BO.impl;

import business.BO.ITduserBO;
import business.DAO.ITduserDAO;
import business.model.Tduser;

/**
 *
 * @author Quentin
 */
public class TduserBO implements ITduserBO {

    ITduserDAO itduserdao;

    public void setITduserDAO(ITduserDAO itduserdao) {
        this.itduserdao = itduserdao;
    }

    @Override
    public void save(Tduser user) {
        itduserdao.save(user);
    }

    @Override
    public void update(Tduser user) {
        itduserdao.update(user);
    }

    @Override
    public void delete(Tduser user) {
        itduserdao.delete(user);
    }

    @Override
    public Tduser findByTrackCode(String User_id) {
        return itduserdao.findByTrackCode(User_id);
    }

}
