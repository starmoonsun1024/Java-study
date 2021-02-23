package com.sms;

import com.sms.bean.Skill;
import com.sms.utils.MyBatises;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SkillTest  {
    @Test
    public void select() throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");

        SqlSessionFactoryBuilder buidler = new SqlSessionFactoryBuilder();

        SqlSessionFactory factory = buidler.build(reader);

        SqlSession session = factory.openSession();

        List<Skill> skills = session.selectList("skill.list");

        for (Skill skill : skills) {
            System.out.println(skill);
        }
        session.close();
    }

    @Test
    public void select2() throws Exception {
        try(SqlSession session = MyBatises.openSession()) {
             Skill skill = session.selectOne("skill.get", 2);
             System.out.println(skill);
        }

    }

    @Test
    public void select3() throws Exception {
        try (SqlSession session = MyBatises.openSession()) {
//            Map<String, Object> map = new HashMap<>();
//            map.put("id", 4);
//            map.put("level", 3);
            Skill param = new Skill();
            param.setId(3);
            param.setLevel(3);
            param.setName("%陈%");
            List<Skill> skills = session.selectList("skill.list2", param);
            for (Skill skill : skills) {
                System.out.println(skill);
            }
        }
    }
}
