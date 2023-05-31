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

import org.apache.ibatis.annotations.Mapper;
import com.github.thinwind.northwest.model.User;
import org.springframework.stereotype.Repository;

/**
 *
 * TODO 说明
 *
 * @author Shang Yehua <niceshang@outlook.com>
 * @since 2023-06-01  00:40
 *
 */
@Repository
@Mapper
public interface UserDao {
        
        /**
        * TODO 说明
        * 
        * @param id
        * @return
        */
        User getUserById(int id);
        
        /**
        * TODO 说明
        * 
        * @param user
        * @return
        */
        int insertUser(User user);
        
        /**
        * TODO 说明
        * 
        * @param user
        * @return
        */
        int updateUser(User user);
        
        /**
        * TODO 说明
        * 
        * @param id
        * @return
        */
        int deleteUser(int id);
}
