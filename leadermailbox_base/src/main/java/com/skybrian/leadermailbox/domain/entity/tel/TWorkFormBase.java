package com.skybrian.leadermailbox.domain.entity.tel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author jovi
 * @Date 2020/1/15 15:49
 **/
@ApiModel(value = "TWorkFormBase", description = "电话工单")
@Entity
@Table(name = "t_work_form_base")
@Data
public class TWorkFormBase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(name = "pkId", value = "主键")
    private Integer pkId;

    @ApiModelProperty(name = "getDealPK", value = "来电记录id")
    private Integer getDealPK;

    @Column(length = 100)
    @ApiModelProperty(name = "callID", value = "呼叫ID")
    private String callID;

    @Column(length = 100)
    @ApiModelProperty(name = "tapeID", value = "录音ID")
    private String tapeID;

    @Column(length = 30)
    @ApiModelProperty(name = "fmAreaNo", value = "地区编号")
    private String fmAreaNo;

    @Column(length = 50)
    @ApiModelProperty(name = "fmAreaName", value = "地区")
    private String fmAreaName;

    @Column(length = 50)
    @ApiModelProperty(name = "fromName", value = "来话人")
    private String fromName;

    @Column(length = 10)
    @ApiModelProperty(name = "fromSex", value = "性别")
    private String fromSex;

    @Column(length = 200)
    @ApiModelProperty(name = "fmAddress", value = "地址")
    private String fmAddress;

    @Column(length = 30)
    @ApiModelProperty(name = "fromTelA", value = "电话")
    private String fromTelA;

    @Column(length = 100)
    @ApiModelProperty(name = "fmEmail", value = "邮箱")
    private String fmEmail;

    @ApiModelProperty(name = "openFrom", value = "同意公开标记", allowableValues = "0, 1")
    private Integer openFrom;

    @Lob
    @Column(columnDefinition = "TEXT")
    @ApiModelProperty(name = "fmContent", value = "工单内容")
    private String fmContent;

    @Column(length = 30)
    @ApiModelProperty(name = "dFmClaNo", value = "投诉内别编号")
    private String dFmClaNo;

    @Column(length = 50)
    @ApiModelProperty(name = "dFmClaName", value = "投诉类别")
    private String dFmClaName;

    @Column(length = 30)
    @ApiModelProperty(name = "dCntACode", value = "内容分类编号")
    private String dCntACode;

    @Column(length = 100)
    @ApiModelProperty(name = "dCntAName", value = "内容分类")
    private String dCntAName;

    @Column(length = 30)
    @ApiModelProperty(name = "wsCode", value = "流水号")
    private String wsCode;

    @Column(length = 30)
    @ApiModelProperty(name = "wsKey", value = "提取码")
    private String wsKey;

    @Column(length = 100)
    @ApiModelProperty(name = "fmAttachP", value = "直派标记", example = "1")
    private String fmAttachP;

    @Column(length = 50)
    @ApiModelProperty(name = "workFormNO", value = "工单编号")
    private String workFormNO;

    @ApiModelProperty(name = "openX", value = "建议公开标记", allowableValues = "0, 1")
    private Integer openX;

    @ApiModelProperty(name = "wfLimit", value = "办理时限")
    private LocalDateTime wfLimit;

    @ApiModelProperty(name = "wfDefer", value = "延期时间")
    private LocalDateTime wfDefer;

    @ApiModelProperty(name = "dOverTime", value = "回复时间")
    private LocalDateTime dOverTime;

    @Lob
    @Column(columnDefinition = "TEXT")
    @ApiModelProperty(name = "dOverDesc", value = "回复结果")
    private String dOverDesc;

    @ApiModelProperty(name = "iptTime", value = "创建时间")
    private LocalDateTime iptTime;

    @ApiModelProperty(name = "wsTopic", value = "工单主题")
    private Integer wsTopic;

    @ApiModelProperty(name = "wsUFlag", value = "同步更新标记", allowableValues = "1, 2")
    private Integer wsUFlag;

    @Column(length = 50)
    @ApiModelProperty(name = "iptWorkNo", value = "创建人编号")
    private String iptWorkNo;

    @Column(length = 50)
    @ApiModelProperty(name = "iptWorker", value = "创建人")
    private String iptWorker;

    @ApiModelProperty(name = "setProID", value = "工单性质编号")
    private Integer setProID;

    @Column(length = 200)
    @ApiModelProperty(name = "setProName", value = "工单性质")
    private String setProName;

    @ApiModelProperty(name = "crtStepID", value = "工单状态编号", allowableValues = "100, 960, 950, 401, 400, 900, 901, 950, -8, 800")
    private Integer crtStepID;

    @Column(length = 100)
    @ApiModelProperty(name = "crtStepName", value = "工单状态")
    private String crtStepName;

    @ApiModelProperty(name = "crtStepTime", value = "状态变更时间")
    private LocalDateTime crtStepTime;

    @ApiModelProperty(name = "visitFlag", value = "回访标记")
    private Integer visitFlag;

    @ApiModelProperty(name = "recordFlag", value = "满意度标记", allowableValues = "22, 20")
    private Integer recordFlag;

    @ApiModelProperty(name = "recordTime", value = "归档时间")
    private LocalDateTime recordTime;

    @Column(length = 50)
    @ApiModelProperty(name = "recUserNo", value = "回访人编号")
    private String recUserNo;

    @Column(length = 50)
    @ApiModelProperty(name = "recUserName", value = "回访人")
    private String recUserName;

    @ApiModelProperty(name = "bringTime", value = "进入系统时间")
    private LocalDateTime bringTime;

    @ApiModelProperty(name = "spareInt", value = "是否督办")
    private Integer spareInt;

}
