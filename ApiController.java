package japonics.demo.controllers;

import japonics.demo.UserRepository;
import japonics.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Justyna on 22.06.2017.
 */

@Controller
@RequestMapping("/api")
public class ApiController {
    @Autowired
    UserRepository userRepository;

    //localhost:8080/api/user
    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAllUser() {
        Iterable<User> users = userRepository.findAll();
        return new ResponseEntity(users, HttpStatus.OK);
    }


}
