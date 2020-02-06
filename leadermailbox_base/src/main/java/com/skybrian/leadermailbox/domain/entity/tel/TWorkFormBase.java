package com.skybrian.leadermailbox.domain.entity.tel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author jovi
 * @Date 2020/1/15 15:49
 **/
@ApiModel(value = "TWorkFormBase", description = "电话工单")
@Data
public class TWorkFormBase implements Serializable {

    @ApiModelProperty(name = "pkId", value = "主键")
    private Integer pkId;

    @ApiModelProperty(name = "getDealPK", value = "来电记录id")
    private Integer getDealPK;

    @ApiModelProperty(name = "callID", value = "呼叫ID")
    private String callID;

    @ApiModelProperty(name = "tapeID", value = "录音ID")
    private String tapeID;

    @ApiModelProperty(name = "fmAreaNo", value = "地区编号")
    private String fmAreaNo;

    @ApiModelProperty(name = "fmAreaName", value = "地区")
    private String fmAreaName;

    @ApiModelProperty(name = "fromName", value = "来话人")
    private String fromName;

    @ApiModelProperty(name = "fromSex", value = "性别")
    private String fromSex;

    @ApiModelProperty(name = "fmAddress", value = "地址")
    private String fmAddress;

    @ApiModelProperty(name = "fromTelA", value = "电话")
    private String fromTelA;

    @ApiModelProperty(name = "fmEmail", value = "邮箱")
    private String fmEmail;

    @ApiModelProperty(name = "openFrom", value = "同意公开标记")
    private Integer openFrom;

    @ApiModelProperty(name = "fmContent", value = "工单内容")
    private String fmContent;

    @ApiModelProperty(name = "dFmClaNo", value = "投诉内别编号")
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

    @ApiModelProperty(name = "fmAttachP", value = "直派标记")
    private String fmAttachP;

    @ApiModelProperty(name = "workFormNO", value = "工单编号")
    private String workFormNO;

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

    @ApiModelProperty(name = "iptTime", value = "创建时间")
    private LocalDateTime iptTime;

    @ApiModelProperty(name = "wsTopic", value = "工单主题")
    private Integer wsTopic;

    @ApiModelProperty(name = "wsUFlag", value = "同步更新标记")
    private Integer wsUFlag;

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

    @ApiModelProperty(name = "recordTime", value = "归档时间")
    private LocalDateTime recordTime;

    @ApiModelProperty(name = "recUserNo", value = "回访人编号")
    private String recUserNo;

    @ApiModelProperty(name = "recUserName", value = "回访人")
    private String recUserName;

    @ApiModelProperty(name = "bringTime", value = "进入系统时间")
    private LocalDateTime bringTime;

    @ApiModelProperty(name = "spareInt", value = "是否督办")
    private Integer spareInt;

}
