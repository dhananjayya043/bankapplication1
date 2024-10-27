package com.example.bankapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bankapp.model.Admin;
import com.example.bankapp.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/dashboard")
    public String dashboard() {
        return "admin/dashboard";
    }

    @GetMapping("/new")
    public String createAdminForm(Model model) {
        model.addAttribute("admin", new Admin());
        return "admin/new";
    }

    @PostMapping("/new")
    public String saveAdmin(@ModelAttribute Admin admin) {
        adminService.saveAdmin(admin);
        return "redirect:/admin/dashboard";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "admin/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute Admin admin, Model model) {
        Admin foundAdmin = adminService.findByUsername(admin.getUsername());
        if (foundAdmin != null && foundAdmin.getPassword().equals(admin.getPassword())) {
            return "redirect:/admin/dashboard";
        }
        model.addAttribute("error", "Invalid credentials");
        return "admin/login";
    }
}