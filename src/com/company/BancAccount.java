package com.company;

public class BancAccount extends Exception {
    double amount;

    public BancAccount(){
        amount = 0;
    }
    double getAmount(){
        return amount;
    }
    void deposit(double sum){
        amount += sum;
    }
    void withDraw(int sum) throws LimitException{
        if (sum> amount){
            throw new LimitException(" Запрашиваемая сумма больше чем остаток ", sum);

        }
         amount -= sum;
        System.out.println("Снимаем " + sum + " сом ");
    }

}
