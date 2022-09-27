package com.gabinet.gabinet.roles;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Table(name = "roles")
@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;
    private String name;
}
