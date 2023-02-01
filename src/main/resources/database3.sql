// 数据库自己创建

//建表语句
CREATE TABLE user_user (
  id NUMBER(18)   not null
        constraint user_user_PK
            primary key,
  name VARCHAR2(255) ,
  qq VARCHAR2(255)
);

//插入数据语句
insert  into user_user(id,name,qq) values (1,'lululu','1231231');