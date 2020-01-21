package com.skybrian.leadermailbox.domain.entity;

import java.time.LocalDateTime;

/**
 * @Author jovi
 * @Date 2020/1/15 16:51
 * @Description 电话工单派单记录
 **/
public class WfSendBack {

    /**
     * @description 主键
     */
    private Integer pkId;

    /**
     * @description 来电记录id
     */
    private Integer getDealPk;

    /**
     * @description 呼叫ID
     */
    private String callID;

    /**
     * @description 录音ID
     */
    private String tapeID;

    /**
     * @description 工单ID
     */
    private String wfId;
    /**
     * @description 交办次数编号
     */
    private String seqCode;

    /**
     * @description 交办次数
     */
    private String seqName;

    /**
     * @description 收发状态
     */
    private String sendState;

    /**
     * @description 交办性质编号
     */
    private String sortCode;

    /**
     * @description 交办性质
     */
    private String sortName;

    /**
     * @description 办理方式编号
     */
    private String dealCode;

    /**
     * @description 办理方式
     */
    private Integer dealName;

    /**
     * @description 办理单位编号
     */
    private String sBDeptID;

    /**
     * @description 办理单位
     */
    private String sBDeptName;

    /**
     * @description 办理要求
     */
    private String sendDesc;

    /**
     * @description 办理回复时限
     */
    private String backLimit;

    /**
     * @description 派单单位编号
     */
    private String sDeptID;

    /**
     * @description 派单单位
     */
    private String sDeptName;

    /**
     * @description 派单人编号
     */
    private String sUserNo;

    /**
     * @description 派单人
     */
    private String sUserName;

    /**
     * @description 派单时间
     */
    private String sendTime;

    /**
     * @description 派发内容
     */
    private Integer sendRemark;

    /**
     * @description 直派标记
     */
    private LocalDateTime sAttachPath;

    /**
     * @description 签收时间
     */
    private LocalDateTime getTime;

    /**
     * @description 办理期限
     */
    private LocalDateTime promisesTime;

    /**
     * @description 回复标记
     */
    private String backState;

    /**
     * @description 回复人
     */
    private LocalDateTime getPerson;

    /**
     * @description 回复人电话
     */
    private Integer getPerTel;

    /**
     * @description 回复用户编号
     */
    private Integer bUserNo;

    /**
     * @description 回复用户
     */
    private String bUserName;

    /**
     * @description 回复单位
     */
    private String bDutyDept;

    /**
     * @description 回复单位电话
     */
    private Integer bDutyTel;

    /**
     * @description 回复时间
     */
    private String backTime;

    /**
     * @description 回复结果
     */
    private Integer backDesc;

    /**
     * @description 退回理由
     */
    private String backRemark;

}
