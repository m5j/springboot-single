package com.minwujun.springbootsingle.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.minwujun.springbootsingle.exception.BizException;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 对controller做增强操作，自动把返回数据包装成统一返回体（Result）
 */
@RestControllerAdvice(basePackages = {"com.minwujun.springbootdemo.controller"})
public class ResponseControllerAdvice implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> aClass) {
        // 如果接口返回的类型本身就是ResultVO那就没有必要进行额外的操作，返回false
        return !returnType.getGenericParameterType().equals(Result.class);
    }

    @Override
    public Object beforeBodyWrite(Object data,
                                  MethodParameter returnType,
                                  MediaType mediaType,
                                  Class<? extends HttpMessageConverter<?>> aClass,
                                  ServerHttpRequest serverHttpRequest,
                                  ServerHttpResponse serverHttpResponse) {
        // String类型不能直接包装，所以要进行些特别的处理
        if (returnType.getGenericParameterType().equals(String.class)) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                // 将数据包装在Result里后，再转换为json字符串响应给前端
                return objectMapper.writeValueAsString(new Result<>(data));
            } catch (JsonProcessingException e) {
                throw new BizException("返回String类型错误");
            }
        }
        // 将原本的数据包装在Result里
        return new Result<>(data);
    }
}
