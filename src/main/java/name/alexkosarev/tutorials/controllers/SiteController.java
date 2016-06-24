package name.alexkosarev.tutorials.controllers;

import java.util.Collections;
import java.util.Date;
import name.alexkosarev.tutorials.entities.Review;
import name.alexkosarev.tutorials.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class SiteController {

    @Autowired
    private ReviewRepository reviewRepository;

    @RequestMapping
    public ModelAndView index() {
        return new ModelAndView("site/index", Collections.singletonMap("reviews", reviewRepository.findAll()));
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createReview(@RequestParam String reviewText) {
        reviewRepository.save(new Review(reviewText, new Date()));

        return "redirect:/";
    }
}
