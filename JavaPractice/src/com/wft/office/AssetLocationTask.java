package com.wft.office;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AssetLocationTask {
	
	public static void main(String args[]){
		
		BufferedReader br = null;
		
		try {
			 
			String sCurrentLine;
			
 
			br = new BufferedReader(new FileReader("C:\\Users\\tushars5\\Desktop\\Location.txt"));
            int i = 0;
			List<Data> list = new ArrayList<Data>();
			Data data;
			
			while ((sCurrentLine = br.readLine()) != null) {
				
				//System.out.println(sCurrentLine.indexOf('{'));
				
				if(sCurrentLine.contains("{")){
					data = new Data();
				}
				else if(sCurrentLine.contains("title:")){
					String title = sCurrentLine.substring(sCurrentLine.indexOf(':')+3, sCurrentLine.indexOf(',')-1);
					//System.out.println(title);
				}
				else if(sCurrentLine.contains("description:")){
					System.out.println(sCurrentLine.substring(sCurrentLine.indexOf(':')+3, sCurrentLine.lastIndexOf('\"')));
					
					
				}/*
				else if(sCurrentLine.contains("svgPath:")){
					data.setSvgPath(svgPath);
				}
                else if(sCurrentLine.contains("latitude:")){
					data.setLatitude(latitude);
				}
				else if(sCurrentLine.contains("longitude:")){
					data.setLongitude(longitude);
				}
				else if(sCurrentLine.contains("zoomLevel:")){
					
				}
				else if(sCurrentLine.contains("latitude:")){
					
				}
				else if(sCurrentLine.contains("scale:")){
					
				}
				else if(sCurrentLine.contains("color:")){
					
				}
				else if(sCurrentLine.contains("}")){
					
				}*/
					
				System.out.println(sCurrentLine);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}

class Data{
	String title = null;
	String description = null;
	String svgPath = null ;
	String latitude = null;
	String longitude = null;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSvgPath() {
		return svgPath;
	}
	public void setSvgPath(String svgPath) {
		this.svgPath = svgPath;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getZoomLevel() {
		return zoomLevel;
	}
	public void setZoomLevel(String zoomLevel) {
		this.zoomLevel = zoomLevel;
	}
	public String getScale() {
		return scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	String zoomLevel = null;
	String scale = null;
	String color = null;
}
