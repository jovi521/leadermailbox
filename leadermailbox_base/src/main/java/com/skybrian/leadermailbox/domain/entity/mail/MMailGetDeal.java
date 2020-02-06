package com.skybrian.leadermailbox.domain.entity.mail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author jovi
 * @Date 2020/1/15 17:04
 **/
@ApiModel(value = "MMailGetDeal", description = "来信记录")
@Data
public class MMailGetDeal implements Serializable {

    @ApiModelProperty(name = "pkId", value = "主键")
    private Integer pkId;

    @ApiModelProperty(name = "fmAreaNo", value = "地区编号")
    private String fmAreaNo;

    @ApiModelProperty(name = "fmAreaName", value = "地区名称")
    private String fmAreaName;

    @ApiModelProperty(name = "fromName", value = "来信人姓名")
    private String fromName;

    @ApiModelProperty(name = "fromSex", value = "来信人性别")
    private String fromSex;

    @ApiModelProperty(name = "fmAddress", value = "来信人地址")
    private String fmAddress;

    @ApiModelProperty(name = "fromTel", value = "来信人电话")
    private String fromTel;

    @ApiModelProperty(name = "fromTopic", value = "来信主题")
    private String fromTopic;

    @ApiModelProperty(name = "fmEmail", value = "来信人邮箱")
    private String fmEmail;

    @ApiModelProperty(name = "fmCerName", value = "来信人部门名称")
    private String fmCerName;

    @ApiModelProperty(name = "fmCerNO", value = "来信人部门编号")
    private String fmCerNO;

    @ApiModelProperty(name = "fmContent", value = "来信内容")
    private String fmContent;

    @ApiModelProperty(name = "fromTime", value = "来信时间")
    private LocalDateTime fromTime;

    @ApiModelProperty(name = "fmSpare", value = "来源人编号")
    private String fmSpare;

    @ApiModelProperty(name = "fmAttachP", value = "IP地址")
    private String fmAttachP;

    @ApiModelProperty(name = "wsCode", value = "流水号")
    private String wsCode;

    @ApiModelProperty(name = "wsKey", value = "提取码")
    private String wsKey;

    @ApiModelProperty(name = "stateFlag", value = "状态标记编号")
    private Integer stateFlag;

    @ApiModelProperty(name = "stateDesc", value = "状态标记名称")
    private String stateDesc;

    @ApiModelProperty(name = "dFmClaNo", value = "来信类别编号")
    private String dFmClaNo;

    @ApiModelProperty(name = "dFmClaName", value = "来信类别")
    private String dFmClaName;

    @ApiModelProperty(name = "dCntACode", value = "内容分类编号")
    private String dCntACode;

    @ApiModelProperty(name = "dCntAName", value = "内容分类")
    private String dCntAName;

    @ApiModelProperty(name = "openX", value = "公开标记")
    private Integer openX;

    @ApiModelProperty(name = "xDealDesc", value = "回复结果")
    private String xDealDesc;

    @ApiModelProperty(name = "yWorkNo", value = "回复人编号")
    private String yWorkNo;

    @ApiModelProperty(name = "yWorker", value = "回复人")
    private String yWorker;

    @ApiModelProperty(name = "yEditTime", value = "回复时间")
    private LocalDateTime yEditTime;

    @ApiModelProperty(name = "yDealDesc", value = "回复结果-直接答复结果")
    private String yDealDesc;

    @ApiModelProperty(name = "ySpare", value = "附件路径")
    private String ySpare;

    @ApiModelProperty(name = "wkFmFlag", value = "创建工单标记")
    private Integer wkFmFlag;

    @ApiModelProperty(name = "wkFmNO", value = "工单编号")
    private String wkFmNO;

    @ApiModelProperty(name = "wkPkId", value = "工单ID")
    private Integer wkPkId;

    @ApiModelProperty(name = "bringTime", value = "进入系统时间")
    private LocalDateTime bringTime;

    @ApiModelProperty(name = "spareString", value = "来源人")
    private String spareString;

    @ApiModelProperty(name = "flagString", value = "呈批状态")
    private String flagString;

}