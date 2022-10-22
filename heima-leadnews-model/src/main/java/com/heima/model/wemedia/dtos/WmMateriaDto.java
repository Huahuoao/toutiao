package com.heima.model.wemedia.dtos;

import com.heima.model.common.dtos.PageRequestDto;
import lombok.Data;

/**
 * @作者 花火
 * @创建日期 2022/10/21 23:00
 */
@Data
public class  WmMateriaDto extends PageRequestDto {
    /**
     * 1 收藏
     * 2 未收藏
     */
    private Short isCollection;
}
