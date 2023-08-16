import com.examly.springapp.entities.User;

 

 

public interface UserService {

 

    public boolean registerUser(User user);

    public String loginUser(User user);

 

}