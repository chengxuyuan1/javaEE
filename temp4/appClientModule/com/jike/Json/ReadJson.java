package com.jike.Json;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class ReadJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			JsonParser parser=new JsonParser();
			JsonObject object=(JsonObject) parser.parse(new FileReader("test.json"));
			System.out.println("cat="+object.get("cat").getAsString());
			System.out.println("pop="+object.get("pop").getAsBoolean());
			
			JsonArray jsonArray=object.get("languages").getAsJsonArray();
			for (int i = 0; i < jsonArray.size(); i++) {
				System.out.println("------------------");
				JsonObject subObject=jsonArray.get(i).getAsJsonObject();
				System.out.println("name="+subObject.get("name").getAsString());
				System.out.println("ide="+subObject.get("ide").getAsString());
			}
			
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
