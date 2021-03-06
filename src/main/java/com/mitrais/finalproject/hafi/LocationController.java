package com.mitrais.finalproject.hafi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 
 * @author trainee Hafi
 * Location Controller
 */
@Controller
public class LocationController {
	@Autowired
	LocationRepository lr;
	/**
	 * get method to get location from database
	 * @return Iterable<location>
	 */
	@RequestMapping(value="/locations", method=RequestMethod.GET)
	@ResponseBody
	public Iterable<Location> getLocations(){
		return lr.findAll();
	}
}
