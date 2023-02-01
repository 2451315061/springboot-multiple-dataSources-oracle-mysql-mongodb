# springboot-multiple-dataSources-oracle-mysql-mongodb

### 前言 ###

spring-boot多数据源自动切换例子项目， 利用spring aop 切面，自动切换数据源。

涉及到数据源有：两个mysql库，两个oracle库，两个mongodb库。

两个mysql库，两个oracle库处理：

CommonServiceImpl是公共处理类，

Test1ServiceImpl和Test2ServiceImpl是两个mysql 数据源分别的业务处理类，
Test3ServiceImpl和Test4ServiceImpl是两个oracle 数据源分别的业务处理类，
。定义DataSourceAspect类处理切面。

springboot-multiple-dataSources-oracle-mysql-mongodb/src/main/resources目录下的
database1.sql和database2.sql是2个mysql 数据源初始化脚本
database3.sql和database4.sql是2个oracle 数据源初始化脚本

两个mongodb库处理：
OneMongoTemplateConf和TwoMongoTemplateConf 分别是两个mongodb数据的配置，定义不同的MongoTemplate。
WelcomeController 类使用时用@Qualifier 注解指定使用哪个数据库的MongoTemplate


### 软件环境 ###
IntelliJ IDEA 2018.3.3(或eclipse)

jdk 1.8

maven 3.3.9

### 使用的技术 ###

- spring-boot
- springmvc
- mybatis
- 通用mapper(一个非常好用的mybatis插件, 详细介绍见http://git.oschina.net/free/Mapper)

### 在IDE 中查看源码并运行 ###

**1. 在IntelliJ IDEA (推荐使用)**

File -> Import Project -> select springboot-multiple-dataSources folder -> create project form existing sources -> ...

**2. 在Eclipse**

File -> Import -> Existing Maven Projects -> ...
