/*
 *  Copyright (c) 2014-2017 Kumuluz and/or its affiliates
 *  and other contributors as indicated by the @author tags and
 *  the contributor list.
 *
 *  Licensed under the MIT License (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  https://opensource.org/licenses/MIT
 *
 *  The software is provided "AS IS", WITHOUT WARRANTY OF ANY KIND, express or
 *  implied, including but not limited to the warranties of merchantability,
 *  fitness for a particular purpose and noninfringement. in no event shall the
 *  authors or copyright holders be liable for any claim, damages or other
 *  liability, whether in an action of contract, tort or otherwise, arising from,
 *  out of or in connection with the software or the use or other dealings in the
 *  software. See the License for the specific language governing permissions and
 *  limitations under the License.
*/
package com.kumuluz.ee.discount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {
    private static List<Discount> discounts = new ArrayList<>(
            Arrays.asList(
                    new Discount("1", "KODAZAPOPUST25", "25% popust", 0.25f, true),
                    new Discount("2", "KODAZAPOPUST50", "50% popust", 0.50f, false),
                    new Discount("3", "RSOpODKUPnINA", "90% popust", 0.90f, true),
                    new Discount("4", "QQWESADFASD", "Cirkus", 0.123f, true),
                    new Discount("5", "asdfsdfdfgdf", "Mini popust 0%", 0.00f, true)
            )
    );



    public static List<Discount> getDiscounts() {
        return discounts;
    }

    public static Discount getDiscount(String id) {

        for (Discount discount : discounts) {
            if (discount.getId().equals(id))
                return discount;
        }

        return null;
    }


    public static void addDiscount(Discount discount) {
        discounts.add(discount);
    }

    public static void deleteDiscount(String id) {
        for (Discount discount : discounts) {
            if (discount.getId().equals(id)) {
                discounts.remove(discount);
                break;
            }
        }
    }

    public static boolean setValid(String id, boolean valid) {
        for (Discount discount : discounts) {
            if (discount.getId().equals(id)) {
                discount.setValid(valid);
                return  true;
            }
        }
        return false;
    }
}
