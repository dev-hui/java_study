package front.controllers;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ModelAndView implements Serializable {
	private String viewName;
	private Map<String, Object> model = new HashMap<>();
	
	public ModelAndView() {}	// 디폴트 생성자
	public ModelAndView(String viewName) {
		setViewName(viewName);
	}
	public ModelAndView(String viewName, String key, Object obj) {
		setViewName(viewName);
		addObject(key, obj);
	}
	
	public Map<String, Object> getModel() {
		return model;
	}
	
	public String getViewName() {
		return viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	
	public void addObject(String key, Object obj) {
		model.put(key, obj);
	}
}
