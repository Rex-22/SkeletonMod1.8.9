package Rex_22.skeletonmod.items;

import net.minecraft.item.Item;

public class ItemBase extends Item {
    @Override
    public String getUnlocalizedName() {
        String blockName = getUnwrappedUnlocalizedName(super.getUnlocalizedName());

        String test = String.format("item.%s", blockName);
        return test.toLowerCase();
    }

    public String getRenderName(){
        return getUnlocalizedName().substring(5);
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(":") + 1);
    }
}
