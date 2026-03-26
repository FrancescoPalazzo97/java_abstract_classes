package org.lessons.java.interfaces;

public interface Truckable {
    float getShippableWeight();
    float getShippableLength();
    float getShippableWidth();
    float getShippableHeight();
    boolean isFragile();
    boolean isWheeled();
}
