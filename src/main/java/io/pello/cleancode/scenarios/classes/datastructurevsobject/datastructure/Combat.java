package io.pello.cleancode.scenarios.classes.datastructurevsobject.datastructure;

public class Combat {
	public int atttack(Object character) {
		if (character instanceof Orc) {
			Orc orc = (Orc)character;
			return orc.getWeight() * orc.getWeaponSize();
		} else if (character instanceof Elf) {
			Elf elf = (Elf)character;
			return (elf.getIntelligence() + elf.getSpeed()) * 2;
		} else if (character instanceof Dwarf) {
			Dwarf dwarf = (Dwarf)character;
			return dwarf.getStrength() - (dwarf.getArmor()/2);
		}
		return 0;
	}
}
