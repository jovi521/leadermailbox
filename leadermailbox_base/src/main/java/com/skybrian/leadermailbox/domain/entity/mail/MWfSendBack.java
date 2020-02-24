package com.skybrian.leadermailbox.domain.entity.mail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author jovi
 * @Date 2020/1/15 16:51
 **/
@ApiModel(value = "MWfSendBack", description = "信件工单派单记录")
@Entity
@Table(name = "m_wf_send_back")
@Data
public class MWfSendBack implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(name = "pkId", value = "主键")
    private Integer pkId;

    @ApiModelProperty(name = "mailPK", value = "来信记录ID")
    private Integer mailPK;

    @ApiModelProperty(name = "wfId", value = "工单ID")
    private Integer wfId;

    @Column(length = 30)
    @ApiModelProperty(name = "seqCode", value = "交办次数编号")
    private String seqCode;

    @Column(length = 50)
    @ApiModelProperty(name = "seqName", value = "交办次数")
    private String seqName;

    @ApiModelProperty(name = "sendState", value = "收发状态", allowableValues = "0, 10, 11, 21, 22, 23, 30, 40")
    private Integer sendState;

    @Column(length = 30)
    @ApiModelProperty(name = "sortCode", value = "交办性质编号")
    private String sortCode;

    @Column(length = 50)
    @ApiModelProperty(name = "sortName", value = "交办性质")
    private String sortName;

    @Column(length = 30)
    @ApiModelProperty(name = "dealCode", value = "办理方式编号")
    private String dealCode;

    @Column(length = 50)
    @ApiModelProperty(name = "dealName", value = "办理方式")
    private String dealName;

    @Column(length = 50)
    @ApiModelProperty(name = "sBDeptID", value = "办理单位编号")
    private String sBDeptID;

    @Column(length = 100)
    @ApiModelProperty(name = "sBDeptName", value = "办理单位")
    private String sBDeptName;

    @Column(length = 2000)
    @ApiModelProperty(name = "sendDesc", value = "办理要求")
    private String sendDesc;

    @ApiModelProperty(name = "backLimit", value = "办理回复时限")
    private LocalDateTime backLimit;

    @Column(length = 30)
    @ApiModelProperty(name = "sDeptID", value = "派单单位编号")
    private String sDeptID;

    @Column(length = 50)
    @ApiModelProperty(name = "sDeptName", value = "派单单位")
    private String sDeptName;

    @Column(length = 50)
    @ApiModelProperty(name = "sUserNo", value = "派单人编号")
    private String sUserNo;

    @Column(length = 50)
    @ApiModelProperty(name = "sUserName", value = "派单人")
    private String sUserName;

    @ApiModelProperty(name = "sendTime", value = "派单时间")
    private LocalDateTime sendTime;

    @Column(length = 1000)
    @ApiModelProperty(name = "sendRemark", value = "派发内容")
    private String sendRemark;

    @ApiModelProperty(name = "getTime", value = "签收时间")
    private LocalDateTime getTime;

    @ApiModelProperty(name = "backState", value = "回复标记", allowableValues = "0, 10, 11, 12, 21, 22")
    private Integer backState;

    @Column(length = 50)
    @ApiModelProperty(name = "getPerson", value = "回复人")
    private String getPerson;

    @Column(length = 50)
    @ApiModelProperty(name = "getPerTel", value = "回复人电话")
    private String getPerTel;

    @Column(length = 50)
    @ApiModelProperty(name = "bUserNo", value = "回复用户编号")
    private String bUserNo;

    @Column(length = 50)
    @ApiModelProperty(name = "bUserName", value = "回复用户")
    private String bUserName;

    @Column(length = 50)
    @ApiModelProperty(name = "bDutyDept", value = "回复单位")
    private String bDutyDept;

    @ApiModelProperty(name = "backTime", value = "回复时间")
    private LocalDateTime backTime;

    @Lob
    @Column(columnDefinition = "TEXT")
    @ApiModelProperty(name = "backDesc", value = "回复结果")
    private String backDesc;

    @Column(length = 1000)
    @ApiModelProperty(name = "backRemark", value = "退回理由")
    private String backRemark;

}