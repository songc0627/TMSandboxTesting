package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import APIController.APIRequest;
import APIController.APIResponse;
import JsonParser.CategoryReader;


public class CategoryTest {
	
	private static final String URL = "https://api.tmsandbox.co.nz/";

	private static APIRequest request;

	@Before
	public void setUp() {
		/*
		 * Initialize RestExecutor object using the end point URL
		 */
		request = new APIRequest(URL);
	}
	
    @Test
    public void testSample() throws Exception {
    	String path = String.format("/v1/Categories/%s/Details.json?catalogue=false", 6327);

    	APIResponse response = request.get(path);
    	
    	CategoryReader cr = new CategoryReader(response.getResponseBody());
    	
    	assertEquals(cr.getName(), "Carbon credits");
    	assertEquals(cr.getCanRelist(), Boolean.TRUE);
    	
    	assertTrue(cr.getPromoGalleryDesc().contains("2x larger image"));
    }
	
}
