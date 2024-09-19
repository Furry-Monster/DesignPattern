package org.DesignPattern.Creat.StaticFactory;

import java.util.*;
import java.time.*;

public class LocalDateFactory {
    public static LocalDate fromInt(int yyyyMMdd) {
        return LocalDate.of(yyyyMMdd / 10000, (yyyyMMdd / 100) % 100, yyyyMMdd % 100);
    }
}
