/**
 * 
 */
package co.grandcircus.famouslab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Mariah
 *
 */

@Controller
public class HallOfFameController {

	@Autowired
	ApiService apiService;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("tinyList", apiService.getAllTiny());
		return mav;
	}

	@RequestMapping("/complete")
	public ModelAndView complete() {
		ModelAndView mav = new ModelAndView("complete");
		mav.addObject("completeList", apiService.getAllComplete());
		return mav;
	}
	
}
