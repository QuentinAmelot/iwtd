package DAO;
// Generated Jan 25, 2016 11:48:23 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Track generated by hbm2java
 */
public class Track  implements java.io.Serializable {


     private Integer trackId;
     private Tduser tduser;
     private String name;
     private long length;
     private String difficulty;
     private String category;
     private String location;
     private int lat;
     private int lon;
     private String url;
     private Set trackdays = new HashSet(0);

    public Track() {
    }

	
    public Track(Tduser tduser, String name, long length, String difficulty, String category, String location, int lat, int lon, String url) {
        this.tduser = tduser;
        this.name = name;
        this.length = length;
        this.difficulty = difficulty;
        this.category = category;
        this.location = location;
        this.lat = lat;
        this.lon = lon;
        this.url = url;
    }
    public Track(Tduser tduser, String name, long length, String difficulty, String category, String location, int lat, int lon, String url, Set trackdays) {
       this.tduser = tduser;
       this.name = name;
       this.length = length;
       this.difficulty = difficulty;
       this.category = category;
       this.location = location;
       this.lat = lat;
       this.lon = lon;
       this.url = url;
       this.trackdays = trackdays;
    }
   
    public Integer getTrackId() {
        return this.trackId;
    }
    
    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }
    public Tduser getTduser() {
        return this.tduser;
    }
    
    public void setTduser(Tduser tduser) {
        this.tduser = tduser;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public long getLength() {
        return this.length;
    }
    
    public void setLength(long length) {
        this.length = length;
    }
    public String getDifficulty() {
        return this.difficulty;
    }
    
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    public int getLat() {
        return this.lat;
    }
    
    public void setLat(int lat) {
        this.lat = lat;
    }
    public int getLon() {
        return this.lon;
    }
    
    public void setLon(int lon) {
        this.lon = lon;
    }
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    public Set getTrackdays() {
        return this.trackdays;
    }
    
    public void setTrackdays(Set trackdays) {
        this.trackdays = trackdays;
    }




}

