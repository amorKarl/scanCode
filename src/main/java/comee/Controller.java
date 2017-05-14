package comee;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/3/003.
 */
@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(value = "/get")
    @ResponseBody
    public Map get(HttpServletResponse response){

       Map map=new HashMap();
       map.put("name","李佳奇");
       map.put("age",18);
       return map;
    }
}
