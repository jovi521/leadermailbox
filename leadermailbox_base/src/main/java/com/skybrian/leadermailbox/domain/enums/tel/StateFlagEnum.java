package com.skybrian.leadermailbox.domain.enums.tel;

/**
 * @Author jovi
 * @Date 2020/1/15 17:04
 * @Description 状态标记编号枚举类
 **/
public enum StateFlagEnum {

    /**
     * @description 状态标记编号6个字段
     */
    STATE_FLAG_INVALID_CALL(132),

    /**
     * @description 审定工单
     */
    STATE_FLAG_REVIEW_WORK_ORDER(125),

    /**
     * @description 当场办结
     */
    STATE_FLAG_FINISH_ON_THE_SPOT(131),

    /**
     * @description 草稿
     */
    STATE_FLAG_DRAFT(101),

    /**
     * @description 坐席解答
     */
    STATE_FLAG_SEAT_ANSWER(136),

    /**
     * @description 转值班长处理
     */
    STATE_FLAG_SHIFT_MONITOR_HANDLE(120);

    private Integer flag;

    StateFlagEnum(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return this.flag.toString();
    }
}
