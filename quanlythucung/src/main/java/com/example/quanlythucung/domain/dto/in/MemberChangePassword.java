package com.example.quanlythucung.domain.dto.in;

import com.example.quanlythucung.domain.common.validator.PasswordAdvanceConstraint;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
public class MemberChangePassword {

    @NotEmpty(message = "Mật khẩu cũ không được để trống")
    @Size(min = 8, max = 36, message = "Mật khẩu cũ phải từ 8-36 ký tự")
    @PasswordAdvanceConstraint(message = "Mật khẩu cũ phải chứa chữ hoa, chữ thường,số,ký tự đặc biệt")
    private String password;

    @NotEmpty(message = "Mật khẩu mới không được để trống")
    @Size(min = 8, max = 36, message = "Mật khẩu mới phải từ 8-36 ký tự")
    @PasswordAdvanceConstraint(message = "Mật khẩu mới phải chứa chữ hoa, chữ thường,số,ký tự đặc biệt")
    private String passwordNew;

    @NotEmpty(message = "Xác nhận mật khẩu không được để trống")
    @Size(min = 8, max = 36, message = "Xác nhận mật khẩu phải từ 8-36 ký tự")
    @PasswordAdvanceConstraint(message = "Xác nhận mật khẩu phải chứa chữ hoa, chữ thường,số,ký tự đặc biệt")
    private String passwordConfirm;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordNew() {
        return passwordNew;
    }

    public void setPasswordNew(String passwordNew) {
        this.passwordNew = passwordNew;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }


}
