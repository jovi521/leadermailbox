package com.skybrian.leadermailbox.domain.entity.tel;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @Author jovi
 * @Date 2020/1/15 17:04
 **/
@ApiModel(value = "TTelGetDeal", description = "来电记录")
@Entity
@Table(name = "t_tel_get_deal")
@org.hibernate.annotations.Table(appliesTo = "t_tel_get_deal", comment = "来电记录")
@Data
public class TTelGetDeal extends Model<TTelGetDeal> {

    @ApiModelProperty(name = "pkId", value = "主键", reference = "主键采用自动递增策略")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id", columnDefinition = "int COMMENT '主键'")
    @TableId
    private Integer pkId;

    @Column(name = "call_id", columnDefinition = "VARCHAR(100) COMMENT '呼叫ID'")
    @ApiModelProperty(name = "callId", value = "呼叫ID")
    private String callId;

    @Column(name = "lift_tel_no", columnDefinition = "VARCHAR(30) COMMENT '分机号'")
    @ApiModelProperty(name = "liftTelNo", value = "分机号")
    private String liftTelNo;

    @Column(name = "lift_work_no", columnDefinition = "VARCHAR(50) COMMENT '接听帐号'")
    @ApiModelProperty(name = "liftWorkNo", value = "接听帐号")
    private String liftWorkNo;

    @Column(length = 50)
    @ApiModelProperty(name = "liftWorker", value = "接听人")
    private String liftWorker;

    @ApiModelProperty(name = "fromTime", value = "来电时间")
    private LocalDateTime fromTime;

    @ApiModelProperty(name = "liftEnd", value = "结束时间")
    private LocalDateTime liftEnd;

    @ApiModelProperty(name = "liftLength", value = "时间长度")
    private Integer liftLength;

    @Column(length = 100)
    @ApiModelProperty(name = "tapeID", value = "录音ID")
    private String tapeID;

    @Column(length = 30)
    @ApiModelProperty(name = "fmAreaNo", value = "地区编号")
    private String fmAreaNo;

    @Column(length = 50)
    @ApiModelProperty(name = "fmAreaName", value = "地区名称")
    private String fmAreaName;

    @Column(length = 50)
    @ApiModelProperty(name = "fromName", value = "来话人名字")
    private String fromName;

    @Column(length = 10)
    @ApiModelProperty(name = "fromSex", value = "来话人性别")
    private String fromSex;

    @Column(length = 200)
    @ApiModelProperty(name = "fmAddress", value = "地址")
    private String fmAddress;

    @Column(length = 30)
    @ApiModelProperty(name = "fromTelA", value = "来电号码")
    private String fromTelA;

    @Column(length = 100)
    @ApiModelProperty(name = "fmEmail", value = "邮箱")
    private String fmEmail;

    @Column(length = 50)
    @ApiModelProperty(name = "fmCerName", value = "证件类型")
    private String fmCerName;

    @Column(length = 50)
    @ApiModelProperty(name = "fmCerNO", value = "证件号码")
    private String fmCerNO;

    @Lob
    @Column(columnDefinition = "TEXT")
    @ApiModelProperty(name = "fmContent", value = "来电内容")
    private String fmContent;

    @ApiModelProperty(name = "stateFlag", value = "状态标记编号", allowableValues = "132, 125, 131, 101, 136, 120")
    private Integer stateFlag;

    @Column(length = 100)
    @ApiModelProperty(name = "stateDesc", value = "状态标记名称")
    private String stateDesc;

    @Column(length = 30)
    @ApiModelProperty(name = "dFmClaNo", value = "来电类别编号")
    private String dFmClaNo;

    @Column(length = 50)
    @ApiModelProperty(name = "dFmClaName", value = "来电类别")
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

    @ApiModelProperty(name = "openX", value = "公开标记")
    private Integer openX;

    @ApiModelProperty(name = "xInputTime", value = "处理时间")
    private LocalDateTime xInputTime;

    @Column(length = 4000)
    @ApiModelProperty(name = "xDealDesc", value = "处理描述")
    private String xDealDesc;

    @Column(length = 2000)
    @ApiModelProperty(name = "xSysDesc", value = "处理备注")
    private String xSysDesc;

    @Column(length = 50)
    @ApiModelProperty(name = "yWorkNo", value = "工单创建人编号")
    private String yWorkNo;

    @Column(length = 50)
    @ApiModelProperty(name = "yWorker", value = "工单创建人")
    private String yWorker;

    @ApiModelProperty(name = "yEditTime", value = "工单创建时间")
    private LocalDateTime yEditTime;

    @Column(length = 200)
    @ApiModelProperty(name = "wfSltKey", value = "工单主题")
    private String wfSltKey;

    @ApiModelProperty(name = "wkFmFlag", value = "创建工单标记", example = "1")
    private Integer wkFmFlag;

    @Column(length = 50)
    @ApiModelProperty(name = "wkFmNO", value = "工单编号")
    private String wkFmNO;

    @ApiModelProperty(name = "wkPkId", value = "工单ID")
    private Integer wkPkId;

}
