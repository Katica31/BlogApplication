package com.elsoBlog.Controller;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.elsoBlog.domain.Story;

@Controller 
public class HomeController{ 
											   			//A Model visz át infót a back-ről/re a frontend-ről/re
											   			//addAtribute értékei: ("megszólítás", "amit át akarok vinni tartalom")
	@RequestMapping("/")					   			// html megfelelő tegjébe beillesztve: th: text="${pageTitle}"
	public String stories(Model model){ 	   			// css helyének megadása: th:href"@{../static/css/main.css}"  href="
		model.addAttribute("pageTitle", "Minden napra egy recept");
		model.addAttribute("stories",getStories());    // html tagbe berakni: th:each="story : ${stories}"
		return "stories";  			          
	}
		
	@RequestMapping("/user/{id}")
	public String searchForUser(@PathVariable(value = "id") String id) throws Exception{
		if(id == null){
			throw new Exception("Nincs ilyen id-val felhasználó!");
		}
		
		return "user";  //user oldalra oldalra irányít (még megírandó)
	}
	
	@ExceptionHandler(Exception.class)
	public String exceptionHandler(HttpServletRequest rA, Exception ex, Model model){
		model.addAttribute("errMessage", ex.getMessage());
		return "exceptionHandler";   //exceptionHandler oldalra irányít (még megírandó)
	}
	
	
													      //mivel az osztály annotációja @Controller
	private ArrayList<Story> getStories(){			     //ezért a stories-nél egy nézetet keres a templatesben, amit
		ArrayList<Story> stories = new ArrayList<>();    // meg tud jeleníteni. Ha RestController lenne nem működne
	
		Story story1 = new Story();
		story1.setAuthor("director: Matt Reeves");
		story1.setTitle("Spiderman - No way home (2021)");
		story1.setPosted(new Date());					// html tagbe: th:text="${#dates.format(story.posted, 'YYYY.MM.dd')}"
		story1.setContent("<div>In the film, Parker asks Dr. Stephen Strange <br/>" 
				+ "(Cumberbatch) to use magic to make his identity as Spider-Man <br/>"
				+ " a secret again following its public revelation at the end <br/>"
				+ " of Far From Home. When the spell goes wrong, the multiverse <br/>"
				+ " is broken open, which allows visitors from alternate <br/>"
				+ " realities to enter Parker's universe.</div>");
		
		Story story2 = new Story();
		story2.setAuthor("Frédi");
		story2.setTitle("Batman (2022)");
		story2.setPosted(new Date());
		story2.setContent("<div> On Halloween, Gotham City mayor Don Mitchell Jr. <br/>"
				+ " is murdered by a serial killer calling himself the Riddler. <br/>"
				+ " Billionaire Bruce Wayne, who has operated for two years as the <br/>"
				+ " vigilante Batman, investigates alongside the Gotham <br/>"
				+ " City Police Department (GCPD).</div>");
		
		stories.add(story1);
		stories.add(story2);
		
		return stories;
	
	}
												
									          
	
	
}