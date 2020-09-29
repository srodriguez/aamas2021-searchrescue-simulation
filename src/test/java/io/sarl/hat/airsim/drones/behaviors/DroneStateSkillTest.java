package io.sarl.hat.airsim.drones.behaviors;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.utbm.airsim.api.Vector3r;
import io.sarl.hat.airsim.drones.searchrescue.DroneStateSkill;

class DroneStateSkillTest {
	
	DroneStateSkill skill = new DroneStateSkill();
	
	@BeforeEach
	void setup() {
		skill.setPosition(new Vector3r(10, 10, 10));
	}
	

	@Test
	void isInPosition_SamePoint_True() {
		assertTrue(skill.isInPosition(new Vector3r(10f, 10f, 10f), 1f));
	}
	
	@Test
	void isInPosition_PointWithinErrorX_True() {
		assertTrue(skill.isInPosition(new Vector3r(10.3f, 10f, 10f), 1f));
	}
	
	@Test
	void isInPosition_PointWithinErrorY_True() {
		assertTrue(skill.isInPosition(new Vector3r(10f, 10.3f, 10f), 1f));
	}
	
	@Test
	void isInPosition_PointWithinErrorZ_True() {
		assertTrue(skill.isInPosition(new Vector3r(10f, 10f, 10.3f), 1f));
	}
	
	
	@Test
	void isInPosition_PointOutsideX_False() {
		assertFalse(skill.isInPosition(new Vector3r(12f, 10f, 10f), 1f));
	}
	
	@Test
	void isInPosition_PointOutsideY_False() {
		assertFalse(skill.isInPosition(new Vector3r(10f, 12f, 10f), 1f));
	}
	
	@Test
	void isInPosition_PointOutsideZ_False() {
		assertFalse(skill.isInPosition(new Vector3r(10f, 10f, 12f), 1f));
	}

}
