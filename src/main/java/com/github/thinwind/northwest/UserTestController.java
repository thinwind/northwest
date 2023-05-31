/*
 * Copyright 2023 Shang Yehua <niceshang@outlook.com>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.github.thinwind.northwest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.github.thinwind.northwest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * TODO 说明
 *
 * @author Shang Yehua <niceshang@outlook.com>
 * @since 2023-06-01  01:10
 *
 */
@RestController
@RequestMapping("/user/test")
public class UserTestController {

    @Autowired
    private UserDao userDao;

    @PostMapping("/batch")
    public int testInsertUserBatch(int rows) {
        List<User> users = randomUsers(rows);
        return userDao.insertUserBatch(users);
    }

    private List<User> randomUsers(int rows) {
        List<User> users = new ArrayList<>(rows);
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            User user = new User();
            int tag = random.nextInt(rows);
            if ( tag > rows - 5) {
                user.setName("张三");
                user.setAge(28);
                user.setSex("RND"+tag);
                user.setInformation("Description"+i);
                System.out.println(user);
            }else{
                user.setAge(i);
                user.setName("Tester" + i);
                user.setSex("Reg"+tag);
                user.setInformation("Info"+i);
            }
            users.add(user);
        }

        return users;
    }

}
