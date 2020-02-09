package com.skybrian.leadermailbox.domain.enums;

/**
 * @Author jovi
 * @Date 2020/2/7 12:21
 * @Description 满意度标志
 **/
public enum RecordFlagEnum {

    /**
     * @description 不满意
     */
    RECORD_FLAG_DISSATISFACTION(20),

    /**
     * @description 评价满意
     */
    RECORD_FLAG_SATISFACTION_EVALUATION(22),

    /**
     * @description 网评满意
     */
    RECORD_FLAG_SATISFACTION_ONLINE_REVIEW(23),

    /**
     * @description 未评价
     */
    RECORD_FLAG_NOT_EVALUATION(10),

    /**
     * @description 未回访
     */
    RECORD_FLAG_NOT_RETURN_VISIT(0);

    private Integer flag;

    RecordFlagEnum(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return this.flag.toString();
    }

}
