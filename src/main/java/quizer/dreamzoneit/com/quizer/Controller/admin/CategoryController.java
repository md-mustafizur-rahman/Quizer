package quizer.dreamzoneit.com.quizer.Controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import quizer.dreamzoneit.com.quizer.Model.Category;
import quizer.dreamzoneit.com.quizer.repository.CategoryRepo;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepo categoryRepo;
    @RequestMapping(value = "add-category",method = RequestMethod.GET)
    public  String add_category(){
        return "admin/pages/category/category";
    }

    @RequestMapping(value = "store-category", method = RequestMethod.POST)
    public  String store_category(@ModelAttribute Category category){

       categoryRepo.save(category);
        return "admin/pages/category/category";

    }
}
