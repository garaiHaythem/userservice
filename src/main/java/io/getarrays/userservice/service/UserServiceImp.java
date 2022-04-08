package io.getarrays.userservice.service;

import io.getarrays.userservice.domain.Role;
import io.getarrays.userservice.domain.User;
import io.getarrays.userservice.repo.RoleRepo;
import io.getarrays.userservice.repo.UserRepo;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Transactional
@RequiredArgsConstructor
@Service
public class UserServiceImp implements UserService {

  private final UserRepo userRepo;
  public final RoleRepo roleRepo;

  @Override
  public User saveUser(User user) {
    log.info("|---Going to save user {}", user.getUsername());
    return userRepo.save(user);
  }

  @Override
  public Role saveRole(Role role) {
    log.info("|---Going to save role {}", role.getName());
    return roleRepo.save(role);
  }

  @Override
  public void addRoleToUser(String username, String roleName) {
    log.info("|---Going to add role {} to user {}", roleName, username);
    User user = userRepo.findUserByName(username);
    Role role = roleRepo.findRoleByName(roleName);
    user.getRoles().add(role);

  }

  @Override
  public User getUser(String username) {
    log.info("|---Going to find user by username {}", username);
    return userRepo.findUserByName(username);
  }

  @Override
  public List<User> getUsers() {
    log.info("|---Going to get all users");
    return userRepo.findAll();
  }
}
