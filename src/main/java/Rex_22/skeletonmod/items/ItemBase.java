package Rex_22.skeletonmod.items;

import Rex_22.skeletonmod.reference.ModInfo;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    @Override
    public String getUnlocalizedName() {
        String blockName = getUnwrappedUnlocalizedName(super.getUnlocalizedName());

        String test = String.format("item.%s.%s", ModInfo.MOD_ID, blockName);
        return test;
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(":") + 1);
    }
}
