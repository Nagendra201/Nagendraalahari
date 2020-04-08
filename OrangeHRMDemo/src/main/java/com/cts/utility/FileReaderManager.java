package com.cts.utility;

public class FileReaderManager {

	
	 private static FileReaderManager fileReaderManager = new FileReaderManager();
	 private static ConfigfileReaderforCucumber configFileReader;

	 private FileReaderManager() {}

	 public static FileReaderManager getInstance() {
	  return fileReaderManager;
	 }

	 public ConfigfileReaderforCucumber getConfigReader() {
	  return (configFileReader == null) ? new ConfigfileReaderforCucumber() : configFileReader;
	 }
}
