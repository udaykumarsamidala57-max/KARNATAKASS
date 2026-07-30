package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.dao.OrganizationDao;
import com.example.demo.dao.ScholarshipDao;
import com.example.demo.entity.Organization;
import com.example.demo.entity.Scholarship;

@Controller
public class ScholarshipController {

    @Autowired
    private OrganizationDao organizationDao;

    @Autowired
    private ScholarshipDao scholarshipDao;

    // Test URL
    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "Railway is working";
    }

    // Home Page
    @GetMapping("/")
    public String home(Model model) {

        try {

            List<Organization> orgList =
                    organizationDao.findByStatusOrderByOrgName("Active");

            System.out.println("Organization Count : " + orgList.size());

            model.addAttribute("scholarship", new Scholarship());
            model.addAttribute("orgList", orgList);

            return "ScholarshipForm";

        } catch (Exception e) {

            e.printStackTrace();

            return "test";
        }
    }

    // Optional URL
    @GetMapping("/form")
    public String form(Model model) {

        try {

            List<Organization> orgList =
                    organizationDao.findByStatusOrderByOrgName("Active");

            model.addAttribute("scholarship", new Scholarship());
            model.addAttribute("orgList", orgList);

            return "ScholarshipForm";

        } catch (Exception e) {

            e.printStackTrace();

            return "test";
        }
    }

    // Save Scholarship
    @PostMapping("/saveScholarship")
    public String saveScholarship(

            @ModelAttribute("scholarship") Scholarship scholarship,

            @RequestParam(value = "fileMarksCard", required = false)
            MultipartFile fileMarksCard,

            @RequestParam(value = "filePassbook", required = false)
            MultipartFile filePassbook,

            RedirectAttributes redirectAttributes) {

        try {

            if (fileMarksCard != null && !fileMarksCard.isEmpty()) {
                scholarship.setPreviousAyMarksCard(fileMarksCard.getBytes());
            }

            if (filePassbook != null && !filePassbook.isEmpty()) {
                scholarship.setBankPassbookFirstPage(filePassbook.getBytes());
            }

            scholarshipDao.save(scholarship);

            redirectAttributes.addFlashAttribute(
                    "successMessage",
                    "Scholarship application saved successfully.");

        } catch (IOException e) {

            e.printStackTrace();

            redirectAttributes.addFlashAttribute(
                    "errorMessage",
                    "File upload failed.");
        }

        return "redirect:/";
    }
}