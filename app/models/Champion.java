package models;
import java.util.ArrayList;
import java.util.*;

public class Champion {
	// members
	private ArrayList<Item> inventory = new ArrayList<>();
	
	// base stats
	// Offensive
	private String name;
	private double ad;	// attack damage
	private double as;	// attack speed
	private double csc;	// critical strike chance
	private double ls;	// lifesteal
	
	// Magical
	private double mana;		 
	private double manaRegen; 	// Mana regeneration
	private double ap;			// ability power
	private double cr;			// cooldownreduction
	
	// Defensive
	private double health;	
	private double hr;			// health regeneration
	private double armor;
	private double magicResist;	// magic resistance
	
	// Other
	private int level;
	private double ms;			// movement speed
	
	private double healthGPL;	// GPL = growth per level
	private double manaGPL;
	private double adGPL;		// attack damage
	private double asGPL;		// attack speed
	private double msGPL;		// movement speed
	private double hrGPL;		// health regen
	private double manaRegenGPL;		// mana regen
	private double armorGPL;		
	private double magicResistGPL; // 
	
	
	public Champion(String name, int level, double ad, double as, double csc, double ls, double mana, double manaRegen, double ap, double cr,
			double health, double hr, double armor, double magicResist, double ms, double healthGPL, double manaGPL, double adGPL, double asGPL,
			double msGPL, double hrGPL, double manaRegenGPL, double armorGPL, double magicResistGPL){
		// initialize stuff
		this.name = name;
		this.level = level;
		this.ad = ad + (adGPL * (level-1));
		this.as = as + (asGPL * (level-1));
		this.csc = csc;
		this.ls = ls;
		this.mana = mana + (manaGPL * (level-1));
		this.manaRegen = manaRegen + (manaRegenGPL * (level-1));
		this.ap = ap;
		this.cr = cr;
		this.health = health + (healthGPL * (level-1));
		this.hr = hr + (hrGPL * (level-1));
		this.armor = armor + (armorGPL * (level-1));
		this.magicResist = magicResist + (magicResistGPL * (level-1));
		this.ms = ms + (msGPL * (level-1));
		
		
		this.healthGPL = healthGPL;
		this.manaGPL = manaGPL;
		this.adGPL = adGPL;
		this.asGPL = asGPL;
		this.msGPL = msGPL;
		this.hrGPL = hrGPL;
		this.manaRegenGPL = manaRegenGPL;
		this.armorGPL = armorGPL;
		this.magicResistGPL = magicResistGPL;
		
	}
	
	// methods
	
	void setLevel(int level){
		this.level = level;
	}
	
	// methods (getters)
	public String getName(){
		return name;
	}
	
	public double getAd(){
		return ad;
	}
	
	public double getAs(){
		return as;
	}
	
	public double getCsc(){
		return csc;
	}
	
	public double getLs(){
		return ls;
	}
	
	public double getMana(){
		return mana;
	}
	
	public double getManaRegen(){
		return manaRegen;
	}
	
	public double getAp(){
		return ap;
	}
	
	public double getCr(){
		return cr;
	}
	
	public double getHealth(){
		return health;
	}
	
	public double getHr(){
		return hr;
	}
	
	public double getArmor(){
		return armor;
	}
	
	public double getMagicResist(){
		return magicResist;
	}

	public ArrayList<Item> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}
}


