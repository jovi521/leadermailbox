package com.skybrian.leadermailbox.domain.enums;

/**
 * @Author jovi
 * @Date 2020/2/7 14:42
 * @Description 收发状态
 **/
public enum SendStateEnum {

    /**
     * @description 未签收
     */
    SEND_STATE_NOT_SIGN(10),

    /**
     * @description 再次发送
     */
    SEND_STATE_RESEND(11),

    /**
     * @description 签收
     */
    SEND_STATE_SIGN(21),

    /**
     * @description 待派下级
     */
    SEND_STATE_TO_BE_SENT_SUBORDINATE(22),

    /**
     * @description 已派下级
     */
    SEND_STATE_BE_SENT_SUBORDINATE(23),

    /**
     * @description 撤回
     */
    SEND_STATE_WITHDRAW(30),

    /**
     * @description 退回
     */
    SEND_STATE_RETURN(40),

    /**
     * @description 退回审核
     */
    SEND_STATE_RETURN_REVIEW(50),

    /**
     * @description 拒退
     */
    SEND_STATE_RETURN_REFUSE(51);

    private Integer flag;

    SendStateEnum(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return this.flag.toString();
    }

}
