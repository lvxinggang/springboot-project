1、SQL
    
    CREATE TABLE gostop_rbac.user (
      id bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
      phone varchar(255) DEFAULT NULL COMMENT '电话',
      username varchar(255) DEFAULT NULL COMMENT '用户名',
      PRIMARY KEY (id),
    )
    ENGINE = INNODB
    CHARACTER SET utf8
    COLLATE utf8_general_ci;

2、配置地址:application.properties

    修改MySql地址、端口、用户名密码
    修改Redis地址、端口、密码 

3、Druid配置

    com.project.mes.config.DruidConfig类中，修改登录用户名、密码