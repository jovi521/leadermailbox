package com.skybrian.leadermailbox.domain.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author jovi
 * @Date 2020/1/15 15:49
 * @Description 电话工单
 **/
@Data
public class WorkFormBase {

    /**
     * @description 主键
     */
    private Integer pkId;

    /**
     * @description 来电记录id
     */
    private Integer getDealPK;

    /**
     * @description 呼叫ID
     */
    private String callID;

    /**
     * @description 录音ID
     */
    private String tapeID;

    /**
     * @description 地区编号
     */
    private String fmAreaNo;
    /**
     * @description 地区
     */
    private String fmAreaName;

    /**
     * @description 来话人
     */
    private String fromName;

    /**
     * @description 性别
     */
    private String fromSex;

    /**
     * @description 地址
     */
    private String fmAddress;

    /**
     * @description 电话
     */
    private String fromTelA;

    /**
     * @description 邮箱
     */
    private String fmEmail;

    /**
     * @description 同意公开标记
     */
    private Integer openFrom;

    /**
     * @description 工单内容
     */
    private String fmContent;

    /**
     * @description 投诉内别编号
     */
    private String dFmClaNo;

    /**
     * @description 投诉类别
     */
    private String dFmClaName;

    /**
     * @description 内容分类编号
     */
    private String dCntACode;

    /**
     * @description 内容分类
     */
    private String dCntAName;

    /**
     * @description 流水号
     */
    private String wsCode;

    /**
     * @description 提取码
     */
    private String wsKey;

    /**
     * @description 直派标记
     */
    private String fmAttachP;

    /**
     * @description 工单编号
     */
    private String workFormNO;

    /**
     * @description 建议公开标记
     */
    private Integer openX;

    /**
     * @description 办理时限
     */
    private LocalDateTime wfLimit;

    /**
     * @description 延期时间
     */
    private LocalDateTime wfDefer;

    /**
     * @description 回复时间
     */
    private LocalDateTime dOverTime;

    /**
     * @description 回复结果
     */
    private String dOverDesc;

    /**
     * @description 创建时间
     */
    private LocalDateTime iptTime;

    /**
     * @description 工单主题
     */
    private Integer wsTopic;

    /**
     * @description 同步更新标记
     */
    private Integer wsUFlag;

    /**
     * @description 创建人编号
     */
    private String iptWorkNo;

    /**
     * @description 创建人
     */
    private String iptWorker;

    /**
     * @description 工单性质编号
     */
    private Integer setProID;

    /**
     * @description 工单性质
     */
    private String setProName;

    /**
     * @description 工单状态编号
     */
    private Integer crtStepID;

    /**
     * @description 工单状态
     */
    private String crtStepName;

    /**
     * @description 状态变更时间
     */
    private LocalDateTime crtStepTime;

    /**
     * @description 回访标记
     */
    private Integer visitFlag;

    /**
     * @description 满意度标记
     */
    private Integer recordFlag;

    /**
     * @description 归档时间
     */
    private LocalDateTime recordTime;

    /**
     * @description 回访人编号
     */
    private String recUserNo;

    /**
     * @description 回访人
     */
    private String recUserName;

    /**
     * @description 进入系统时间
     */
    private LocalDateTime bringTime;

    /**
     * @description 是否督办
     */
    private Integer spareInt;

}
