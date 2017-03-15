package crudtest.controller;

import crudtest.model.User;
import crudtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping ("/")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    MessageSource messageSource;

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public String listUsers(@RequestParam(value="page", required = false) Integer page, Model model) {
        if (page == null)
            page = 1;
        model.addAttribute("listUsers", userService.listUsers(page));
        model.addAttribute("page", page);
        return "users";
    }

    @RequestMapping(value = "users/add", method = RequestMethod.GET)
    public String addUser(ModelMap model) {
        User user=new User();
        model.addAttribute("user",user);
        model.addAttribute("edit",false);
        return "adduser";
    }

    @RequestMapping(value = "users/add", method = RequestMethod.POST)
    public String addUser(User user, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "adduser";
        }
        userService.addUser(user);
        model.addAttribute("success", "User " + user.getName() + " add successfully");
        return "addok";
    }

    @RequestMapping("remove/{id}")
    public String removeUser(@PathVariable("id") long id) {
        this.userService.removeUser(id);
        return "redirect:/users";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    public String editUser(@PathVariable long id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        model.addAttribute("edit", true);
        return "adduser";
    }
    @RequestMapping(value = "edit/{id}", method = RequestMethod.POST)
    public String editUser( User user, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "adduser";
        }
        userService.updateUser(user);
        model.addAttribute("success", "User " + user.getName() + " updated successfully");
        return "addok";
    }


    @RequestMapping(value="users", method = RequestMethod.POST)
    public String searchResults(@ModelAttribute("user") User user, Model model) {
        List<User> searchResult = userService.findUser(user.getName());
        model.addAttribute("listUsers", searchResult);
        return "findlist";
    }

}
