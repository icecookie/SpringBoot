package com.ice.s3_4conditional;

import org.springframework.stereotype.Service;

@Service
public class LinuxListService implements ListService{

	public String showListCmd() {
		return "ls";
	}

}
