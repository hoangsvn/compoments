package com.github.hoangsvn.compoments.entitys;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Setter
@Getter
@Entity
@Data
@Table(name = "bill")
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long user_id;

    private Long amount;

    private String  orderinfo;

    private boolean status=false;
}
