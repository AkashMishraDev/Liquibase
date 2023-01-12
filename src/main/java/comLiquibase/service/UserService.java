package comLiquibase.service;

import comLiquibase.entity.Hotel;
import comLiquibase.entity.User;
import comLiquibase.repo.HotelRepo;
import comLiquibase.repo.UserRepo;
import comLiquibase.response.HotelResponse;
import comLiquibase.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    HotelRepo hotelRepo;

    public List<UserResponse> userResponse(){

        List<UserResponse> response = userRepo.findAll().stream().map(n -> convetToEntity(n)).collect(Collectors.toList());

        return response;
    }
    private UserResponse convetToEntity(User user){
        UserResponse usr = new UserResponse();
        usr.setName(user.getName());
        usr.setNumber(user.getNumber());
        usr.setId(user.getId());
        usr.setProfileImage(user.getProfileImage());
        return usr;
    }

    public List<HotelResponse> hotelResponse(){

        List<HotelResponse> response = hotelRepo.findAll().stream().map(t -> convetToModal(t)).collect(Collectors.toList());
        return response;
    }
    private HotelResponse convetToModal(Hotel user){
        HotelResponse usr = new HotelResponse();
        usr.setName(user.getName());
        usr.setNumber(user.getNumber());
        usr.setId(user.getId());
        usr.setProfileImage(user.getProfileImage());
        return usr;
    }
}
