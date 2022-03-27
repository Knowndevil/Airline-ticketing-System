package Mine;

import java.util.ArrayList;
import java.util.Scanner;

public class Jprog 
{

	
	
	    static ArrayList<User> users = new ArrayList<User>();
	    static User currentUser = null;
	    public static void main(String []args){
	        Scanner input = new Scanner(System.in);
	        int ch=0;
	        while(ch != 10){
	            System.out.println("\n \n \n  Login - 0 \n SignUp - 1 \n 2 . Show Available Tickets \n 3. Show Booked Tickets  \n 4.Book ticket \n 5.cancel ticket \n 6. Show Users \n 10.exit");
	            ch = input.nextInt();
	            input.nextLine();
	            switch(ch){
	                case 0:
	                    System.out.println("Enter the Username:");
	                    String username = input.nextLine();
	                    System.out.println("Enter the Password:");
	                    String password = input.nextLine();
	                    login(username,password);
	                    break;
	                case 1:
	                    System.out.println("Enter the Username:");
	                    User usrObj = new User();
	                    usrObj.setUsername(input.nextLine());
	                    System.out.println("Enter the Password:");
	                    usrObj.setPassword(input.nextLine());
	                    System.out.println("User Created : "+usrObj.getUsername() + " " + usrObj.getPassword());
	                    users.add(usrObj);
	                    break;
	                case 2:
	                    System.out.println("Showing Available Ticket");
	                    AvailTicket obj = AvailTicket.getObj();
	                    System.out.println("Erangel : "+ obj.getErangal());
	                    System.out.println("Miramar : "+ obj.getMiramar());
	                    System.out.println("Sanhok : "+ obj.getSanhok());
	                    System.out.println("Livik : "+ obj.getSanhok());
	                    break;
	                case 3:
	                    System.out.println("Showing Booked Tickets");
	                    if(currentUser!=null){
	                        currentUser.showBookings();
	                    }
	                    break;
	                case 4:
	                    System.out.println("Book a Ticket");
	                    System.out.println("1.Erangal \n 2.Miramar \n 3.Sanhok \n Livik");
	                    switch(input.nextInt()){
	                        case 1:
	                            System.out.println("Enter the number of Tickets");
	                            currentUser.bookErangal(input.nextInt());
	                            break;
	                        case 2:
	                            System.out.println("Enter the number of Tickets");
	                            currentUser.bookMiramar(input.nextInt());
	                            break;
	                        case 3:
	                            System.out.println("Enter the number of Tickets");
	                            currentUser.bookSanhok(input.nextInt());
	                            break;
	                        case 4:
	                            System.out.println("Enter the number of Tickets");
	                            currentUser.bookLivik(input.nextInt());
	                            break;
	                        default:
	                            System.out.println("Choice Invalid / Booking not done!");
	                    }
	                    break;
	                case 5:
	                    System.out.println("Cancel a Ticket!");
	                    if(currentUser!=null){
	                        System.out.println("1.Erangal \n 2.Miramar \n 3.Sanhok \n Livik");
	                        switch(input.nextInt()){
	                            case 1:
	                                System.out.println("Enter the number of Tickets");
	                                currentUser.cancelErangal(input.nextInt());
	                                break;
	                            case 2:
	                                System.out.println("Enter the number of Tickets");
	                                currentUser.cancelMiramar(input.nextInt());
	                                break;
	                            case 3:
	                                System.out.println("Enter the number of Tickets");
	                                currentUser.cancelSanhok(input.nextInt());
	                                break;
	                            case 4:
	                                System.out.println("Enter the number of Tickets");
	                                currentUser.cancelLivik(input.nextInt());
	                                break;
	                            default:
	                                System.out.println("Choice Invalid / Cancellation not done!");
	                        }
	                    }
	                    break;
	                case 6:
	                    for(User usr : users){
	                        System.out.println("Username : "+ usr.getUsername() );
	                        System.out.println("Password : "+ usr.getPassword());
	                    }
	                case 10:
	                    System.out.println("Exiting......");
	                    break;
	                default:
	                    System.out.println("Olunga Choice kudu di venna mavaley !!");
	            
	            }
	            

	        }
	        input.close();
	    }

	    private static void login(String username, String password) {
	        boolean flag = false;
	        for(User usr: users){
	            System.out.println("\n \n "+usr.getUsername() + usr.getPassword());
	            if(usr.getUsername().equals(username) && usr.getPassword().equals(password)){
	                System.out.println("Logged in");
	                currentUser = usr;
	                flag=true;
	            }
	        }
	        if(!flag){
	            System.out.println("Username or Password is Wrong!");
	        }
	        return;
	    }
	}


