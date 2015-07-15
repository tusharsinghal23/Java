package com.wft.office;

import java.util.*;

public class WFTTask {
	
	public static void main(String args[]){
		
		Map<String, String> initdata = new HashMap<String, String>();
		
		initdata.put("2324","WFT_Document");
		initdata.put("2325","WFT_Document");
		initdata.put("2326","WFT_Document");
		initdata.put("2327","WFT_Document");
		initdata.put("2328","WFT_Document");
		initdata.put("2329","WFT_Document");
		initdata.put("23211","WFT_Document");
		initdata.put("23212","WFT_Document");
		initdata.put("23215","WFT_Document");
		
		for (Map.Entry<String, String> entry : initdata.entrySet())
		{
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
		Set<String> setValue = new HashSet<String>();
		
		setValue.add("TSS");
		setValue.add("TSS");
		setValue.add("Real Result");
		setValue.add("Real Result");
		
		Iterator iter = setValue.iterator();
		while (iter.hasNext()) {
		    System.out.println(iter.next());
		}
		
		
		Map<String,String> finalData = new LinkedHashMap<String,String>();
		
		finalData.put("321", "Tus");
		finalData.put("323", "Tus3");
		finalData.put("324", "Tus2");
		finalData.put("325", "Tus4");
		
		for (Map.Entry<String, String> entry : finalData.entrySet())
		{
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}	
		
		
		
		
		
		
		
		
	}

}
