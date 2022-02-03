package com.hrm.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author AsheOne
 * @date 2022/2/1
 * Used in return the paginated results.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult<T> {
    private Long total; //
    private List<T> rows;
}
