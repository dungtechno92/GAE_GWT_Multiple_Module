package com.lmt.hello.module2;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;

public class Module2 implements EntryPoint{
	
	public String name() {
		return "2 HEHE";
	}
	
	@Override
	public void onModuleLoad() {
		Window.alert("MODULE 2 running");
		
	}

}
