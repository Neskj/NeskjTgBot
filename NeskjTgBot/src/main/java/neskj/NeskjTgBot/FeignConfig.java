package neskj.NeskjTgBot;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "neskj.NeskjTgBot.Proxy")
public class FeignConfig {
}
