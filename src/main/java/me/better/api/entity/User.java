package me.better.api.entity;

import lombok.Data;
import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "user", schema = "me_better")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String first_name;
    private String last_name;
    private String email_address;
    private String password;
    private Date created_at;
    private Date updated_at;
    private Date deleted_at;
}
