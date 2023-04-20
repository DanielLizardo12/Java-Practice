package challenges;

/**
 * @author Daniel
 * @Date 20/04/2023
 */

public class LemonadeChange {

    public static boolean lemonadeChange(int[] bills) {
        int fiveDollarBill = 0, tenDollarBill = 0;

        for (int bill : bills) {
            if (bill == 5) fiveDollarBill++;

            if (bill == 10) {
                if (fiveDollarBill > 0) {
                    fiveDollarBill--;
                    tenDollarBill++;
                } else {
                    return false;
                }
            }

            if (bill == 20) {
                if (fiveDollarBill > 0 && tenDollarBill > 0) {
                    fiveDollarBill--;
                    tenDollarBill--;
                } else if (fiveDollarBill > 2 && tenDollarBill == 0){
                    fiveDollarBill -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
