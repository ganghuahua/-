package com.xqopen;

import com.xqopen.entity.Foo;
import com.xqopen.mapper.FooMapper;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;



@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
//@Transactional
@SpringBootTest(classes = APP.class)
public class MPTest {

  private Logger logger = LoggerFactory.getLogger(getClass());

  @Autowired
  private FooMapper mapper;

  @Test
  //@Rollback
  public void testInsert() {
    System.out.println(mapper);
    mapper.insert(new Foo());

  }

  @Test
  public void testSelectById() {
    Foo foo = mapper.selectById(1);
    foo.getBirth();
  }

  @Test
  public void testSelectAll() {
    List<Foo> ls = mapper.selectList(null);
    for (Foo i : ls) {
      System.out.println(i.getId());
    }
  }

}