package ind.lgh.consumeruser.controller;

import ind.lgh.consumeruser.service.UserFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lgh
 */
@RestController
public class MovieController {

    private static final Logger log = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/findUserById/{id}")
    public ind.lgh.pojos.User findById(@PathVariable("id") Long id) {
        return userFeignClient.findById(id);
    }
}
