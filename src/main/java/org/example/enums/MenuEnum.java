package org.example.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.stragety.CreateCustomerStrategy;
import org.example.stragety.MenuStrategy;

@Getter
@RequiredArgsConstructor

public enum MenuEnum {
    CREATE_CUSTOMER(1,"Create Customer", new CreateCustomerStrategy());
//    REMOVE_CUSTOMER(2, "Remove Customer"),
//    UPDATE_CUSTOMER(3, "Update Customer"),
//    SHOW_ALL_CUSTOMER(4, "Show All Customer"),
//    CREATE_CARD(5, "Create Card"),
//    UPDATE_CARD(6, "Update Card"),
//    BLOCK_CARD(7, "Block Card" ),
//    UNBLOCK_CARD(8, "Unblock Card"),
//    CARD_TO_CARD(9, "Transfer Money"),
//    SHOW_ALL_CARD(10, "Show All Card"),
//    SHOW_TRANSACTION_BY_NO(11, "Find Transaction By Transaction Number"),
//    SHOW_ALL_CUSTOMER_TRANSACTIONS(12, "Show All Customer Transactions");

    private final int value;
    private final String description;
    private final MenuStrategy strategy;

    MenuEnum(int value, String description, MenuStrategy strategy) {
        this.value = value;
        this.description = description;
        this.strategy = strategy;
    }
    public static MenuEnum getEnumByValue(int value){
        for (MenuEnum menuEnum : MenuEnum.values()){
            if(menuEnum.getValue()==value){
                return menuEnum;
            }
        }
        throw new IllegalArgumentException("Invalid option : "+value);
    }

    private int getValue() {
        return 0;
    }

    public MenuStrategy getStrategy() {
        return null;
    }
}
