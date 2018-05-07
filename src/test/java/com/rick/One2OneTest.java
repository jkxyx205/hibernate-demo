package com.rick;

import com.rick.one2one.dao.IdCardRepository;
import com.rick.one2one.dao.PersonRepository;
import com.rick.one2one.entity.IdCard;
import com.rick.one2one.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by rick on 5/6/18.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class One2OneTest {
   @Resource
    private IdCardRepository idCardRepository;

   @Resource
   private PersonRepository personRepository;


   @Test
   public void addIdCardTest() {
       IdCard idCard = new IdCard();
       idCard.setSno("217675656432456567");

       Person person = new Person();
       person.setName("Jim.Zhang");

       idCard.setPerson(person);

       idCardRepository.save(idCard);
   }


}
