package max.spring.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import max.spring.dal.HolidayRepository;

@Controller
public class HolidayController {
	@Autowired
	private HolidayRepository holidays;
	
	@GetMapping("/holiday")
	public String holiday(@RequestParam(name="name", required=false, defaultValue="TW") String name, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("holidays", holidays.findByCountry(name));
		return "holiday";
	}
}
