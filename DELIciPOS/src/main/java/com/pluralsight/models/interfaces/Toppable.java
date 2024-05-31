package com.pluralsight.models.interfaces;

import com.pluralsight.models.Topping;

public interface Toppable {
    void addTopping(Topping topping);
    void removeTopping(Topping topping);
}
