package DAO;
// Generated Jan 25, 2016 11:48:23 AM by Hibernate Tools 4.3.1



/**
 * Tdlist generated by hbm2java
 */
public class Tdlist  implements java.io.Serializable {


     private TdlistId id;
     private Tduser tduser;
     private Trackday trackday;
     private String car;
     private int hp;

    public Tdlist() {
    }

    public Tdlist(TdlistId id, Tduser tduser, Trackday trackday, String car, int hp) {
       this.id = id;
       this.tduser = tduser;
       this.trackday = trackday;
       this.car = car;
       this.hp = hp;
    }
   
    public TdlistId getId() {
        return this.id;
    }
    
    public void setId(TdlistId id) {
        this.id = id;
    }
    public Tduser getTduser() {
        return this.tduser;
    }
    
    public void setTduser(Tduser tduser) {
        this.tduser = tduser;
    }
    public Trackday getTrackday() {
        return this.trackday;
    }
    
    public void setTrackday(Trackday trackday) {
        this.trackday = trackday;
    }
    public String getCar() {
        return this.car;
    }
    
    public void setCar(String car) {
        this.car = car;
    }
    public int getHp() {
        return this.hp;
    }
    
    public void setHp(int hp) {
        this.hp = hp;
    }




}

