package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
	BancAccount bancAccount = new BancAccount();
	bancAccount.deposit(10000);
	while (true){
	    try {
            System.out.println(" Баланс " + bancAccount.getAmount());
            bancAccount.withDraw(6000);


        } catch (LimitException e) {
            System.out.println(e.getMessage());
            bancAccount.withDraw((int) bancAccount.getAmount());
            System.out.println("Баланс " + bancAccount.getAmount() + "сом ");
            break;

        }
    }
    }
}
