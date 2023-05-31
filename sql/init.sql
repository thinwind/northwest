# mysql 创建Schema
CREATE SCHEMA `northwest` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

# mysql 创建表
CREATE TABLE `northwest`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `age` INT NULL,
   `sex` VARCHAR(45) NULL,
   `information` text NULL,
   `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_age` (`name`, `age`)
  );
  
# mysql 插入数据
INSERT INTO `northwest`.`user` (`name`, `age`, `sex`, `information`) VALUES ('张三', '28', '男', '我是张三');
INSERT INTO `northwest`.`user` (`name`, `age`, `sex`, `information`) VALUES ('李四', '30', '男', '我是李四');

# mysql 重复更新，否则新增数据
INSERT INTO `northwest`.`user` (`name`, `age`, `sex`, `information`) VALUES ('张三', '28', '女', '我是女张三')
ON DUPLICATE KEY UPDATE `sex` = '女', `information` = '我是女张三';