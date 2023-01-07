package com.example.practicestack.config;

import com.example.practicestack.interceptor.Interceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/*
* 1. Interceptor 사용을 위해선 인터셉터 클래스를 만들어 주입시켜줘야 해줘야 한다.
* 2. Interceptor 클래스는 HandlerInterceptor를 구현해줘야 한다.
* 3. 그리고 구현한 Interceptor를 WebMvcConfigurer를 구현한 config파일의
* addInterceptors의 매개변수 registry의 addInterceptor 메서드에 생성시켜 주입시킨다.
* 4. 그리고 여기서 인터셉터의 설정들을 추가할 수 있다.
* ex) addPathPatterns() = 해당 url에 대해선 interceptor가 적용
*     excludePathPatterns() = 해당 url에 대해 제외한다.
* */
@Slf4j
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Interceptor());
    }
}
