package neskj.NeskjTgBot.Proxy;

import neskj.NeskjTgBot.Model.ApiResponse;
import neskj.NeskjTgBot.Model.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "Feign",url = "http://185.198.152.105:8086")
public interface Proxy {

    @PostMapping("/whatweather")
    ApiResponse getFromApi(City city);
}
