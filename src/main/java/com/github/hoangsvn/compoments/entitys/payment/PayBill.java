package com.github.hoangsvn.compoments.entitys.payment;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Builder
@Setter
@Getter
@Entity
@Data
@Table(name = "service-payment-bill")
@NoArgsConstructor
@AllArgsConstructor
public class PayBill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String payid;

    private String payidinit;

    private Long userid;

    private Long  amount;

    private String requestid;

    private String extra;

    private String payinfo;

    private Date createat;

    @Column( columnDefinition = "boolean default false")
    private boolean status ;
}
