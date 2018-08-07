package JsonParser;

import org.json.simple.*;
import org.json.simple.parser.*;

public class CategoryReader {
	JSONObject jo;
	
	public CategoryReader(String s) throws Exception {
		Object obj = new JSONParser().parse(s);
		
		jo = (JSONObject) obj;
	}
	
	public String getName() throws Exception{
		String name = null;
		
		name = (String) jo.get("Name");
		
		return name;
	}
	
	public Boolean getCanRelist() throws Exception {
		Boolean canRelist = null;
		
		canRelist = (Boolean) jo.get("CanRelist");
		
		return canRelist;
	}
	
	public String getPromoGalleryDesc() throws Exception {
		String promoGalleryDesc = null;
		
		JSONArray ja = (JSONArray) jo.get("Promotions");
		
		for (int i = 0; i<ja.size(); i++) {
			JSONObject obj2 = (JSONObject) ja.get(i);
			String name = (String)obj2.get("Name");
			if (name.equals("Gallery"))
				promoGalleryDesc = (String)obj2.get("Description");
		}
		
		
		return promoGalleryDesc;
	}
	
	
}
