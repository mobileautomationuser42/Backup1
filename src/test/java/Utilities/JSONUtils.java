package Utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import io.cucumber.core.internal.com.fasterxml.jackson.core.exc.StreamReadException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtils {
	 private static final String JSON_FILE_PATH = "src/main/resources/testdata/maxCharacterText.json";

	 public static JSONObject readJsonFile() {
	        try (FileReader reader = new FileReader(JSON_FILE_PATH)) {
	            JSONParser parser = new JSONParser();
	            return (JSONObject) parser.parse(reader);
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println("Error reading JSON file: " + e.getMessage());
	        }
	        return null;
	    }
	 
	 public static String getJsonValue(JSONObject jsonObject, String fieldName) {
	        if (jsonObject != null && jsonObject.containsKey(fieldName)) {
	            return jsonObject.get(fieldName).toString();
	        } else {
	            System.out.println("Field '" + fieldName + "' not found in JSON.");
	            return null;
	        }
	    }
	 
	 private static final String CHANGE_STATUS_FILE_PATH = "src/main/resources/testdata/changeStatusPendingData.json";

	 public static JSONObject readJsonFilee() {
	        try (FileReader reader = new FileReader(CHANGE_STATUS_FILE_PATH)) {
	            JSONParser parser = new JSONParser();
	            return (JSONObject) parser.parse(reader);
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println("Error reading JSON file: " + e.getMessage());
	        }
	        return null;
	    }
	 
	 private static final String MEDICAL_DATA_FILE_PATH = "src/main/resources/testdata/medicalData.json";

	 public static JSONObject readJsonMedicalFile() {
	     try (FileReader reader = new FileReader(MEDICAL_DATA_FILE_PATH)) {
	         JSONParser parser = new JSONParser();
	         return (JSONObject) parser.parse(reader);
	     } catch (Exception e) {
	         e.printStackTrace();
	         System.out.println("Error reading JSON file: " + e.getMessage());
	     }
	     return null;
	 }
	 
	 private static final String JSON_FILE_PATH_Color = "src/main/resources/testdata/colorConfig.json";
	 public static List<ColorConfig> configs;

	    public static List<ColorConfig> readColorJsonFile() throws StreamReadException, DatabindException, IOException {
	        ObjectMapper objectMapper = new ObjectMapper();
	        try {
	            configs = objectMapper.readValue(new File(JSON_FILE_PATH_Color),
	                objectMapper.getTypeFactory().constructCollectionType(List.class, ColorConfig.class));
	        } catch (IOException e) {
	            e.printStackTrace();
	            System.out.println("Error reading colorConfig.json: " + e.getMessage());
	        }
	        return configs;
	    }
	 }

