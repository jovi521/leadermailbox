package com.skybrian.leadermailbox.config;

import com.fasterxml.classmate.ResolvedType;
import com.skybrian.leadermailbox.domain.enums.tel.StateFlagEnum;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.schema.Annotations;
import springfox.documentation.service.AllowableListValues;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.schema.ModelPropertyBuilderPlugin;
import springfox.documentation.spi.schema.contexts.ModelPropertyContext;
import springfox.documentation.swagger.schema.ApiModelProperties;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @Author jovi
 * @Date 2020/1/14 17:24
 * @Description Swagger视图下enum能直接显示值
 **/
@Configuration
public class CodedEnumPropertyPlugin implements ModelPropertyBuilderPlugin {

    @Override
    public void apply(ModelPropertyContext context) {
        Optional<ApiModelProperty> annotation = Optional.empty();

        if (context.getAnnotatedElement().isPresent()) {
            annotation = Optional.of(annotation.orElseGet(ApiModelProperties.findApiModePropertyAnnotation(context.getAnnotatedElement().get())::get));
        }
        if (context.getBeanPropertyDefinition().isPresent()) {
            annotation = Optional.of(annotation.orElseGet(Annotations.findPropertyAnnotation(
                    context.getBeanPropertyDefinition().get(), ApiModelProperty.class)::get));
        }
        final Class<?> rawPrimaryType = context.getBeanPropertyDefinition().get().getRawPrimaryType();
        //过滤得到目标类型
        if (annotation.isPresent() && StateFlagEnum.class.isAssignableFrom(rawPrimaryType)) {
            //获取CodedEnum的code值
            StateFlagEnum[] values = (StateFlagEnum[]) rawPrimaryType.getEnumConstants();
            final List<String> displayValues = Arrays.stream(values).map(StateFlagEnum::toString).collect(Collectors.toList());
            final AllowableListValues allowableListValues = new AllowableListValues(displayValues, rawPrimaryType.getTypeName());
            //固定设置为int类型
            final ResolvedType resolvedType = context.getResolver().resolve(String.class);
            context.getBuilder().allowableValues(allowableListValues).type(resolvedType);
        }
    }

    @Override
    public boolean supports(DocumentationType documentationType) {
        return true;
    }
}