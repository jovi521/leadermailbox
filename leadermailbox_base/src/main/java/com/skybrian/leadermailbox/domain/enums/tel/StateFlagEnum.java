package com.skybrian.leadermailbox.domain.enums.tel;

import com.skybrian.leadermailbox.domain.enums.CodedEnum;

/**
 * @Author jovi
 * @Date 2020/1/15 17:04
 **/
//@ApiModel(value = "StateFlagEnum", description = "状态标记编号枚举类")
public enum StateFlagEnum implements CodedEnum {

    /**
     * @description 状态标记编号6个字段
     */
//    @ApiModelProperty(name = "STATE_FLAG_INVALID_CALL", value = "无效来电")
    STATE_FLAG_INVALID_CALL(132),

    //    @ApiModelProperty(name = "STATE_FLAG_REVIEW_WORK_ORDER", value = "审定工单")
    STATE_FLAG_REVIEW_WORK_ORDER(125),

    //    @ApiModelProperty(name = "STATE_FLAG_FINISH_ON_THE_SPOT", value = "当场办结")
    STATE_FLAG_FINISH_ON_THE_SPOT(131),

    //    @ApiModelProperty(name = "STATE_FLAG_DRAFT", value = "草稿")
    STATE_FLAG_DRAFT(101),

    //    @ApiModelProperty(name = "STATE_FLAG_SEAT_ANSWER", value = "坐席解答")
    STATE_FLAG_SEAT_ANSWER(136),

    //    @ApiModelProperty(name = "pkId", value = "转值班长处理")
    STATE_FLAG_SHIFT_MONITOR_HANDLE(120);

    private int flag;

    StateFlagEnum(int flag) {
        this.flag = flag;
    }

    @Override
    public int getCode() {
        return this.flag;
    }
}
