package com.moyv.bbs_servlet;

import com.moyv.bbs_servlet.dao.PostMapper;
import com.moyv.bbs_servlet.dao.RemarkMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class BbsServletApplicationTests {
    @Autowired
    PostMapper postMapper;
    @Autowired
    RemarkMapper remarkMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void postMapperTest(){
        System.out.println(postMapper.selectAll());
    }
    @Test
    void remarkMapperTest(){
        System.out.println(remarkMapper.selectByPostId(2));
    }

}
