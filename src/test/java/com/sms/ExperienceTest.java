package com.sms;

import com.sms.bean.Experience;
import com.sms.bean.Skill;
import com.sms.utils.MyBatises;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.Reader;
import java.util.List;
import java.util.Map;


public class ExperienceTest {
    @Test
    public void select() throws Exception {
        try (SqlSession session = MyBatises.openSession()) {

//            List<Experience> experiences = session.selectList("experience.list");
//            for (Experience experience : experiences) {
//                System.out.println(experience);
//            }
            List<Map<String, Object>> experiences = session.selectList("experience.list");
            for (Map<String, Object> experience : experiences) {
                System.out.println(experience);
            }
        }
    }
}
