package com.skybrian.leadermailbox.domain.enums;

/**
 * @Author jovi
 * @Date 2020/2/7 16:31
 * @Description 同步标记
 **/
public enum WsUFlagEnum {

    /**
     * @description 未执行
     */
    WSU_FLAG_NOT_IMPLEMENT(1),

    /**
     * @description 执行过
     */
    WSU_FLAG_IMPLEMENTED(2);

    private Integer flag;

    WsUFlagEnum(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return this.flag.toString();
    }

}
