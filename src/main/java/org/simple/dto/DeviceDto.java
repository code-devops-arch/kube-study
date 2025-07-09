package org.simple.dto;
 
import java.util.Map;

public class DeviceDto  {
	private int categoryId;
	private int deviceId;
	private String deviceName;
	
	public DeviceDto(Map<String,String> map) {
		this.categoryId = Integer.valueOf(map.get("categoryId"));
		this.deviceId = Integer.valueOf(map.get("deviceId"));
		this.deviceName=map.get("deviceName");
	}
	
	public int getCategoryId() {
		return categoryId;
	}
	public int getDeviceId() {
		return deviceId;
	}
	public String getDeviceName() {
		return deviceName;
	}
	 
	

}
