package com.example.bankapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bankapp.model.Branch;
import com.example.bankapp.service.BranchService;

@Controller
@RequestMapping("/branches")
public class BranchController {
    @Autowired
    private BranchService branchService;

    @GetMapping
    public String listBranches(Model model) {
        List<Branch> branches = branchService.getAllBranches();
        model.addAttribute("branches", branches);
        return "branches/list";
    }

    @GetMapping("/new")
    public String createBranchForm(Model model) {
        model.addAttribute("branch", new Branch());
        return "branches/new";
    }

    @PostMapping
    public String saveBranch(@ModelAttribute Branch branch) {
        branchService.saveBranch(branch);
        return "redirect:/branches";
    }
}