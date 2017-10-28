package com.pizzareviews;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	@Resource
	ReviewRepository repository = new ReviewRepository();

	@RequestMapping("/reviewList")
	public String getAllCourses(Model model) {
		model.addAttribute("reviews", repository.findAll());
		return "reviews2"; // the html page
	}

	@RequestMapping("/singleReview")
	public String getOneCourse(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("review", repository.findOne(id));
		return "review"; // the html page
	}

}
