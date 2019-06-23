package cn.itcast.user.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "users")
public class User {
    @Id /*主键*/
    @KeySql(useGeneratedKeys = true)  /*主键自增返回*/
    private Integer id;
    private String username;
    private String password;
}
