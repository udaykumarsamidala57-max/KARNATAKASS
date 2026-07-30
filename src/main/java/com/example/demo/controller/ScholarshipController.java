package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.dao.OrganizationDao;
import com.example.demo.dao.ScholarshipDao;
import com.example.demo.entity.Scholarship;

import java.io.IOException;

@Controller
public class ScholarshipController {

    @Autowired
    private OrganizationDao organizationDao;

    @Autowired
    private ScholarshipDao scholarshipDao;

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "Railway is working";
    }

    
    @GetMapping("/form")
    public String scholarshipForm(Model model) {
        model.addAttribute("orgList", organizationDao.findByStatusOrderByOrgName("Active"));
        return "SholarshipForm";
    }

    @PostMapping("/saveScholarship")
    public String saveScholarship(@ModelAttribute Scholarship scholarship,
                                  @RequestParam(value = "fileMarksCard", required = false) MultipartFile fileMarksCard,
                                  @RequestParam(value = "filePassbook", required = false) MultipartFile filePassbook,
                                  RedirectAttributes redirectAttributes) {
        try {
            // Handle file attachments if present
            if (fileMarksCard != null && !fileMarksCard.isEmpty()) {
                scholarship.setPreviousAyMarksCard(fileMarksCard.getBytes());
            }
            if (filePassbook != null && !filePassbook.isEmpty()) {
                scholarship.setBankPassbookFirstPage(filePassbook.getBytes());
            }

            // Save entity to MySQL via JPA Repository
            scholarshipDao.save(scholarship);

            redirectAttributes.addFlashAttribute("successMessage", "Scholarship application saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("errorMessage", "Failed to save scholarship due to file processing error.");
        }

        return "redirect:/";
    }
}