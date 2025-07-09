package org.simple.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import org.simple.dto.DeviceDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple")
@CrossOrigin(origins = "http://localhost:4200")

public class SimpleController {
	@GetMapping("/welcome")
	public ResponseEntity<String> getResponse(){
		return new ResponseEntity<String>("Application is Up", HttpStatus.OK);
	}
	
	@GetMapping("/{categoryId}/list/devices")
	public List<DeviceDto> getDeviceList(@PathVariable("categoryId") String categoryId){
		
		Map<String,String> map = new HashMap<>();
		map.put("categoryId","1");
		map.put("deviceId","2");
		map.put("deviceName", "TV");
	 List<DeviceDto> list = new ArrayList<>();
	 
	 list.add(new DeviceDto(map));
		
		
		   return  list;
		
		
	}

}
