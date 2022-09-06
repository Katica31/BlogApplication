package com.elsoBlog.Controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		
													      //mivel az osztály annotációja @Controller
	private ArrayList<Story> getStories(){			     //ezért a stories-nél egy nézetet keres a templatesben, amit
		ArrayList<Story> stories = new ArrayList<>();    //amit meg tudna jeleníteni. Ha RestController lenne nem működne
	
		Story story1 = new Story();
		story1.setAuthor("Gizella");
		story1.setTitle("Gizella vagyok a gazella");
		story1.setLatestDate(new Date());					// html tagbe: th:text="${#dates.format(story.posted, 'YYYY.MM.dd')}"
		story1.setContent("Népszerű voltam ezzel a névvel");
		
		Story story2 = new Story();
		story2.setAuthor("Frédi");
		story2.setTitle("Barátság");
		story2.setLatestDate(new Date());
		story2.setContent("Béni igazán jófej");
		
		stories.add(story1);
		stories.add(story2);
		
		return stories;
	
	}
												
									          
	
	
}