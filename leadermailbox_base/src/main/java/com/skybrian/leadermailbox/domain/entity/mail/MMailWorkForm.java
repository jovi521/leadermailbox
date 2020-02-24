package com.skybrian.leadermailbox.domain.entity.mail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author jovi
 * @Date 2020/1/15 17:04
 **/
@ApiModel(value = "MMailWorkForm", description = "信件工单")
@Entity
@Table(name = "m_mail_work_form")
@Data
public class MMailWorkForm implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(name = "pkId", value = "主键")
    private Integer pkId;

    @Column(length = 50)
    @ApiModelProperty(name = "originFK", value = "来信记录id")
    private String originFK;

    @Column(length = 30)
    @ApiModelProperty(name = "fmAreaNo", value = "地区编号")
    private String fmAreaNo;

    @Column(length = 50)
    @ApiModelProperty(name = "fmAreaName", value = "地区")
    private String fmAreaName;

    @Column(length = 50)
    @ApiModelProperty(name = "fromName", value = "来信人姓名")
    private String fromName;

    @Column(length = 10)
    @ApiModelProperty(name = "fromSex", value = "来信人性别")
    private String fromSex;

    @Column(length = 200)
    @ApiModelProperty(name = "fmAddress", value = "来信地址")
    private String fmAddress;

    @Column(length = 50)
    @ApiModelProperty(name = "fromTel", value = "来信人电话")
    private String fromTel;

    @Column(length = 100)
    @ApiModelProperty(name = "fromTopic", value = "来信主题")
    private String fromTopic;

    @Column(length = 100)
    @ApiModelProperty(name = "fmEmail", value = "来信人邮箱")
    private String fmEmail;

    @Lob
    @Column(columnDefinition = "TEXT")
    @ApiModelProperty(name = "fmContent", value = "来信内容")
    private String fmContent;

    @ApiModelProperty(name = "fromTime", value = "来信时间")
    private LocalDateTime fromTime;

    @Column(length = 100)
    @ApiModelProperty(name = "fmAttachN", value = "附加字段")
    private String fmAttachN;

    @Column(length = 30)
    @ApiModelProperty(name = "dFmClaNo", value = "投诉类别编号")
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

    @Column(length = 50)
    @ApiModelProperty(name = "workFormNO", value = "工单编号")
    private String workFormNO;

    @Column(length = 30)
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

    @Lob
    @Column(columnDefinition = "TEXT")
    @ApiModelProperty(name = "dOverDesc", value = "回复结果")
    private String dOverDesc;

    @ApiModelProperty(name = "wsUFlag", value = "同步更新标记", allowableValues = "1, 2")
    private Integer wsUFlag;

    @ApiModelProperty(name = "iptTime", value = "创建时间")
    private LocalDateTime iptTime;

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

    @ApiModelProperty(name = "crtStepID", value = "工单状态编号", allowableValues = "100, 960, 950, 401, 400, 900, 901, 950, -8, 800, 905")
    private Integer crtStepID;

    @Column(length = 100)
    @ApiModelProperty(name = "crtStepName", value = "工单状态")
    private String crtStepName;

    @ApiModelProperty(name = "crtStepTime", value = "状态变更时间")
    private LocalDateTime crtStepTime;

    @ApiModelProperty(name = "visitFlag", value = "回访标记")
    private Integer visitFlag;

    @ApiModelProperty(name = "recordFlag", value = "满意度标记", allowableValues = "20, 22, 23, 10, 0")
    private Integer recordFlag;

    @ApiModelProperty(name = "recordTime", value = "回访时间")
    private LocalDateTime recordTime;

    @Column(length = 50)
    @ApiModelProperty(name = "recUserNo", value = "回访人编号")
    private String recUserNo;

    @Column(length = 50)
    @ApiModelProperty(name = "recUserName", value = "回访人")
    private String recUserName;

    @ApiModelProperty(name = "bringTime", value = "进入系统时间")
    private LocalDateTime bringTime;

    @Column(length = 200)
    @ApiModelProperty(name = "spareString", value = "信件来源")
    private String spareString;
}
