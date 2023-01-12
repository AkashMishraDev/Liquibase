package comLiquibase.controller;

import comLiquibase.entity.User;
import comLiquibase.repo.UserRepo;
import comLiquibase.response.HotelResponse;
import comLiquibase.response.UserResponse;
import comLiquibase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getuser")
    public List<UserResponse> getUser(){

        List<UserResponse> userList =userService.userResponse();

        return userList;
    }

    @GetMapping("/gethotel")
    public List<HotelResponse> getHotel(){

        List<HotelResponse> userList =userService.hotelResponse();

        return userList;
    }
}
