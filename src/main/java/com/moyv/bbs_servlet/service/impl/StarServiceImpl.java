package com.moyv.bbs_servlet.service.impl;

import com.moyv.bbs_servlet.dao.StarMapper;
import com.moyv.bbs_servlet.entity.Star;
import com.moyv.bbs_servlet.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @author moyv
 * Date: 2021/7/18
 * Time: 22:05
 * Description:
 */
@Service
public class StarServiceImpl implements StarService {
    @Autowired
    private StarMapper starMapper;


    public List<Star> selectTest(Integer starId) {
        return starMapper.selectByPostId(1);
    }
}
