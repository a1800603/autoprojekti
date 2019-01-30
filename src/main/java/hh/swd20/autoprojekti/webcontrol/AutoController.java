package hh.swd20.autoprojekti.webcontrol;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.swd20.autoprojekti.domain.Auto;

@Controller
public class AutoController {
	
	//lähettää selaimeen tyhjän autolomakkeen
	@RequestMapping(value="/uusiauto", method=RequestMethod.GET)
	
	public String uusiAuto(Model model) {
		Auto auto1 = new Auto(); //luodaan uusi tyhjä auto-olio
		model.addAttribute("auto", auto1);
		return "newcar"; //newcar.html (Thymeleaf template)
	}
	
	//vastaanoottaa täytetyn lomakkeen tiedot
	@RequestMapping(value="/lisaaauto", method=RequestMethod.POST)
	
	public String lisaaAuto(@ModelAttribute Auto uusiauto, Model model) {
		model.addAttribute("auto", uusiauto);
		return "carview";
		
	}

}
