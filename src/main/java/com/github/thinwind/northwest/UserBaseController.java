/* 
 * Copyright 2023 Shang Yehua <niceshang@outlook.com>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.thinwind.northwest;

import com.github.thinwind.northwest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * TODO 说明
 *
 * @author Shang Yehua <niceshang@outlook.com>
 * @since 2023-06-01  01:06
 *
 */
@RestController
@RequestMapping("/user/base")
public class UserBaseController {
    
    @Autowired
    private UserDao userDao;
    
    /**
     * TODO 说明
     * 
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") int id) {
        return userDao.getUserById(id);
    }
    
    /**
     * TODO 说明
     * 
     * @param user
     * @return
     */
    @PostMapping("/")
    public int insertUser(@RequestBody User user) {
        return userDao.insertUser(user);
    }
    
    /**
     * TODO 说明
     * 
     * @param user
     * @return
     */
    @PutMapping("/")
    public int updateUser(@RequestBody User user) {
        return userDao.updateUser(user);
    }
    
    /**
     * TODO 说明
     * 
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public int deleteUser(@PathVariable("id") int id) {
        return userDao.deleteUser(id);
    }
}
