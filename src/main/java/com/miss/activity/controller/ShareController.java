package com.miss.activity.controller;

import com.miss.activity.model.MissActivityShare;
import com.miss.activity.service.IActivityShareService;
import com.miss.activity.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShareController {

    @Autowired
    private IActivityShareService activityShareService;

    @GetMapping("/insert-test")
    public Result insert() {
        MissActivityShare activityShare = new MissActivityShare();
        activityShare.setPlatform(0);
        activityShare.setContent("思念汤圆，好吃哦");
        activityShare.setIdentity(0);
        activityShare.setLikeCartoonImg("http:www.sdfasdf.img");
        activityShare.setOpenId("123asdfaf1213d");
        activityShare.setToUserType(1);
        MissActivityShare result = activityShareService.insert(activityShare);
        return Result.success(result);
    }

    @GetMapping("/get")
    public Result get(Long id) {
        MissActivityShare activityShare = activityShareService.selectById(id);
        return Result.success(activityShare);
    }
}
