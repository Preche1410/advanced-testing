package com.precheflorian.advancedtesting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class HamcrestTest {
    List<Integer> numbers = Arrays.asList(12,15,45);
  @Test
    public void introduction(){
      assertThat(numbers,hasSize(3));
      assertThat(numbers, hasItem(12));
      assertThat("ABCD", startsWith("A"));
      assertThat("ABCD", endsWith("D"));
  }
}
