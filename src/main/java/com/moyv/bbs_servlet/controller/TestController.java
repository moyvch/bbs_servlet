package com.moyv.bbs_servlet.controller;

import com.moyv.bbs_servlet.service.PostService;
import com.moyv.bbs_servlet.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA
 *
 * @author moyv
 * Date: 2021/7/18
 * Time: 22:07
 * Description:
 */
@Controller
public class TestController {
    @Autowired
    private StarService starService;
    @Autowired
    private PostService postService;

    @RequestMapping("/test")
    public @ResponseBody String test(){

        return postService.selectTest(1).toString();
    }
}
