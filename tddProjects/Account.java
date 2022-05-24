package tddProjects;

public class Account {
     private String name;
     private double balance;

     public Account(String name, double balance) {   // Constructor with two parameters
          this.name = name;

          if (balance > 0.0) {
               this.balance = balance;
          }
     }


     public void depositMoney(double depositAmount){
      if (depositAmount > 0.0) {
           balance = balance + depositAmount;
      }
     }
     public String getName() {
          return name;
     }

     public void setName(String newName) {
          name = newName;
     }

     public void withdrawMoney(double withdrawalAmount) {
           if (withdrawalAmount > 0.0) {
                balance = balance - withdrawalAmount;
           }
     }

     public double getBalance() {

          return balance;
     }
     // public static void displayAccount(Account accountToDisplay) {
       //   System.out.println();

     //}



}
