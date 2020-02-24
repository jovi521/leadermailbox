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
@ApiModel(value = "MMailGetDeal", description = "来信记录")
@Entity
@Table(name = "m_mail_get_deal")
@Data
public class MMailGetDeal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(name = "pkId", value = "主键")
    private Integer pkId;

    @Column(length = 30)
    @ApiModelProperty(name = "fmAreaNo", value = "地区编号")
    private String fmAreaNo;

    @Column(length = 50)
    @ApiModelProperty(name = "fmAreaName", value = "地区名称")
    private String fmAreaName;

    @Column(length = 50)
    @ApiModelProperty(name = "fromName", value = "来信人姓名")
    private String fromName;

    @Column(length = 10)
    @ApiModelProperty(name = "fromSex", value = "来信人性别")
    private String fromSex;

    @Column(length = 200)
    @ApiModelProperty(name = "fmAddress", value = "来信人地址")
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

    @Column(length = 50)
    @ApiModelProperty(name = "fmCerName", value = "来信人部门名称")
    private String fmCerName;

    @Column(length = 50)
    @ApiModelProperty(name = "fmCerNO", value = "来信人部门编号")
    private String fmCerNO;

    @Lob
    @Column(columnDefinition = "TEXT")
    @ApiModelProperty(name = "fmContent", value = "来信内容")
    private String fmContent;

    @ApiModelProperty(name = "fromTime", value = "来信时间")
    private LocalDateTime fromTime;

    @Column(length = 100)
    @ApiModelProperty(name = "fmSpare", value = "来源人编号")
    private String fmSpare;

    @Column(length = 100)
    @ApiModelProperty(name = "fmAttachP", value = "IP地址")
    private String fmAttachP;

    @Column(length = 30)
    @ApiModelProperty(name = "wsCode", value = "流水号")
    private String wsCode;

    @Column(length = 30)
    @ApiModelProperty(name = "wsKey", value = "提取码")
    private String wsKey;

    @ApiModelProperty(name = "stateFlag", value = "状态标记编号")
    private Integer stateFlag;

    @Column(length = 100)
    @ApiModelProperty(name = "stateDesc", value = "状态标记名称")
    private String stateDesc;

    @Column(length = 30)
    @ApiModelProperty(name = "dFmClaNo", value = "来信类别编号")
    private String dFmClaNo;

    @Column(length = 50)
    @ApiModelProperty(name = "dFmClaName", value = "来信类别")
    private String dFmClaName;

    @Column(length = 30)
    @ApiModelProperty(name = "dCntACode", value = "内容分类编号")
    private String dCntACode;

    @Column(length = 100)
    @ApiModelProperty(name = "dCntAName", value = "内容分类")
    private String dCntAName;

    @ApiModelProperty(name = "openX", value = "公开标记")
    private Integer openX;

    @Column(length = 4000)
    @ApiModelProperty(name = "xDealDesc", value = "回复结果")
    private String xDealDesc;

    @Column(length = 50)
    @ApiModelProperty(name = "yWorkNo", value = "回复人编号")
    private String yWorkNo;

    @Column(length = 50)
    @ApiModelProperty(name = "yWorker", value = "回复人")
    private String yWorker;

    @ApiModelProperty(name = "yEditTime", value = "回复时间")
    private LocalDateTime yEditTime;

    @Column(length = 4000)
    @ApiModelProperty(name = "yDealDesc", value = "回复结果-直接答复结果")
    private String yDealDesc;

    @Column(length = 100)
    @ApiModelProperty(name = "ySpare", value = "附件路径")
    private String ySpare;

    @ApiModelProperty(name = "wkFmFlag", value = "创建工单标记")
    private Integer wkFmFlag;

    @Column(length = 50)
    @ApiModelProperty(name = "wkFmNO", value = "工单编号")
    private String wkFmNO;

    @ApiModelProperty(name = "wkPkId", value = "工单ID")
    private Integer wkPkId;

    @ApiModelProperty(name = "bringTime", value = "进入系统时间")
    private LocalDateTime bringTime;

    @Column(length = 200)
    @ApiModelProperty(name = "spareString", value = "来源人")
    private String spareString;

    @Column(length = 50)
    @ApiModelProperty(name = "flagString", value = "呈批状态")
    private String flagString;

}