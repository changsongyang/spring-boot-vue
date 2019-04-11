package com.timebusker.service;

import com.timebusker.model.FileImage;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @DESC:FileImageService
 * @author:timebusker
 * @date:2019/4/11
 */
public interface FileImageService {

    FileImage save(MultipartFile image);

    List<FileImage> getAll();

    FileImage getImage(String id);
}
