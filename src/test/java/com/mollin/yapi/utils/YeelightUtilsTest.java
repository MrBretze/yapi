package com.mollin.yapi.utils;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class YeelightUtilsTest {
    public Object[] parametersForClampTest() {
        return new Object[][] {
                {0, 0, 0, 0},
                {300, 0, 255, 255},
                {-42, 0, 255, 0},
                {200, 0, 255, 200},
                {42, 21, 21, 21}
        };
    }

    @Test
    @Parameters
    public void clampTest(int value, int min, int max, int expectedValue) {
        assertThat(YeelightUtils.clamp(value, min, max)).isEqualTo(expectedValue);
    }
}
