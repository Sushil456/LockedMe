package com.LockedMe;

import java.io.File;
import java.io.IOException;
import java.util.TreeSet;


public class FileHandlingOperations {


	public String createfile(String filename) {
	String folder="C:\\Users\\suskuma4\\eclipse-workspace\\LockedMe\\src\\com\\LockedMe\\JavaAssessment";
	File f= new File(folder,filename);
	try {
	boolean result=f.createNewFile();
	if(result)
	return "Successfully created";
	else
	return "failed to create file";
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	return "failed to create";
	}
	public String deletefile(String filename) {
	String folder="C:\\Users\\suskuma4\\eclipse-workspace\\LockedMe\\src\\com\\LockedMe\\JavaAssessment";
	File f= new File(folder,filename);
	try {
	boolean result=f.delete();
	if(result)
	return "Deleted successfully";
	else
	return "File Not Found";
	}catch(Exception e) {
	e.printStackTrace();
	}
	return "File Not Found";
	}
	public TreeSet<String> ascendingorder(){
	TreeSet<String> filenames=new TreeSet<String>();
	String directpath="C:\\Users\\suskuma4\\eclipse-workspace\\LockedMe\\src\\com\\LockedMe\\JavaAssessment";
	File dirmain=new File(directpath);
	File filesarr[]=null;
	if(dirmain.exists() && dirmain.isDirectory()) {
	filesarr=dirmain.listFiles();
	for(File f: filesarr) {
		filenames.add(f.getName());
		}
	}
	return filenames;
	}
	public boolean search(String filename) {
	TreeSet<String> filenames=this.ascendingorder();
	for(String i: filenames) {
	if(i.equals(filename))
	return true;
	}
	return false; 
	}
	}


