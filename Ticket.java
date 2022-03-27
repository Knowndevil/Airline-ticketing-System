package Mine;

public class Ticket {

	
	    int erangal;
	    int livik ;
	    int miramar;
	    int sanhok ;
	    AvailTicket at = AvailTicket.getObj();
	    public Ticket(){
	        erangal = 0;
	        livik = 0;
	        miramar =0;
	        sanhok=0;
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

	    public void setErangal(int erangal) {
	        this.erangal = this.erangal+erangal;
	        at.updateErangal(-erangal);
	    }

	    public void setLivik(int livik) {
	        this.livik = this.livik+livik;
	        at.updateLivik(-livik);
	    }
	    public void setMiramar(int miramar) {
	        this.miramar = this.miramar+miramar;
	        at.updateMiramar(-miramar);
	    }
	    public void setSanhok(int sanhok) {
	        this.sanhok = this.sanhok+sanhok;
	        at.updateSanhok(-sanhok);
	    }

	    public void cancelErangal(int erangal) {
	        this.erangal = this.erangal-erangal;
	        at.updateErangal(erangal);
	    }

	    public void cancelLivik(int livik) {
	        this.livik = this.livik-livik;
	        at.updateLivik(livik);
	    }
	    public void cancelMiramar(int miramar) {
	        this.miramar = this.miramar-miramar;
	        at.updateMiramar(miramar);
	    }
	    public void cancelSanhok(int sanhok) {
	        this.sanhok = this.sanhok-sanhok;
	        at.updateSanhok(sanhok);
	    }

	}
