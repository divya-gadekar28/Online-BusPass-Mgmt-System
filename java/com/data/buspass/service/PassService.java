package com.data.buspass.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.data.buspass.filemetadata.FileMetaData;
import com.data.buspass.filemetadatarepo.FileMetadataRepository;
import com.data.buspass.model.StudentData;
import com.data.buspass.model.UserData;
import com.data.buspass.repo.StudentRepository;
import com.data.buspass.repo.UserRepository;


@Service
public class PassService {

	@Autowired
	private UserRepository uRepo;

	public void save(UserData user) {
		uRepo.save(user);
	}

	@Autowired
	private StudentRepository sRepo;

	public void save(StudentData studentData) {
		sRepo.save(studentData);
	}

	private static final String UPLOAD_DIR = "uploads";
	@Autowired
	private FileMetadataRepository fRepo;

	public void saveFile(MultipartFile file) {
		try {
			// Create directory if not exists
			File uploadDir = new File(UPLOAD_DIR);
			if (!uploadDir.exists()) {
				uploadDir.mkdir();
			}

			// Save file
			if (file != null && !file.isEmpty()) {
				String fileName = file.getOriginalFilename();
				file.transferTo(new File(uploadDir.getAbsolutePath() + File.separator + fileName));

				// Save file metadata to database
				FileMetaData uploadFile = new FileMetaData();
				uploadFile.setFileName(fileName);
				fRepo.save(uploadFile);
			}
		} catch (IOException e) {
			e.printStackTrace(); // Handle exception properly based on your application's requirement
		}
	}
}
