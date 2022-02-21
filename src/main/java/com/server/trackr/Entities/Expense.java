package com.server.trackr.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "EXPENSES")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Expense {

    @Id
    @Column(name = "EXPENSE_ID")
    private Integer expenseID;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "EXPENSE_AMOUNT")
    private Double amount;

    @Column(name = "TRACKED_ITEM_DATE")
    private Date date;

    //@Column(name = "ITEM_CATEGORY")
    //private String category; USER WILL INPUT THE CATEGORY INTO FORM OR I DISPLAY LIST OF COMMON CATEGORIES OF THE ITEM

    //@Columm(name="POINT_OF_SALE")
    //private String pos; USER WILL INPUT WHERE THEY GOT THE ITEM THEY TRACKED

}
