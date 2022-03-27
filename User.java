package Mine;

public class User {

	
	    private String username;
	    private String password;
	    Ticket ticket;
	    public User(){
	        ticket = new Ticket();
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }
	    public String getPassword() {
	        return password;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    public void bookErangal(int nextInt) {
	        ticket.setErangal(nextInt);
	    }
	    public void bookMiramar(int nextInt) {
	        ticket.setMiramar(nextInt);
	    }
	    public void bookSanhok(int nextInt) {
	        ticket.setSanhok(nextInt);
	    }
	    public void bookLivik(int nextInt) {
	        ticket.setLivik(nextInt);
	    }
	    public void showBookings(){
	        System.out.println("Erangal : "+ ticket.getErangal());
	        System.out.println("Miramar : "+ ticket.getMiramar());
	        System.out.println("Sanhok : "+ ticket.getSanhok());
	        System.out.println("Livik : "+ ticket.getLivik());
	    }

	    public void cancelErangal(int i) {
	        ticket.cancelErangal(i);
	    }

	    public void cancelMiramar(int i) {
	        ticket.cancelMiramar(i);
	    }

	    public void cancelSanhok(int i) {
	        ticket.cancelSanhok(i);
	    }

	    public void cancelLivik(int i) {
	        ticket.cancelLivik(i);
	    }
	    
	    

	}
