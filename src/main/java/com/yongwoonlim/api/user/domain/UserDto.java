package com.yongwoonlim.api.user.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Component
public class UserDto {
    @ApiModelProperty(position = 0)
    private long userId;

    @ApiModelProperty(position = 1)
    private String username;

    @ApiModelProperty(position = 2)
    private String password;

    @ApiModelProperty(position = 3)
    private String name;

    @ApiModelProperty(position = 4)
    private String email;

    @ApiModelProperty(position = 5)
    private String regDate;

    @ApiModelProperty(position = 6)
    private String token;

    @ApiModelProperty(position = 7)
    private List<Role> role;
}
