package com.example.practicestack.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * swagger 사용을 위한 Config 설정
 * Docket 객체를 생성해 줘야 함
 * ApiInfo 객체는 빌터패턴을 통해 필요한 부분만 골라서 생성 가능
 * 그리고 2.X 버전과 3.X버전은 찾아본 결과 스프링 부트버전과 유사하게 맞춰가야 하는것 같다
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.example.practicestack"))
                    .paths(PathSelectors.any())
                    .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("처음사용해보는 스웨거")
                .description("여기는 설명하는 부분")
                .version("1.0.0")
                .build();
    }
}

