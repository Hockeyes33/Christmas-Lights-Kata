/*
 * Copyright 2015-2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ChristmasLightsTest {

	@Test
	@DisplayName("all lights on")
	void TestTurnOnAllLights() {
		ChristmasLights christmasLights = new ChristmasLights();
		assertEquals(1000000, christmasLights.TurnOnAllLights(), "all lights on");
	}
	@Test
	@DisplayName("Toggle first 1000 lights")
	void TestToggleFirst1000Lights() {
		ChristmasLights christmasLights = new ChristmasLights();
		assertEquals(1000, christmasLights.ToggleFirst1000Lights(0,0,999,0), "Toggle first 1000 lights");
	}
	@Test
	@DisplayName("Toggle first half of lights")
	void TestTurnonFirstHalfofLights() {
		ChristmasLights christmasLights = new ChristmasLights();
		assertEquals(500000, christmasLights.TurnonFirstHalfofLights(0,0,499,999), "Toggle first half of lights again");
	}
	@Test
    public void TestOutOfArrayException() throws Exception {
		ChristmasLights christmasLights = new ChristmasLights();
        assertThrows(ChristmasLights.OutOfArrayExeption.class, 
            () -> {christmasLights.ToggleLights(0,0,1500,1200);},
            "Turn on lights out of array bounds should throw exception" 
            );
    }
}
