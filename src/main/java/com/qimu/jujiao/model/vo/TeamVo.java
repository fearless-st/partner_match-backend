package com.qimu.jujiao.model.vo;

import com.qimu.jujiao.model.entity.User;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @Description:
 */
@Data
public class TeamVo implements Serializable {

    private static final long serialVersionUID = 8860605873381253366L;

    private Long id;

    private String teamName;

    private String teamAvatarUrl;

    private String teamPassword;

    private String teamDesc;

    private Integer maxNum;

    private Date expireTime;

    private Integer teamStatus;

    private Date createTime;

    private String announce;

    private User user;

    private Set<User> userSet;
}
