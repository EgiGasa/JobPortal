package com.lhind.internship.JobPortal.repository;

import com.lhind.internship.JobPortal.model.entity.User;
import com.lhind.internship.JobPortal.model.enums.UserRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    Page<User> findByRole(UserRole role, Pageable pageable);

}
