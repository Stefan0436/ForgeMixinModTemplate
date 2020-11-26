package com.example.examplemod;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.google.common.io.Resources;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public final class ModInfo {
	
	public static final JsonObject JSON =  new JsonParser().parse(readJSON()).getAsJsonObject();
	public static final String readJSON()
	{
		try {
			return Resources.toString(Resources.getResource("modinfo.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			return "{}";
		}
	}
	
	public static final String MODID = JSON.get("modid").getAsString();
}
