package ind.lgh.provideruser.controller;

import ind.lgh.provideruser.domain.User;
import ind.lgh.provideruser.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：.
 *
 * @author liuguanghui
 * @since 2018-08-06
 */
@RestController
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        log.info("provider-user正在执行查询！/user/" + id);
        User getOne = userRepository.getOne(id);
        return getOne;
    }

    @GetMapping("/error")
    public String error() {
        log.error("error");
        return "Error Docker!";
    }
}
