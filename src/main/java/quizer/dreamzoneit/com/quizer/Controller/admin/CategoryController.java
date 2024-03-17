package quizer.dreamzoneit.com.quizer.Controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import quizer.dreamzoneit.com.quizer.Model.Category;
import quizer.dreamzoneit.com.quizer.repository.CategoryRepo;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepo categoryRepo;
    @RequestMapping(value = "add-category", method = RequestMethod.GET)
    public ModelAndView getCategoryForm() {
        ModelAndView modelAndView = new ModelAndView();

        // Fetch categories from the repository
        List<Category> categories = categoryRepo.findAll();
        modelAndView.addObject("categories", categories);
        modelAndView.setViewName("admin/pages/category/category");
        return modelAndView;
    }

    @RequestMapping(value = "store-category", method = RequestMethod.POST)
    public  String store_category(@ModelAttribute Category category){

       categoryRepo.save(category);
        return "redirect:add-category";

    }
    @RequestMapping(value = "delete-category/{id}", method = RequestMethod.GET)
    public  String delete_category(@PathVariable int id){
        categoryRepo.deleteById(id);
        return "redirect:/add-category";

    }


}
