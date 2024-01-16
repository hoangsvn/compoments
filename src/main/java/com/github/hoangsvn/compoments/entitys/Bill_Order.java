package com.github.hoangsvn.compoments.entitys;


import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bill_Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long user_id;

    private Long amount;

    private String  orderinfo;

    private boolean status;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
