package com.qimu.jujiao.model.request;

import com.qimu.jujiao.common.PageRequest;
import lombok.Data;

/**
 * @Description:
 */
@Data
public class UserSearchRequest extends PageRequest {
    private static final long serialVersionUID = 5579195046213219475L;
    private String username;
}
