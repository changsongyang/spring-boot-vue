package com.timebusker.web;

import com.timebusker.common.web.ResultVo;
import com.timebusker.model.MenuEntity;
import com.timebusker.service.MenuService;
import com.timebusker.utils.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @DESC:HomeController：首页控制层
 * @author:timebusker
 * @date:2019/7/26
 */
@Controller
@RequestMapping("/")
public class HomeController extends AbstractBaseController {

    @Autowired
    private MenuService menuService;

    @RequestMapping({"/", "", "/index", "/home"})
    public String index() {
        return "index";
    }

    @RequestMapping("/menus")
    @ResponseBody
    public ResultVo list() {
        Query query = new Query();
        query.put("systemId", "M_1208608669512634368");
        query.put("parentId", "0");
        List<MenuEntity> list = menuService.query(query);
        return ResultVo.ok().put("menus", list);
    }
}
