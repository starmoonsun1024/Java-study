package com.sms.test;

import com.sms.bean.Experience;
import com.sms.util.MyBatises;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class ExperienceTest {
    @Test
    public void list() {
        try (SqlSession session = MyBatises.openSession(false)) {

            List<Experience> experiences = session.selectList("experience.list");
//            List<Map<String, Object>> experiences = session.selectList("experience.list");
            for (Experience experience : experiences) {
                System.out.println(experience);
            }
        }
    }
}
