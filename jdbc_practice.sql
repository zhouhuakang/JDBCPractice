//1.db create 
create database jdbc_practice;
//2.table create
DROP TABLE IF EXISTS user_info;
CREATE TABLE user_info(
  id int primary key NOT NULL AUTO_INCREMENT,
  user_name varchar(30) NOT NULL,
  sex int(11) DEFAULT NULL,
  age int(11) DEFAULT NULL,
  birthday date DEFAULT NULL,
  email varchar(30) DEFAULT NULL,
  mobile varchar(11) DEFAULT NULL,
  create_user varchar(30) DEFAULT NULL,
  create_date date DEFAULT NULL,
  update_user varchar(30) DEFAULT NULL,
  update_date date DEFAULT NULL,
  isdel int(11) DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;

alter database user_info default character set 'uft8';
SET chararter_set_client = 'utf8';
SET chararter_set_connection = 'utf8';
SET chararter_set_results = 'utf8';

//3.插入一条记录
INSERT INTO user_info VALUES ('1', '小溪', '1', '22', '2000-12-12', 'xiaoxi@163.com', '13911111111', 'ADMIN', '2015-01-08', 'ADMIN', '2015-01-08', '0');

