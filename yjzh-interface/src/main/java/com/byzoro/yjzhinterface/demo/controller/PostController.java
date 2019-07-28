package com.byzoro.yjzhinterface.demo.controller;


import com.byzoro.yjzhinterface.demo.pojo.Result;
import com.byzoro.yjzhinterface.demo.service.YjzhService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @Description: 底层业务接口类
 * @Param:
 * @return:
 * @Author:xiaopang
 * @Date:2019/7/15
 */
@RestController
public class PostController {
    @Resource
    private YjzhService yjzhService;

    /**
     * @Description: 根据intFid+id定义接口业务
     * @Param:[id, postStr]
     * @return:java.lang.String
     * @Author:xiaopang
     * @Date:2019/7/15
     */
    @RequestMapping("/{intFid}/{id}")
    public Result getData(@PathVariable("intFid") String intFid,
                          @PathVariable("id") String id,
                          @RequestBody String postStr
                          ) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        String format = sdf.format(new Date());
        System.out.println(postStr);
        Result result = new Result();
        result.setTimeStamp(format);
        try {
            // TODO: 2019/7/15 根据业务
            String topic = intFid;
            yjzhService.insertKafka(topic, postStr);
            result.setErrorCode("0");
            result.setErrorMsg("success");
        }catch (Exception e){
            result.setErrorCode("1");
            result.setErrorMsg("fail");
        }
//        Boolean aBoolean = StringUtil.checkData(postStr);
//        System.out.println(aBoolean);
//        System.out.println(StringUtil.getResult(postStr));
        return result;
    }
}
