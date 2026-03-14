import java.util.*;

public class SplitwiseSettlement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        HashMap<String, Double> paid = new HashMap<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.nextLine();
            paid.put(names[i], 0.0);
        }

        System.out.print("Enter number of expenses: ");
        int e = sc.nextInt();
        sc.nextLine();

        double total = 0;

        for (int i = 0; i < e; i++) {

            System.out.println("\nExpense " + (i + 1));

            System.out.print("Who paid: ");
            String payer = sc.nextLine();

            System.out.print("Amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            paid.put(payer, paid.get(payer) + amount);

            total += amount;
        }

        double share = total / n;

        System.out.println("\nEach person should pay: " + share);

        HashMap<String, Double> balance = new HashMap<>();

        for (String name : names) {
            balance.put(name, paid.get(name) - share);
        }

        System.out.println("\nSettlement:");

        settle(balance);
    }

    public static void settle(HashMap<String, Double> balance) {

        while (true) {

            String creditor = null;
            String debtor = null;

            double max = 0;
            double min = 0;

            for (String p : balance.keySet()) {

                double val = balance.get(p);

                if (val > max) {
                    max = val;
                    creditor = p;
                }

                if (val < min) {
                    min = val;
                    debtor = p;
                }
            }

            if (max == 0 && min == 0)
                break;

            double amount = Math.min(max, -min);

            System.out.println(debtor + " needs to pay " + creditor + " : " + amount);

            balance.put(creditor, max - amount);
            balance.put(debtor, min + amount);
        }
    }
}