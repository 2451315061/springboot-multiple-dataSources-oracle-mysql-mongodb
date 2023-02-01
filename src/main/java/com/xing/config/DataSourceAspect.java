package com.xing.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.xing.service.Test1Service;
import com.xing.service.Test3Service;
import com.xing.service.Test4Service;
import com.xing.service.impl.Test1ServiceImpl;
import com.xing.service.impl.Test3ServiceImpl;
import com.xing.service.impl.Test4ServiceImpl;
import com.xing.util.DatabaseContextHolder;
import com.xing.util.DatabaseType;

@Aspect
@Component
public class DataSourceAspect {

    /**
     * 使用空方法定义切点表达式
     */
    @Pointcut("execution(* com.xing.service.**.*(..))")
    public void declareJointPointExpression() {
    }

    @Before("declareJointPointExpression()")
    public void setDataSourceKey(JoinPoint point){
        //根据连接点所属的类实例，动态切换数据源
        if (point.getTarget() instanceof Test1Service
                || point.getTarget() instanceof Test1ServiceImpl) {
            DatabaseContextHolder.setDatabaseType(DatabaseType.test1);
        } 
        else if (point.getTarget() instanceof Test3Service
                || point.getTarget() instanceof Test3ServiceImpl) {
        	 DatabaseContextHolder.setDatabaseType(DatabaseType.test3);
        }
        else if (point.getTarget() instanceof Test4Service
                || point.getTarget() instanceof Test4ServiceImpl) {
            DatabaseContextHolder.setDatabaseType(DatabaseType.test4);
        }
        else {//连接点所属的类实例是（当然，这一步也可以不写，因为defaultTargertDataSource就是该类所用的mytestdb）
            DatabaseContextHolder.setDatabaseType(DatabaseType.test2);
        }
    }
}