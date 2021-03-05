package com.sms.service.impl;

import com.sms.dao.SkillDao;
import com.sms.domain.Skill;
import com.sms.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SkillServiceImpl implements SkillService {
    @Autowired
    private SkillDao dao;
    @Override
    public boolean save(Skill skill) {
        Integer id = skill.getId();
        if (id == null || id < 1) {
            return dao.save(skill);
        }
        return dao.update(skill);
    }

    @Override
    public boolean remove(Integer id) {
        return dao.remove(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Skill> list() {
        return dao.list();
    }

    @Override
    @Transactional(readOnly = true)
    public Skill get(Integer id) {
        return dao.get(id);
    }
}
