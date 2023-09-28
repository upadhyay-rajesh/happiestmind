package com.instagram.utility;

import java.util.Comparator;

import com.instagram.entity.InstagramUser;

public class SortByName implements Comparator<InstagramUser>{

	@Override
	public int compare(InstagramUser o1, InstagramUser o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
