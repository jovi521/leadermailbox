package com.skybrian.leadermailbox.domain.entity.tel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author jovi
 * @Date 2020/1/15 17:04
 **/
@ApiModel(value = "TTelGetDeal", description = "来电记录")
@Data
public class TTelGetDeal implements Serializable {

    @ApiModelProperty(name = "pkId", value = "主键")
    private Integer pkId;

    @ApiModelProperty(name = "callId", value = "呼叫ID")
    private String callId;

    @ApiModelProperty(name = "liftTelNo", value = "分机号")
    private String liftTelNo;

    @ApiModelProperty(name = "liftWorkNo", value = "接听帐号")
    private String liftWorkNo;

    @ApiModelProperty(name = "liftWorker", value = "接听人")
    private String liftWorker;

    @ApiModelProperty(name = "fromTime", value = "来电时间")
    private LocalDateTime fromTime;

    @ApiModelProperty(name = "liftEnd", value = "结束时间")
    private LocalDateTime liftEnd;

    @ApiModelProperty(name = "liftLength", value = "时间长度")
    private Integer liftLength;

    @ApiModelProperty(name = "tapeID", value = "录音ID")
    private String tapeID;

    @ApiModelProperty(name = "fmAreaNo", value = "地区编号")
    private String fmAreaNo;

    @ApiModelProperty(name = "fmAreaName", value = "地区名称")
    private String fmAreaName;

    @ApiModelProperty(name = "fromName", value = "来话人名字")
    private String fromName;

    @ApiModelProperty(name = "fromSex", value = "来话人性别")
    private String fromSex;

    @ApiModelProperty(name = "fmAddress", value = "地址")
    private String fmAddress;

    @ApiModelProperty(name = "fromTelA", value = "来电号码")
    private String fromTelA;

    @ApiModelProperty(name = "fmEmail", value = "邮箱")
    private String fmEmail;

    @ApiModelProperty(name = "fmCerName", value = "证件类型")
    private String fmCerName;

    @ApiModelProperty(name = "fmCerNO", value = "证件号码")
    private String fmCerNO;

    @ApiModelProperty(name = "fmContent", value = "来电内容")
    private String fmContent;

    @ApiModelProperty(name = "stateFlag", value = "状态标记编号", allowableValues = "132, 125, 131, 101, 136, 120")
    private Integer stateFlag;

    @ApiModelProperty(name = "stateDesc", value = "状态标记名称")
    private String stateDesc;

    @ApiModelProperty(name = "dFmClaNo", value = "来电类别编号")
    private String dFmClaNo;

    @ApiModelProperty(name = "dFmClaName", value = "来电类别")
    private String dFmClaName;

    @ApiModelProperty(name = "dCntACode", value = "内容分类编号")
    private String dCntACode;

    @ApiModelProperty(name = "dCntAName", value = "内容分类")
    private String dCntAName;

    @ApiModelProperty(name = "wsCode", value = "流水号")
    private String wsCode;

    @ApiModelProperty(name = "wsKey", value = "提取码")
    private String wsKey;

    @ApiModelProperty(name = "openX", value = "公开标记")
    private Integer openX;

    @ApiModelProperty(name = "xInputTime", value = "处理时间")
    private LocalDateTime xInputTime;

    @ApiModelProperty(name = "xDealDesc", value = "处理描述")
    private String xDealDesc;

    @ApiModelProperty(name = "xSysDesc", value = "处理备注")
    private String xSysDesc;

    @ApiModelProperty(name = "yWorkNo", value = "工单创建人编号")
    private String yWorkNo;

    @ApiModelProperty(name = "yWorker", value = "工单创建人")
    private String yWorker;

    @ApiModelProperty(name = "yEditTime", value = "工单创建时间")
    private LocalDateTime yEditTime;

    @ApiModelProperty(name = "wfSltKey", value = "工单主题")
    private String wfSltKey;

    @ApiModelProperty(name = "wkFmFlag", value = "创建工单标记")
    private Integer wkFmFlag;

    @ApiModelProperty(name = "wkFmNO", value = "工单编号")
    private String wkFmNO;

    @ApiModelProperty(name = "wkPkId", value = "工单ID")
    private Integer wkPkId;

}
