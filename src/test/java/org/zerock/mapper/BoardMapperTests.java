package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")  //관련된 Bean 읽어와야 함
@Log4j //log 읽어와야 함
public class BoardMapperTests {
   @Setter(onMethod_ = @Autowired)
   private BoardMapper mapper;
   
   @Test //BoardMapper를 가져와서 test 할거임
   public void testGetList() {
      mapper.getList().forEach(board -> log.info(board)); //list로 나오는걸 board에 넣고 하나씩 log.info로 찍히게 됨
   }
}