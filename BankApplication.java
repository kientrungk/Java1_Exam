package java.exam;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        AccountBank account1 = new AccountBank();
        account1.setAccountNumber("1234567890");
        account1.setAccountHolderName("kien");
        account1.setBalance(1000.0);

        AccountBank account2 = new AccountBank();
        account2.setAccountNumber("0987654321");
        account2.setAccountHolderName("kien2");
        account2.setBalance(500.0);

        Scanner scanner = new Scanner(System.in);

        System.out.println("chào!");
        System.out.println("1. nạp thì bấm vào đây");
        System.out.println("2. rút đi ");
        System.out.println("3. chuyển tiền");
        System.out.print("nhập số rồi en tơ: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("nhập số tiền nạp: ");
                double depositAmount = scanner.nextDouble();
                account1.deposit(depositAmount);
                break;
            case 2:
                System.out.print("nhập số tiền rút: ");
                double withdrawalAmount = scanner.nextDouble();
                account1.withdraw(withdrawalAmount);
                break;
            case 3:
                System.out.print("nhập số tiền chuyển: ");
                double transferAmount = scanner.nextDouble();
                account1.transfer(account2, transferAmount);
                break;
            default:
                System.out.println("lựa chọn không hợp lệ");
        }

        System.out.println("hiển thị thông tin sau khi hành động : ");
        account1.displayAccountInfo();
        account2.displayAccountInfo();

        scanner.close();
    }

}
