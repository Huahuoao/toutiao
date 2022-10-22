package com.heima.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.wemedia.dtos.WmMateriaDto;
import com.heima.model.wemedia.pojos.WmMaterial;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface WmMaterialService extends IService<WmMaterial> {
    // 图片上传
    public ResponseResult uploadPicture(MultipartFile multipartFile) throws IOException;

    //素材列表查询
    public ResponseResult findList(@RequestBody WmMateriaDto dto);
}

