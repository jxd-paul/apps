package com.qxl.apps.drinks.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.qxl.apps.drinks.system.model.DrinksWaitDo;
import com.qxl.apps.drinks.system.service.IWaitDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/waitDo")
public class WaitDoController {
    private final IWaitDoService waitDoService;

    @Autowired
    public WaitDoController(IWaitDoService waitDoService) {
        this.waitDoService = waitDoService;
    }
    @RequestMapping("/getAll")
    @ResponseBody
    public JSONObject getAll(String name, String date){
        JSONObject json = new JSONObject();
        List<DrinksWaitDo> list = waitDoService.getAllWaitDo(name==null?"":name,date==null?"":date);
        json.put("list",list);
        return json;
    }
    @RequestMapping("/showDetail")
    @ResponseBody
    public JSONObject showDetail(String id){
        JSONObject json = new JSONObject();
        DrinksWaitDo waitDo = waitDoService.showDetail(id);
        json.put("detail",waitDo);
        return  json;
    }
    public JSONObject submit(){
        JSONObject json = new JSONObject();
        json.put("code","200");
        return json;
    }
}
