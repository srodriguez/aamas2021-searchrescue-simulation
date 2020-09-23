package io.sarl.hat.airsim.drones.behaviors.exploration;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

import io.sarl.hat.airsim.drones.Config;

class AreaTest {

	@Test
	void isInside_WithInsidePoint_OK() {
		Area area = new Area(0f, 0f, 10f, 10f, Priority.LOW);
		assertTrue(area.contains(0f, 0f));
		assertTrue(area.contains(0f, 5f));
		assertTrue(area.contains(5f, 5f));
		assertTrue(area.contains(10f, 10f));
	}

	@Test
	void show_Areas() {
		System.out.println("[");
		for (Area a : Config.getAreas()) {
			System.out.println("[" + a.getX() + "," + a.getY() + "],");
		}
		System.out.println("]");
	}

}
