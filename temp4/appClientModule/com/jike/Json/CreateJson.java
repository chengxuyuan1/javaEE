package com.jike.Json;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class CreateJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonObject object=new JsonObject();
		object.addProperty("cat", "it");
		
		JsonArray array=new JsonArray();
		
		JsonObject lan1=new JsonObject();
		lan1.addProperty("id", 1);
		lan1.addProperty("name", "java");
		lan1.addProperty("ide", "eclips");
		array.add(lan1);
		
		JsonObject lan2=new JsonObject();
		lan2.addProperty("id", 2);
		lan2.addProperty("name", "swift");
		lan2.addProperty("ide", "xcode");
		array.add(lan2);
		
		JsonObject lan3=new JsonObject();
		lan3.addProperty("id", 3);
		lan3.addProperty("name", "c#");
		lan3.addProperty("ide", "visual studio");
		array.add(lan3);
		
		object.add("languages", array);
		object.addProperty("pop", true);
		
		System.out.println(object.toString());
		
	}

}
