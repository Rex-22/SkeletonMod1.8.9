package Rex_22.skeletonmod.items;

import net.minecraft.item.Item;

public class ItemBase extends Item {

    @Override
    public String getUnlocalizedName() {
        String blockName = getUnwrappedUnlocalizedName(super.getUnlocalizedName());

        String test = String.format("tile.%s", blockName);
        return test.toLowerCase();
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
