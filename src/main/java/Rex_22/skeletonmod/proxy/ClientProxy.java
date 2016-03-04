package Rex_22.skeletonmod.proxy;

import Rex_22.skeletonmod.blocks.Blocks;
import Rex_22.skeletonmod.items.Items;
import Rex_22.skeletonmod.reference.LogHelper;
import Rex_22.skeletonmod.reference.ModInfo;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerBlocks() {
        super.registerBlocks();
            for (Blocks b : Blocks.values()) {
                Item block = Item.getItemFromBlock(b.block);
                ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation(ModInfo.MOD_ID + ":" + b.getInternalName(), "inventory"));
                LogHelper.info("Registered Block Renderer: " + b.getInternalName());
            }
    }

    @Override
    public void registerItems() {
        super.registerItems();
        for (Items i : Items.values()) {
            ModelLoader.setCustomModelResourceLocation(i.item, 0, new ModelResourceLocation(ModInfo.MOD_ID + ":" + i.getInternalName(), "inventory"));
            LogHelper.info("Registered Item Renderer: " + i.getInternalName());
        }
    }
}
