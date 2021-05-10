package com.miss.activity.model;

import lombok.Data;

import java.util.Date;

/**
 * 思念端午节分享活动
 *
 * @author dingzi
 */
@Data
public class MissActivityShare {

    /** 主键ID*/
    private Long id;

    /** 微信openId*/
    private String openId;

    /** 平台，0-京东到家，1-多点，2-美团*/
    private Integer platform;

    /** 身份, 0-男，1-女*/
    private Integer identity;

    /** 喜爱的卡通图片*/
    private String likeCartoonImg;

    /** 想送的对象, 0-家人，1-喜欢TA，2-好基友，3-好闺蜜*/
    private Integer toUserType;

    /** 文案内容*/
    private String content;

    /** 创建时间*/
    private Date createTime;


}