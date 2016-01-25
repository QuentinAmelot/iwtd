package DAO;
// Generated Jan 25, 2016 11:48:23 AM by Hibernate Tools 4.3.1



/**
 * TdlistId generated by hbm2java
 */
public class TdlistId  implements java.io.Serializable {


     private int tdId;
     private int userId;

    public TdlistId() {
    }

    public TdlistId(int tdId, int userId) {
       this.tdId = tdId;
       this.userId = userId;
    }
   
    public int getTdId() {
        return this.tdId;
    }
    
    public void setTdId(int tdId) {
        this.tdId = tdId;
    }
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TdlistId) ) return false;
		 TdlistId castOther = ( TdlistId ) other; 
         
		 return (this.getTdId()==castOther.getTdId())
 && (this.getUserId()==castOther.getUserId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getTdId();
         result = 37 * result + this.getUserId();
         return result;
   }   


}

