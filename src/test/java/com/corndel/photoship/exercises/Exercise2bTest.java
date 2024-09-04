package com.corndel.photoship.exercises;

import static com.corndel.photoship.exercises.Exercise2b.convertFilesizes;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Exercise2bTest {

  // should convert an array of file sizes from KB to MB
  @Test
  void works() {
    assertArrayEquals(
        convertFilesizes(new double[] {1400, 500, 2100}), new double[] {1.4, 0.5, 2.1});
  }

  // should handle an empty array
  @Test
  void handlesEmptyArray() {
    assertArrayEquals(convertFilesizes(new double[] {}), new double[] {});
  }

  // should handle arrays with a single element
  @Test
  void handleArraysWithSingleElement() {
    assertArrayEquals(convertFilesizes(new double[] {1000}), new double[] {1});
  }

  // should handle arrays with large numbers
  @Test
  void handlesBigNumbers() {
    assertArrayEquals(convertFilesizes(new double[] {1000000, 500000}), new double[] {1000, 500});
  }

  // should handle arrays with small numbers
  @Test
  void handlesSmallNumbers() {
    assertArrayEquals(convertFilesizes(new double[] {10, 50}), new double[] {0.01, 0.05});
  }
}
