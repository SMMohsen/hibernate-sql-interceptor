package com.sql.interceptor.demo.interceptor;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class CustomSqlInterceptor extends EmptyInterceptor {

    @Override
    public String onPrepareStatement(String sql) {

        sql = doSomethingWithSql(sql);
        return super.onPrepareStatement(sql);
    }

    @Override
    public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        doSomethingWithEntity(entity);
        return super.onSave(entity, id, state, propertyNames, types);
    }


    private String doSomethingWithSql(String sql) {
        System.out.println("this is query "+sql);
        return sql;
    }

    private Object doSomethingWithEntity(Object entity) {
        System.out.println("i am going to save on entity "+entity.getClass().getName());
        return entity;
    }


}
