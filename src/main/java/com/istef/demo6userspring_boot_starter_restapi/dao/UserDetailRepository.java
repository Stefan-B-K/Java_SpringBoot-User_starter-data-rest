package com.istef.demo6userspring_boot_starter_restapi.dao;

import com.istef.demo6userspring_boot_starter_restapi.entities.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDetailRepository extends JpaRepository<UserDetail, Long> {
    List<UserDetail> findAllByRole(String role);
}
