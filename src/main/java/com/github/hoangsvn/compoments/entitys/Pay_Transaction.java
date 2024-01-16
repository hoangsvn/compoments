package com.github.hoangsvn.compoments.entitys;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Builder
@Setter
@Getter
@Entity
@Data
@Table(name = "pay_transaction")
@NoArgsConstructor
@AllArgsConstructor
public class Pay_Transaction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long user_id;

    private String Amount;
    private String BankCode;
    private String BankTranNo;
    private String CardType;
    private String OrderInfo;
    private String PayDate;
    private String ResponseCode;
    private String TmnCode;
    private String TransactionNo;
    private String TransactionStatus;
    private String TxnRef;
    private String securehash;


}
