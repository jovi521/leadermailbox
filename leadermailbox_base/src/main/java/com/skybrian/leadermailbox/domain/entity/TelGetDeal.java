package com.skybrian.leadermailbox.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author jovi
 * @Date 2020/1/15 17:04
 * @Description 来电记录
 **/
@ApiModel(value = "TelGetDeal", description = "来电记录")
@Data
public class TelGetDeal {

    @ApiModelProperty(name = "pkId", value = "主键")
    private Integer pkId;

    /**
     * @description 呼叫ID
     */
    private String callId;

    /**
     * @description 分机号
     */
    private String liftTelNo;

    /**
     * @description 接听帐号
     */
    private String liftWorkNo;

    /**
     * @description 接听人
     */
    private String liftWorker;
    /**
     * @description 来电时间
     */
    private LocalDateTime fromTime;

    /**
     * @description 结束时间
     */
    private LocalDateTime liftEnd;

    /**
     * @description 时间长度
     */
    private Integer liftLength;

    /**
     * @description 录音ID
     */
    private String tapeID;

    /**
     * @description 地区编号
     */
    private String fmAreaNo;

    /**
     * @description 地区名称
     */
    private String fmAreaName;

    /**
     * @description 来话人名字
     */
    private String fromName;

    /**
     * @description 来话人性别
     */
    private String fromSex;

    /**
     * @description 地址
     */
    private String fmAddress;

    /**
     * @description 来电号码
     */
    private String fromTelA;

    /**
     * @description 邮箱
     */
    private String fmEmail;

    /**
     * @description 证件类型
     */
    private String fmCerName;

    /**
     * @description 证件号码
     */
    private String fmCerNO;

    /**
     * @description 来电内容
     */
    private String fmContent;

    /**
     * @description 状态标记编号
     */
    private Integer stateFlag;

    /**
     * @description 状态标记名称
     */
    private String stateDesc;

    /**
     * @description 来电类别编号
     */
    private String dFmClaNo;

    /**
     * @description 来电类别
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
     * @description 公开标记
     */
    private Integer openX;

    /**
     * @description 处理时间
     */
    private LocalDateTime xInputTime;

    /**
     * @description 处理描述
     */
    private String xDealDesc;

    /**
     * @description 处理备注
     */
    private String xSysDesc;

    /**
     * @description 工单创建人编号
     */
    private String yWorkNo;

    /**
     * @description 工单创建人
     */
    private String yWorker;

    /**
     * @description 工单创建时间
     */
    private LocalDateTime yEditTime;

    /**
     * @description 工单主题
     */
    private String wfSltKey;

    /**
     * @description 创建工单标记
     */
    private Integer wkFmFlag;

    /**
     * @description 工单编号
     */
    private String wkFmNO;

    /**
     * @description 工单ID
     */
    private Integer wkPkId;

}
