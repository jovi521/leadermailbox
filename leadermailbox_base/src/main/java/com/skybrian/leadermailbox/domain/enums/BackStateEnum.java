package com.skybrian.leadermailbox.domain.enums;

/**
 * @Author jovi
 * @Date 2020/2/7 15:41
 * @Description 回复标记
 **/
public enum BackStateEnum {

    /**
     * @description 已回复
     */
    BACK_STATE_REPLIED(10),

    /**
     * @description 本级审查过
     */
    BACK_STATE_REVIEWED_AT_THIS_LEVEL(11),

    /**
     * @description 失败
     */
    BACK_STATE_FAILED(12),

    /**
     * @description 上级通过
     */
    BACK_STATE_SUPERIOR_PASSED(21),

    /**
     * @description 上级不通过
     */
    BACK_STATE_SUPERIOR_FAILED(22);

    private Integer flag;

    BackStateEnum(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return this.flag.toString();
    }

}
