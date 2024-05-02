package com.data.buspass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.data.buspass.model.StudentData;
import com.data.buspass.model.UserData;
import com.data.buspass.service.PassService;

@Controller
public class PassController {

	@Autowired
	private PassService service;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/aboutPage")
	public String about() {
		return "about";
	}

	@GetMapping("/contactPage")
	public String contact() {
		return "contact";
	}

	@GetMapping("/passTypePage")
	public String passType() {
		return "passType";
	}

	@GetMapping("/loginPageDirect")
	public String loginPage() {
		return "loginPage";
	}

	@GetMapping("/registerPageDirect")
	public String registerPage() {
		return "registerPage";
	}

	@GetMapping("/studentRegisterDirect")
	public String studentRegister() {
		return "studentRegister";
	}

	@GetMapping("/seniorRegisterDirect")
	public String seniorRegister() {
		return "seniorRegister";
	}

	@GetMapping("/allRouteRegisterDirect")
	public String allRouteRegister() {
		return "allRouteRegister";
	}

	@GetMapping("/uploadDocsDirect")
	public String uploadDocsd() {
		return "uploadDocs";
	}
	
	@GetMapping("/preview1Direct")
	public String preview1() {
		return "preview1";
	}
	
	@GetMapping("/preview2Direct")
	public String preview2() {
		return "preview2";
	}
	
	@GetMapping("/preview3Direct")
	public String preview3() {
		return "preview3";
	}
	
	@PostMapping("/direct")
	public String passDirect(@ModelAttribute StudentData sdata) {
		service.save(sdata);
		return "redirect:/preview1Direct";
	}

	@PostMapping("/saveAndRedirect")
	public String saveAndRedirect(@ModelAttribute UserData user) {
		service.save(user); // Save user data into the database
		return "redirect:/uploadDocsDirect"; // Redirect to the docsUpload page
	}

	@PostMapping("/save")
	public String addUser(@ModelAttribute UserData user) {
		service.save(user);
		return "redirect:/passTypePage";
	}

	@PostMapping("/studentSave")
    public String addStudent(@ModelAttribute StudentData studentData) {
        int generatedId = generateUniqueID(); // Generate unique ID
        studentData.setRegid(generatedId); // Set the generated ID
        service.save(studentData); // Save student data into the database
        return "redirect:/passTypePage";
    }
	 private int generateUniqueID() {
	        // Assuming you want a 6-digit random number
	        return (int) ((Math.random() * (999999 - 100000)) + 100000);
	    }


	@PostMapping("/fileUploadDirect")
	public String savedocuments(@RequestParam("photo") MultipartFile photo,
			@RequestParam("selfIdentity") MultipartFile selfIdentity,
			@RequestParam("clgIdentity") MultipartFile clgIdentity) {
		service.saveFile(photo);
		service.saveFile(selfIdentity);
		service.saveFile(clgIdentity);
		return "redirect:/passTypePage";
	}

}
