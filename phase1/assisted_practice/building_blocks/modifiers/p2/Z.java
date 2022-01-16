package phase1.assisted_practice.building_blocks.modifiers.p2;

import phase1.assisted_practice.building_blocks.modifiers.p1.M;
import phase1.assisted_practice.building_blocks.modifiers.p1.N;
import phase1.assisted_practice.building_blocks.modifiers.p1.P;

public class Z extends M {

	public static void main(String[] args) {
		M objZ = new M();
		objZ.publicMethod();
		
		N objN = new N();
		objN.publicMethod();
		
		P objP = new P();
		objP.publicMethod();
		
		X objX = new X();
		System.out.println("long variable of class X: " +objX.longVar);
		System.out.println("float variable of class X:" + objX.floatVar);
		System.out.println("char variable of class X:" + objX.charVar);
		
	}
}
