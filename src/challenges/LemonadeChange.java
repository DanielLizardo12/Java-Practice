package challenges;

/**
 * @author Daniel
 * @Date 20/04/2023
 */

public class LemonadeChange {

    public static boolean lemonadeChange(int[] bills) {
        int fiveDollarBill = 0, tenDollarBill = 0;

        for (int bill : bills) {
            switch (bill) {
                case 5:
                    fiveDollarBill++;
                    break;

                case 10:
                    if (fiveDollarBill > 0) {
                        fiveDollarBill--;
                        tenDollarBill++;
                    } else {
                        return false;
                    }
                    break;

                case 20:
                    if (fiveDollarBill > 0 && tenDollarBill > 0) {
                        fiveDollarBill--;
                        tenDollarBill--;
                    } else if (fiveDollarBill > 2) {
                        fiveDollarBill -= 3;
                    } else {
                        return false;
                    }
                    break;

                default:
                    break;
            }
        }
        return true;
    }

}
