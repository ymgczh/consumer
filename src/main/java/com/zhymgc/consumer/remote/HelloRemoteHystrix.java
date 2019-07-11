package com.zhymgc.consumer.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * simple description
 *
 * @Description: java class description
 * @Author: 张昊
 * @CreateDate: 2019/7/11 9:57
 * @Version: 1.0
 * <p>Copyright: 内蒙古金财信息技术有限公司 (c) 2019</p>
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String helloPerson(@RequestParam("name") String name) {
        return "hello" +name+", this messge send failed ";
    }
}
