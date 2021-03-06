package com.xlzhou.system.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: zxl
 * @Date: 2020/12/1  - 11:31
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataGridView {

    private Integer code = 0;
    private String msg;
    private Long count;
    private Object data;

    public DataGridView(Object data) {
        this.data = data;
    }

    public DataGridView(Long count, Object data) {
        this.count = count;
        this.data = data;
    }
}
