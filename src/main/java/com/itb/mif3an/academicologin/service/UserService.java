package com.itb.mif3an.academicologin.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.itb.mif3an.academicologin.model.Role;
import com.itb.mif3an.academicologin.model.User;
import com.itb.mif3an.academicologin.web.dto.UserDto;



public interface UserService extends UserDetailsService{
	
	User save(UserDto userDto);
	User findByEmail(String email);
	User update (UserDto userDto);
	void addRoleToUser(String username, String roleName);
	Role saveRole(Role role);
	User getAuthenticatedUser();
	List<User> findAllUserByExceptPrincipalRole(String principalRole);
	User saveUser (User user);
	List<Role> findAllRoles();
	User findUserById(Long id);
}