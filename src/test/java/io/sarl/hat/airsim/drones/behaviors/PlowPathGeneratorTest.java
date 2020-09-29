package io.sarl.hat.airsim.drones.behaviors;

import static io.sarl.hat.airsim.drones.searchrescue.Priority.LOW;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import fr.utbm.airsim.api.Vector3r;
import io.sarl.hat.airsim.drones.Config;
import io.sarl.hat.airsim.drones.searchrescue.Area;

class PlowPathGeneratorTest {

	@Test
	void generatePath() {
		Area a = new Area(0f,0f,20f,20f,LOW);
		
		
		float z = Config.getFlyAltitude();
		Vector3r[] expected = new Vector3r[] {
				new Vector3r(0,0,z),
				new Vector3r(0,5,z),
				new Vector3r(0,10,z),
				new Vector3r(0,15,z),
				new Vector3r(0,20,z),
				new Vector3r(5,0,z),
				new Vector3r(5,5,z),
				new Vector3r(5,10,z),
				new Vector3r(5,15,z),
				new Vector3r(5,20,z),
				new Vector3r(10,0,z),
				new Vector3r(10,5,z),
				new Vector3r(10,10,z),
				new Vector3r(10,15,z),
				new Vector3r(10,20,z),
				new Vector3r(15,0,z),
				new Vector3r(15,5,z),
				new Vector3r(15,10,z),
				new Vector3r(15,15,z),
				new Vector3r(15,20,z),
				new Vector3r(20,0,z),
				new Vector3r(20,5,z),
				new Vector3r(20,10,z),
				new Vector3r(20,15,z),
				new Vector3r(20,20,z),
				
				
		};
		Vector3r[] path = PlowPathGenerator.generatePath(a,z);
		for (Vector3r vector3r : path) {
			System.out.println(vector3r);	
		}
		
		
		assertArrayEquals(expected, path);
	}

}
