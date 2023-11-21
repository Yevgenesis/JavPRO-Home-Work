package de.telran.homeWork.hw_4.warehouse.interfaces;

public interface Storekeeper {
    void receiveGoods();
    void releaseGoods();
    void determinePlaceForGoods();
    void createTaskForPickingGoods();
    void createTaskForPlacingGoods();

}
