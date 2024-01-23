package com.github.hoangsvn.compoments.entitys.payment;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Builder
@Setter
@Getter
@Entity
@Data
@Table(name = "service-payment-paytransaction" ,uniqueConstraints = {@UniqueConstraint(columnNames = "pay_id")})
@NoArgsConstructor
@AllArgsConstructor
public class PayTransaction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   id;
    private String pay_id;
    private String pay_info;
    private String amount;

    private String type;
    private String bank;
    private String bank_code;
    private String message;

    private String card_type;
    private String date;
    private String partner_code;

    private String code;
    private String transaction;
    private String transaction_status;


    private String request_id;
    private String request_code;
    private String request_time;

    private String response_id;
    private String response_code;
    private String response_time;


    private String extra_data;
    private String signature;


}
