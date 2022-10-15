package com.mesutcalim.aop.stereotype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@BenimStereoType
@Data @AllArgsConstructor @NoArgsConstructor
public class stereoTypeBean {
    private Long id;
    private String name="Merhaba, benim adım name";
    private String trade;

}
