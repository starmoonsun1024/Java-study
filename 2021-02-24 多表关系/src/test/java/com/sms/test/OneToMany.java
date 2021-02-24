package com.sms.test;

import com.sms.bean.BankCard;
import com.sms.bean.Person;
import com.sms.util.MyBatises;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class OneToMany {

    @Test
    public void bankCardList() {
        try (SqlSession session = MyBatises.openSession()) {
            List<BankCard> bankCards = session.selectList("bankCard.list");
            System.out.println(bankCards);

        }
    }
    @Test
    public void bankCardGet() {
        try (SqlSession session = MyBatises.openSession()) {
            BankCard bankCard = session.selectOne("bankCard.get", 1);
            System.out.println(bankCard);
        }
    }

    @Test
    public void personList() {
        try (SqlSession session = MyBatises.openSession()) {
            List<Person> persons = session.selectList("person.list");
            System.out.println(persons);

        }
    }
}
