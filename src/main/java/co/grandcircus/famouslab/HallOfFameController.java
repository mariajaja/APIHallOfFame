/**
 * 
 */
package co.grandcircus.famouslab;

import java.util.List;

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
		List<Tiny> tinies = apiService.getAllTiny();
		mav.addObject("tinies", tinies);
		return mav;
	}

}
