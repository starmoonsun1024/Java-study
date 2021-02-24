package com.sms.test;

import com.sms.bean.Skill;
import com.sms.util.MyBatises;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SkillTest {
    // 增
    @Test
    public void insert() {
        try (SqlSession session = MyBatises.openSession(false)) {
            Skill skill = new Skill("原型图绘制", 1000);
            session.insert("skill.insert", skill);
            session.commit();
        }
    }

    @Test
    public void batchInsert() {
        try (SqlSession session = MyBatises.openSession()) {
            List<Skill> skills = new ArrayList<>();

            skills.add(new Skill("Java1", 111));
            skills.add(new Skill("Java2", 222));
            skills.add(new Skill("Java2", 333));
            skills.add(new Skill("Java2", 4444));
            session.insert("skill.batchInsert", skills);
            session.commit();
        }
    }
    // 删
    @Test
    public void delete() {
        try (SqlSession session = MyBatises.openSession(false)) {
            session.delete("skill.delete", 2);
            session.commit();
        }
    }
    @Test
    public void batchDelete() {
        try (SqlSession session = MyBatises.openSession()) {
            List<Integer> ids = new ArrayList<>();
            ids.add(19);
            session.delete("skill.batchDelete", ids);
            session.commit();
        }
    }
    // 改
    @Test
    public void update() {
        try (SqlSession session = MyBatises.openSession(false)) {
            Skill skill = new Skill("OC", 250);
            skill.setId(4);
            session.update("skill.update", skill);
            session.commit();
        }
    }
    // 查
    @Test
    public void get() {
        try (SqlSession session = MyBatises.openSession(false)) {
            Skill skill = session.selectOne("skill.get", 3);
            System.out.println(skill);
        }
    }

    @Test
    public void list() {
        try (SqlSession session = MyBatises.openSession(false)) {
            List<Skill> skills = session.selectList("skill.list");
            for (Skill skill : skills) {
                System.out.println(skill);
            }
        }
    }
    @Test
    public void search() {
        try (SqlSession session = MyBatises.openSession(false)) {
            Skill skill = new Skill();
            skill.setId(2);
            List<Skill> skills = session.selectList("skill.search", skill);
            for (Skill skill1 : skills) {
                System.out.println(skill1);
            }
        }
    }
}
