package com.zhymgc.consumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * simple description
 *
 * @Description: java class description
 * @Author: 张昊
 * @CreateDate: 2019/7/11 9:12
 * @Version: 1.0
 * <p>Copyright: 内蒙古金财信息技术有限公司 (c) 2019</p>
 */
@FeignClient(name = "zhymgc-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping("/helloPerson")
    String helloPerson(@RequestParam(value = "name") String name);
}
