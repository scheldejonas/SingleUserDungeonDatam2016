package singleuserdungeon.model.item;

import java.io.Serializable;
import singleuserdungeon.interfaces.IItem;

/**
 *
 * @author misk
 */
public class BaseItem implements IItem,Serializable {
    
    private String name;
    private String description;
    private int goldValue;
    private int damageValue;
    private int damageIncreaseValue;
    private int shieldValue;
    private int shieldIncreaseValue;

    public BaseItem(String name, String description, int goldValue, int damageIncreaseValue, int shieldIncreaseValue) {
        this.name = name;
        this.description = description;
        this.goldValue = goldValue;
        this.damageValue = damageIncreaseValue;
        this.shieldValue = shieldIncreaseValue;
    }
    
    public void SetShieldIncreaseValue(int i) {
        shieldIncreaseValue = i;
    }
    
    public void SetDamageIncreaseValue(int i) {
        damageIncreaseValue = i;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getGoldValue() {
        return goldValue;
    }

    @Override
    public int getDamageIncreaseValue() {
        return damageIncreaseValue;
    }

    @Override
    public int getShieldIncreaseValue() {
        return shieldIncreaseValue;
    }
    
    public int getDamageValue()
    {
        return damageValue+getDamageIncreaseValue();
    }
    
    public int getShieldValue()
    {
        return shieldValue+getShieldIncreaseValue();
    }

    @Override
    public String toString() {
        return "BaseItem " + "_name=" + name + "_description=" + description + "_goldValue=" + goldValue + "_damageIncreaseValue=" + damageIncreaseValue + "_shieldIncreaseValue=" + shieldIncreaseValue + "\n";
    }
    
}
