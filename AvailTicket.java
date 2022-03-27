package Mine;

public class AvailTicket {

	
	    int erangal ;
	    int livik ;
	    int miramar;
	    int sanhok ;
	    AvailTicket(){
	        this.erangal = 30;
	        this.miramar = 40;
	        this.livik = 20;
	        this.sanhok = 35;
	    }
	    public static AvailTicket obj ;
	    public static AvailTicket getObj(){
	        if(obj == null){
	            obj = new AvailTicket();
	        }
	        return obj;
	    }

	    public int getErangal() {
	        return erangal;
	    }

	    public int getLivik() {
	        return livik;
	    }
	    public int getMiramar() {
	        return miramar;
	    }
	    public int getSanhok() {
	        return sanhok;
	    }
	    public void updateErangal(int erangal) {
	        this.erangal = this.erangal + erangal;
	    }

	    public void updateMiramar(int miramar) {
	        this.miramar = this.miramar + miramar;
	    }

	    public void updateLivik(int livik) {
	        this.livik = this.livik + livik;
	    }

	    public void updateSanhok(int sanhok) {
	        this.sanhok = this.sanhok + sanhok;
	    }

	}
