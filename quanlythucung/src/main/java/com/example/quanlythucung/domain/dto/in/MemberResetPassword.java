package com.example.quanlythucung.domain.dto.in;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class MemberResetPassword {
    @NotEmpty(message = "Tên đăng nhập không được để trống")
    private String userName;

    @NotEmpty(message = "Email không được để trống")
    private String email;
}
