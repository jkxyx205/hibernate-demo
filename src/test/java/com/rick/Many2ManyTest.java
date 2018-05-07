package com.rick;

import com.rick.many2many.dao.RoleRepository;
import com.rick.many2many.dao.UserRepository;
import com.rick.many2many.dao.UserRoleRepository;
import com.rick.many2many.entity.Role;
import com.rick.many2many.entity.User;
import com.rick.many2many.entity.UserRole;
import com.rick.many2many.entity.UserRoleId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by rick on 5/6/18.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class Many2ManyTest {
   @Resource
    private RoleRepository roleRepository;

   @Resource
   private UserRepository userRepository;

   @Autowired
   private UserRoleRepository userRoleRepository;

   @Test
    public void addRoleTest() {
       Role role = new Role();
       role.setName("系统管理员x");

       User user = new User();
       user.setName("Rick.Xux");

//       role.getUserSet().add(user);
       roleRepository.save(role);


   }

    @Test
    public void addUserRoleTest() {

        Role role = new Role();
        role.setName("厨师");


        User user = new User();
        user.setName("Lucy");

        UserRole userRole = new UserRole();

        UserRoleId userRoleId = new UserRoleId(user.getId(), role.getId());
        userRole.setUserRoleId(userRoleId);

        userRole.setUser(user);
        userRole.setRole(role);
        user.getUserRoleSet().add(userRole);

        userRepository.save(user);
    }


    @Test
    public void addUserRoleTest2() {
        Role role = new Role();
        role.setName("工程师");


    }

}
