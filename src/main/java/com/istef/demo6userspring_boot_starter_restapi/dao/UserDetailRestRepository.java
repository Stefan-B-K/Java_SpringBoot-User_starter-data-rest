package com.istef.demo6userspring_boot_starter_restapi.dao;

import com.istef.demo6userspring_boot_starter_restapi.entities.UserDetail;
import org.springframework.data.repository.PagingAndSortingRepository;


import java.util.List;


public interface UserDetailRestRepository extends PagingAndSortingRepository<UserDetail, Long> {
    List<UserDetail> findAllByRole(String role);
}
