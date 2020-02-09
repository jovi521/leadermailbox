package com.skybrian.leadermailbox.domain.entity.mail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author jovi
 * @Date 2020/1/15 16:51
 **/
@ApiModel(value = "MWfSendBack", description = "信件工单派单记录")
@Data
public class MWfSendBack implements Serializable {

    @ApiModelProperty(name = "pkId", value = "主键")
    private Integer pkId;

    @ApiModelProperty(name = "mailPK", value = "来信记录ID")
    private Integer mailPK;

    @ApiModelProperty(name = "wfId", value = "工单ID")
    private Integer wfId;

    @ApiModelProperty(name = "seqCode", value = "交办次数编号")
    private String seqCode;

    @ApiModelProperty(name = "seqName", value = "交办次数")
    private String seqName;

    @ApiModelProperty(name = "sendState", value = "收发状态", allowableValues = "0, 10, 11, 21, 22, 23, 30, 40")
    private Integer sendState;

    @ApiModelProperty(name = "sortCode", value = "交办性质编号")
    private String sortCode;

    @ApiModelProperty(name = "sortName", value = "交办性质")
    private String sortName;

    @ApiModelProperty(name = "dealCode", value = "办理方式编号")
    private String dealCode;

    @ApiModelProperty(name = "dealName", value = "办理方式")
    private String dealName;

    @ApiModelProperty(name = "sBDeptID", value = "办理单位编号")
    private String sBDeptID;

    @ApiModelProperty(name = "sBDeptName", value = "办理单位")
    private String sBDeptName;

    @ApiModelProperty(name = "sendDesc", value = "办理要求")
    private String sendDesc;

    @ApiModelProperty(name = "backLimit", value = "办理回复时限")
    private LocalDateTime backLimit;

    @ApiModelProperty(name = "sDeptID", value = "派单单位编号")
    private String sDeptID;

    @ApiModelProperty(name = "sDeptName", value = "派单单位")
    private String sDeptName;

    @ApiModelProperty(name = "sUserNo", value = "派单人编号")
    private String sUserNo;

    @ApiModelProperty(name = "sUserName", value = "派单人")
    private String sUserName;

    @ApiModelProperty(name = "sendTime", value = "派单时间")
    private LocalDateTime sendTime;

    @ApiModelProperty(name = "sendRemark", value = "派发内容")
    private String sendRemark;

    @ApiModelProperty(name = "getTime", value = "签收时间")
    private LocalDateTime getTime;

    @ApiModelProperty(name = "backState", value = "回复标记", allowableValues = "0, 10, 11, 12, 21, 22")
    private Integer backState;

    @ApiModelProperty(name = "getPerson", value = "回复人")
    private String getPerson;

    @ApiModelProperty(name = "getPerTel", value = "回复人电话")
    private String getPerTel;

    @ApiModelProperty(name = "bUserNo", value = "回复用户编号")
    private String bUserNo;

    @ApiModelProperty(name = "bUserName", value = "回复用户")
    private String bUserName;

    @ApiModelProperty(name = "bDutyDept", value = "回复单位")
    private String bDutyDept;

    @ApiModelProperty(name = "backTime", value = "回复时间")
    private LocalDateTime backTime;

    @ApiModelProperty(name = "backDesc", value = "回复结果")
    private String backDesc;

    @ApiModelProperty(name = "backRemark", value = "退回理由")
    private String backRemark;

}