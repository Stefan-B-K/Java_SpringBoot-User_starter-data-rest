package com.istef.demo6userspring_boot_starter_restapi.config;

import com.istef.demo6userspring_boot_starter_restapi.dao.UserDetailRepository;
import com.istef.demo6userspring_boot_starter_restapi.entities.UserDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDetailsInit implements CommandLineRunner {

    private final UserDetailRepository userDetailRepository;
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public UserDetailsInit(UserDetailRepository userDetailRepository) {
        this.userDetailRepository = userDetailRepository;
    }

    @Override
    public void run(String... args) {
        userDetailRepository.saveAll(List.of(
                new UserDetail("Stef", "Admin"),
                new UserDetail("Emil", "User"),
                new UserDetail("Asen", "User"),
                new UserDetail("Eva", "User"),
                new UserDetail("Maria", "Admin")
        ));

        List<UserDetail> admins = userDetailRepository.findAllByRole("Admin");
        logger.info(admins.toString());
    }
}
