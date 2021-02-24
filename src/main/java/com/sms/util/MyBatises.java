package com.sms.util;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MyBatises {

    private static SqlSessionFactory factory;

    static {
        try (Reader reader = Resources.getResourceAsReader("mybatis-config.xml")) {
            factory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession openSession(Boolean autoCommit) {
        return factory.openSession(autoCommit);
    }

    public static SqlSession openSession() {
        return factory.openSession();
    }
}
