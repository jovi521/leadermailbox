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
@ApiModel(value = "MMailWorkForm", description = "信件工单")
@Data
public class MMailWorkForm implements Serializable {

    @ApiModelProperty(name = "pkId", value = "主键")
    private Integer pkId;

    @ApiModelProperty(name = "originFK", value = "来信记录id")
    private String originFK;

    @ApiModelProperty(name = "fmAreaNo", value = "地区编号")
    private String fmAreaNo;

    @ApiModelProperty(name = "fmAreaName", value = "地区")
    private String fmAreaName;

    @ApiModelProperty(name = "fromName", value = "来信人姓名")
    private String fromName;

    @ApiModelProperty(name = "fromSex", value = "来信人性别")
    private String fromSex;

    @ApiModelProperty(name = "fmAddress", value = "来信地址")
    private String fmAddress;

    @ApiModelProperty(name = "fromTel", value = "来信人电话")
    private String fromTel;

    @ApiModelProperty(name = "fromTopic", value = "来信人")
    private String fromTopic;

    @ApiModelProperty(name = "fmEmail", value = "来信人邮箱")
    private String fmEmail;

    @ApiModelProperty(name = "fmContent", value = "来信内容")
    private String fmContent;

    @ApiModelProperty(name = "fromTime", value = "来信时间")
    private LocalDateTime fromTime;

    @ApiModelProperty(name = "fmAttachN", value = "附加字段")
    private String fmAttachN;

    @ApiModelProperty(name = "dFmClaNo", value = "投诉类别编号")
    private String dFmClaNo;

    @ApiModelProperty(name = "dFmClaName", value = "投诉类别")
    private String dFmClaName;

    @ApiModelProperty(name = "dCntACode", value = "内容分类编号")
    private String dCntACode;

    @ApiModelProperty(name = "dCntAName", value = "内容分类")
    private String dCntAName;

    @ApiModelProperty(name = "wsCode", value = "流水号")
    private String wsCode;

    @ApiModelProperty(name = "wsKey", value = "提取码")
    private String wsKey;

    @ApiModelProperty(name = "workFormNO", value = "工单编号")
    private String workFormNO;

    @ApiModelProperty(name = "wfClaNo", value = "审核人工号")
    private String wfClaNo;

    @ApiModelProperty(name = "openX", value = "建议公开标记")
    private Integer openX;

    @ApiModelProperty(name = "wfLimit", value = "办理时限")
    private LocalDateTime wfLimit;

    @ApiModelProperty(name = "wfDefer", value = "延期时间")
    private LocalDateTime wfDefer;

    @ApiModelProperty(name = "dOverTime", value = "回复时间")
    private LocalDateTime dOverTime;

    @ApiModelProperty(name = "dOverDesc", value = "回复结果")
    private String dOverDesc;

    @ApiModelProperty(name = "wsUFlag", value = "同步更新标记")
    private Integer wsUFlag;

    @ApiModelProperty(name = "iptTime", value = "创建时间")
    private LocalDateTime iptTime;

    @ApiModelProperty(name = "iptWorkNo", value = "创建人编号")
    private String iptWorkNo;

    @ApiModelProperty(name = "iptWorker", value = "创建人")
    private String iptWorker;

    @ApiModelProperty(name = "setProID", value = "工单性质编号")
    private Integer setProID;

    @ApiModelProperty(name = "setProName", value = "工单性质")
    private String setProName;

    @ApiModelProperty(name = "crtStepID", value = "工单状态编号")
    private Integer crtStepID;

    @ApiModelProperty(name = "crtStepName", value = "工单状态")
    private String crtStepName;

    @ApiModelProperty(name = "crtStepTime", value = "状态变更时间")
    private LocalDateTime crtStepTime;

    @ApiModelProperty(name = "visitFlag", value = "回访标记")
    private Integer visitFlag;

    @ApiModelProperty(name = "recordFlag", value = "满意度标记")
    private Integer recordFlag;

    @ApiModelProperty(name = "recordTime", value = "回访时间")
    private LocalDateTime recordTime;

    @ApiModelProperty(name = "recUserNo", value = "回访人编号")
    private String recUserNo;

    @ApiModelProperty(name = "recUserName", value = "回访人")
    private String recUserName;

    @ApiModelProperty(name = "bringTime", value = "进入系统时间")
    private LocalDateTime bringTime;

    @ApiModelProperty(name = "spareString", value = "信件来源")
    private String spareString;
}
