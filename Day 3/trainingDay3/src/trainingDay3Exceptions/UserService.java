package trainingDay3Exceptions;


public class UserService {
	
		User [] u1= {
			new User("Clark Kent",1,28),
			new User("Bruce Wayne",2,30),
			new User("Peter Parker",3,17),
			new User("Doctor Strange",4,42),
			new User("Shaktiman",5,40)
			};
	
 
public void searchUser(int id) throws UserNotFoundException {
		
			int count=0;
		for(int i=0;i<u1.length;i++) {
			if(u1[i].getId()==id) {
				System.out.println(u1[i]);
				count++;
				break;
			}
		}
			if(count==0)
				throw new UserNotFoundException("User not found for this particular passed ID ");
		}
	}
