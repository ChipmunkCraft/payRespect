package com.tibthink.payRespect.Utils;


import org.bukkit.ChatColor;

public class Utils {

	public static String chat(String s) {
		return ChatColor.translateAlternateColorCodes('&', s);

	}

    public static String[] format(String[] arr) {
	    for (int i = 0; i < arr.length; i++)
	        arr[i] = chat(arr[i]);
	    return arr;
	}
}
