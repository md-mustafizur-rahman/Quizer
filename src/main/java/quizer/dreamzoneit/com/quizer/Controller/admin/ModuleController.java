package quizer.dreamzoneit.com.quizer.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ModuleController {
    @RequestMapping(value = "/add-module",method = RequestMethod.GET)
    public  String AddModule(){
        return "admin/pages/module/add_module";
    }
}
