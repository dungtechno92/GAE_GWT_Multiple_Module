package com.lmt.hello.module1;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;

public class Module1 implements EntryPoint{
	
	public String name() {
		return "1 HEHE";
	}

	@Override
	public void onModuleLoad() {
		Window.alert("MODULE 1 running");
		
	}

}
