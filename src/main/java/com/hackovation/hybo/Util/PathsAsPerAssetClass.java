package com.hackovation.hybo.Util;

import java.util.HashMap;
import java.util.Map;

public class PathsAsPerAssetClass {

	public static Map<String, String> getETFPaths(){
		Map<String, String> map = new HashMap<>();
		map.put("CRSPTM1","D:\\Wkspace\\Hacovation\\CRSP US Total Market.txt");
		map.put("CRSPLC1","D:\\Wkspace\\Hacovation\\CRSP US Large Cap Value.txt");
		map.put("CRSPML1","D:\\Wkspace\\Hacovation\\CRSP US MID CAP VALUE.txt");
		map.put("CRSPSC1","D:\\Wkspace\\Hacovation\\CRSP US SMALL CAP VALUE.txt");
		map.put("SHV","D:\\Wkspace\\Hacovation\\SHV_CAP_VALUE.txt");
		map.put("LQD","D:\\Wkspace\\Hacovation\\LQD_CAP_VALUE.txt");
		return map;
	}
}
