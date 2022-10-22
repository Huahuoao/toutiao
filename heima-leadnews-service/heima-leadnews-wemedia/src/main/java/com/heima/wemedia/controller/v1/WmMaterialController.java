package com.heima.wemedia.controller.v1;

import com.heima.file.service.FileStorageService;
import com.heima.model.common.dtos.ResponseResult;

import com.heima.model.common.enums.AppHttpCodeEnum;
import com.heima.model.wemedia.dtos.WmMateriaDto;
import com.heima.model.wemedia.pojos.WmMaterial;
import com.heima.wemedia.service.WmMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/material")
public class WmMaterialController {

    @Autowired
    private WmMaterialService wmMaterialService;
@Autowired
   private FileStorageService fileStorageService;

    @PostMapping("/upload_picture")
    public ResponseResult uploadPicture(MultipartFile multipartFile) throws IOException {
        return wmMaterialService.uploadPicture(multipartFile);


    }
    @PostMapping("list")
public ResponseResult findList(@RequestBody WmMateriaDto dto){

       return wmMaterialService.findList(dto);
}

    @GetMapping("/del_picture/{id}")
    public ResponseResult deletePicture( @PathVariable("id") Integer id) throws IOException {
        WmMaterial wmMaterial;
        wmMaterial=wmMaterialService.getById(id);
        String url = wmMaterial.getUrl();
        fileStorageService.delete(url);
        wmMaterialService.removeById(id);
        return ResponseResult.okResult(AppHttpCodeEnum.SUCCESS);
    }
}
