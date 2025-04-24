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

public class ChristmasLights {
private int rows = 1000;
private int columns = 1000;
private boolean[][] lights = new boolean[rows][columns];
private int totalLights = 0;
	public int TurnOnAllLights() {
		if (totalLights < 1000000) {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					if (!lights[i][j]){
						lights[i][j] = true;
						totalLights++;
					}
				}
			}
		}
		return totalLights;
	}
	public int ToggleFirst1000Lights(int startRow, int startColumn, int endRow, int endColumn) {
		for (int i = startRow; i <= endRow; i++) {
			for (int j = startColumn; j <= endColumn; j++) {
				if (lights[i][j]) {
					totalLights--;
				} else {
					totalLights++;
				}
				lights[i][j] = !lights[i][j];
			}
		}
		return totalLights;
	}
	public int TurnonFirstHalfofLights(int startRow, int startColumn, int endRow, int endColumn) {
		for (int i = startRow; i <= endRow; i++) {
			for (int j = startColumn; j <= endColumn; j++) {
				if (!lights[i][j]) {
					lights[i][j] = true;
					totalLights++;
				}
			}
		}
		return totalLights;
	}
}
