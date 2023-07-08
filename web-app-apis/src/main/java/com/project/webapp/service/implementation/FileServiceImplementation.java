package com.project.webapp.service.implementation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.project.webapp.service.FileService;

@Service
public class FileServiceImplementation implements FileService{

	@Override
	public String uploadImage(String path, MultipartFile file) throws IOException {
		// FileName
		String name = file.getOriginalFilename();
		// Random file Id generator
		String randomId = UUID.randomUUID().toString();
		String fileName1 = randomId.concat(name.substring(name.lastIndexOf(".")));
		// Full path
		String filePath = path + File.separator + fileName1;
		// Create if the Folder does not exit
		File f = new File(path);
		if(!f.exists()) {
			f.mkdir();
		}
		// Copy the File
		Files.copy(file.getInputStream(), Paths.get(filePath));
		return fileName1;
	}

	@Override
	public InputStream getResource(String path, String fileName) throws FileNotFoundException {
		String fullPath = path + File.separator + fileName;
		InputStream is = new FileInputStream(fullPath);
		// DB logic to return Input stream
		return is;
	}
	
}
