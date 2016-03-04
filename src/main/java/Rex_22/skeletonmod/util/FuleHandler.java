package Rex_22.skeletonmod.util;

import Rex_22.skeletonmod.blocks.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuleHandler implements IFuelHandler {
    @Override
    public int getBurnTime(ItemStack fuel) {
        if (fuel.isItemEqual(new ItemStack(Blocks.EXAMPLE_BLOCK.block))) {
            return 16000;
        }

        return 0;
    }
}
