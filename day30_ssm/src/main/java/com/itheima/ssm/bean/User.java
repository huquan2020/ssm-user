package com.itheima.ssm.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

        private String number;
        private String name;
        private String password;
        private String mobile;
        private String qq;
        private String email;
}
