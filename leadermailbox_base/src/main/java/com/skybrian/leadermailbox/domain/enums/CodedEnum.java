package com.skybrian.leadermailbox.domain.enums;

import java.util.Arrays;
import java.util.Optional;

/**
 * @Author jovi
 * @Date 2020/2/6 17:04
 **/
public interface CodedEnum {
    /**
     * 所有枚举类实现此方法，用来获取枚举字段的实际指定值
     *
     * @param enumClass
     * @param code
     * @param <E>
     * @return
     */
    static <E extends Enum<?> & CodedEnum> Optional<E> codeOf(Class<E> enumClass, int code) {
        return Arrays.stream(enumClass.getEnumConstants()).filter(e -> e.getCode() == code).findAny();
    }

    /**
     * 用来获取枚举字段的实际指定值
     *
     * @return
     */
    int getCode();
}
