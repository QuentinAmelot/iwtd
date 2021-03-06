/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.BO.impl;

import business.BO.ITdlistBO;
import business.DAO.ITdlistDAO;
import business.model.Tdlist;

/**
 *
 * @author Quentin
 */
public class TdlistBO implements ITdlistBO {

    ITdlistDAO itdlistdao;

    public void setITdlistDAO(ITdlistDAO itdlistdao) {
        this.itdlistdao = itdlistdao;
    }

    @Override
    public void save(Tdlist list) {
        itdlistdao.save(list);
    }

    @Override
    public void update(Tdlist list) {
        itdlistdao.update(list);
    }

    @Override
    public void delete(Tdlist list) {
        itdlistdao.delete(list);
    }

    @Override
    public Tdlist findByListId(String tdlist_id) {
        return itdlistdao.findByListId(tdlist_id);
    }

}
