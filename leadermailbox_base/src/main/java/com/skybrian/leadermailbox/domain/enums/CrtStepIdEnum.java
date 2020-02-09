package com.skybrian.leadermailbox.domain.enums;

/**
 * @Author jovi
 * @Date 2020/2/7 11:37
 * @Description 工单状态编号
 **/
public enum CrtStepIdEnum {

    /**
     * @description 创建工单
     */
    CRT_STEP_ID_CREATE_WORK_ORDER(100),

    /**
     * @description 强制结束
     */
    CRT_STEP_ID_FORCED_END(960),

    /**
     * @description 归档（评价满意）
     */
    CRT_STEP_ID_PLACE_ON_FILE_SAT(950),

    /**
     * @description 市级主办退回
     */
    CRT_STEP_ID_MUNICIPAL_SPONSORS_RETURN(401),

    /**
     * @description 市级部门处理
     */
    CRT_STEP_ID_MUNICIPAL_DEPARTMENT_PROCESSING(400),

    /**
     * @description 待回访
     */
    CRT_STEP_ID_TO_RETURN(900),

    /**
     * @description 回访失败
     */
    CRT_STEP_ID_RETURN_VISIT_FAILED(901),

    /**
     * @description 归档
     */
    CRT_STEP_ID_PLACE_ON_FILE(950),

    /**
     * @description 已答复
     */
    CRT_STEP_ID_ANSWERED(-8),

    /**
     * @description 待市级部门审查
     */
    CRT_STEP_ID_TO_BE_REVIEWED_BY_THE_MUNICIPAL_DEP(800),

    /**
     * @description 回访不满意
     */
    CRT_STEP_ID_TO_RETURN_VISIT_DISSATISFACTION(905);

    private Integer flag;

    CrtStepIdEnum(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return this.flag.toString();
    }

}
