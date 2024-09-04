package com.corndel.photoship.exercises;

import static com.corndel.photoship.exercises.Exercise1b.getMiddle;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Exercise1bTest {

  // should return middle elements of a multi-element array
  @Test
  void middleMultiple() {
    assertArrayEquals(
        getMiddle(new ArrayList<>(List.of(4, 6, 1, 7, 9))).toArray(), new Integer[] {6, 1, 7});
  }

  // should return a single middle element for an array of three elements
  @Test
  void middleSingle() {
    assertArrayEquals(getMiddle(new ArrayList<>(List.of(2, 3, 4))).toArray(), new Integer[] {3});
  }

  // should return an empty array for a two-element array
  @Test
  void noMiddle() {
    assertArrayEquals(getMiddle(new ArrayList<>(List.of(1, 2))).toArray(), new Integer[] {});
  }
}
